package kupangljp.domain;

import java.time.LocalDate;
import java.util.*;
import kupangljp.domain.*;
import kupangljp.infra.AbstractEvent;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class ProductIncreased extends AbstractEvent {

    private String productId;
    private String prductName;
    private Integer qty;

    public ProductIncreased(Product aggregate) {
        super(aggregate);
    }

    public ProductIncreased() {
        super();
    }
}
//>>> DDD / Domain Event
