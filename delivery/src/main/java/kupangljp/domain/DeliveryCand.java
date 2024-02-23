package kupangljp.domain;

import java.time.LocalDate;
import java.util.*;
import kupangljp.domain.*;
import kupangljp.infra.AbstractEvent;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class DeliveryCand extends AbstractEvent {

    private String deliveryId;
    private String orderId;
    private String status;

    public DeliveryCand(Delivery aggregate) {
        super(aggregate);
    }

    public DeliveryCand() {
        super();
    }
}
//>>> DDD / Domain Event
