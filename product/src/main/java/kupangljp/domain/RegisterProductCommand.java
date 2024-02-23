package kupangljp.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.Data;

@Data
public class RegisterProductCommand {

    private String prductName;
    private Integer qty;
}
