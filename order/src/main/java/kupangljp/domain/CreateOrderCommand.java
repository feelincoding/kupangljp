package kupangljp.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.Data;

@Data
public class CreateOrderCommand {

    private String userId;
    private String productName;
    private String status;
    private Integer qty;
}
