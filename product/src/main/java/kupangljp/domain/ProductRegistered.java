package kupangljp.domain;

import java.time.LocalDate;
import java.util.*;
import kupangljp.domain.*;
import kupangljp.infra.AbstractEvent;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class ProductRegistered extends AbstractEvent {

    private String productId;
    private String prductName;
    private Integer qty;

    public ProductRegistered(Product aggregate) {
        super(aggregate);
    }

    public ProductRegistered() {
        super();
    }
}
//>>> DDD / Domain Event
