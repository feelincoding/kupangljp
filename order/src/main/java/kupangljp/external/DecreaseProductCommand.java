package kupangljp.external;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Data
public class DecreaseProductCommand {

    @Id
    private String productId;

    private String prductName;
    private Integer qty;
}
