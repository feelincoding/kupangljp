package kupangljp.domain;

import java.time.LocalDate;
import java.util.*;
import kupangljp.domain.*;
import kupangljp.infra.AbstractEvent;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class PaymentCaptured extends AbstractEvent {

    private String paymentId;
    private String orderId;
    private Double amount;
    private String status;

    public PaymentCaptured(Payment aggregate) {
        super(aggregate);
    }

    public PaymentCaptured() {
        super();
    }
}
//>>> DDD / Domain Event
