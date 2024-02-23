package kupangljp.domain;

import java.util.*;
import kupangljp.domain.*;
import kupangljp.infra.AbstractEvent;
import lombok.*;

@Data
@ToString
public class DeliveryStarted extends AbstractEvent {

    private String deliveryId;
    private String orderId;
    private String status;
}
