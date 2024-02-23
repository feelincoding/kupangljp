package kupangljp.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.Data;

@Data
public class CapturePaymentCommand {

    private String paymentId;
    private String orderId;
    private Double amount;
    private String status;
}
