package kupangljp.domain;

import java.util.*;
import kupangljp.domain.*;
import kupangljp.infra.AbstractEvent;
import lombok.*;

@Data
@ToString
public class PaymentCaptured extends AbstractEvent {

    private String paymentId;
    private String orderId;
    private Double amount;
    private String status;
}
