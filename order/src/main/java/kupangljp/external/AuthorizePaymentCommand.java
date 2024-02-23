package kupangljp.external;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Data
public class AuthorizePaymentCommand {

    private String orderId;
    private Double amount;
    private String status;
}
