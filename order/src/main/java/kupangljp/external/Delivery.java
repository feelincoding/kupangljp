package kupangljp.external;

import java.util.Date;
import lombok.Data;

@Data
public class Delivery {

    private String deliveryId;
    private String orderId;
    private String status;
}
