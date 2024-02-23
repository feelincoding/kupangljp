package kupangljp.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.Data;

@Data
public class CancelOrderCommand {

    private String status;
    private String orderId;
    private String userId;
    private String productName;
    private Integer qty;
}
