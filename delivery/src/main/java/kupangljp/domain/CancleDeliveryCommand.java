package kupangljp.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.Data;

@Data
public class CancleDeliveryCommand {

    private String orderId;
    private String status;
    private String deliveryId;
}
