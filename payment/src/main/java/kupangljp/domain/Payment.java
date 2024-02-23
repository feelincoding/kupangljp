package kupangljp.domain;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import kupangljp.PaymentApplication;
import kupangljp.domain.PaymentAuthorized;
import lombok.Data;

@Entity
@Table(name = "Payment_table")
@Data
//<<< DDD / Aggregate Root
public class Payment {

    @Id
    private String paymentId;

    private String orderId;

    private Double amount;

    private String status;

    @PostPersist
    public void onPostPersist() {
        PaymentAuthorized paymentAuthorized = new PaymentAuthorized(this);
        paymentAuthorized.publishAfterCommit();
    }

    public static PaymentRepository repository() {
        PaymentRepository paymentRepository = PaymentApplication.applicationContext.getBean(
            PaymentRepository.class
        );
        return paymentRepository;
    }

    //<<< Clean Arch / Port Method
    public void capturePayment(CapturePaymentCommand capturePaymentCommand) {
        //implement business logic here:

        PaymentCaptured paymentCaptured = new PaymentCaptured(this);
        paymentCaptured.publishAfterCommit();
    }

    //>>> Clean Arch / Port Method
    //<<< Clean Arch / Port Method
    public void failPayment(FailPaymentCommand failPaymentCommand) {
        //implement business logic here:

        PaymentFailed paymentFailed = new PaymentFailed(this);
        paymentFailed.publishAfterCommit();
    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
