package kupangljp.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.Data;

@Data
public class AuthorizePaymentCommand {

    private String orderId;
    private Double amount;
    private String status;
}
