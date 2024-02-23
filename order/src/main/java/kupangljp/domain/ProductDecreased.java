package kupangljp.domain;

import java.util.*;
import kupangljp.domain.*;
import kupangljp.infra.AbstractEvent;
import lombok.*;

@Data
@ToString
public class ProductDecreased extends AbstractEvent {

    private String productId;
    private String prductName;
    private Integer qty;
}
