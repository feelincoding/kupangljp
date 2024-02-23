package kupangljp.external;

import java.util.Date;
import lombok.Data;

@Data
public class Payment {

    private String paymentId;
    private String orderId;
    private Double amount;
    private String status;
}
