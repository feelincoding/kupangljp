package kupangljp.external;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Data
public class CapturePaymentCommand {

    @Id
    private String paymentId;

    private String orderId;
    private Double amount;
    private String status;
}
