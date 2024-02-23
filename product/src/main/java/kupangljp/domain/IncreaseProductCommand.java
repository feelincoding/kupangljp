package kupangljp.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.Data;

@Data
public class IncreaseProductCommand {

    private String productId;
    private String prductName;
    private Integer qty;
}
