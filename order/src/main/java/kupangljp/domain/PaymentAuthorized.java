package kupangljp.domain;

import java.util.*;
import kupangljp.domain.*;
import kupangljp.infra.AbstractEvent;
import lombok.*;

@Data
@ToString
public class PaymentAuthorized extends AbstractEvent {

    private String paymentId;
    private String orderId;
    private Double amount;
    private String status;
}
