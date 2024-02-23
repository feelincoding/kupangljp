package kupangljp.domain;

import java.time.LocalDate;
import java.util.*;
import kupangljp.domain.*;
import kupangljp.infra.AbstractEvent;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class PaymentAuthorized extends AbstractEvent {

    private String paymentId;
    private String orderId;
    private Double amount;
    private String status;

    public PaymentAuthorized(Payment aggregate) {
        super(aggregate);
    }

    public PaymentAuthorized() {
        super();
    }
}
//>>> DDD / Domain Event
