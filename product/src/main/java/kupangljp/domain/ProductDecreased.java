package kupangljp.domain;

import java.time.LocalDate;
import java.util.*;
import kupangljp.domain.*;
import kupangljp.infra.AbstractEvent;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class ProductDecreased extends AbstractEvent {

    private String productId;
    private String prductName;
    private Integer qty;

    public ProductDecreased(Product aggregate) {
        super(aggregate);
    }

    public ProductDecreased() {
        super();
    }
}
//>>> DDD / Domain Event
