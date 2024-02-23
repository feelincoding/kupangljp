package kupangljp.domain;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import kupangljp.ProductApplication;
import kupangljp.domain.ProductRegistered;
import lombok.Data;

@Entity
@Table(name = "Product_table")
@Data
//<<< DDD / Aggregate Root
public class Product {

    @Id
    private String productId;

    private String prductName;

    private Integer qty;

    @PostPersist
    public void onPostPersist() {
        ProductRegistered productRegistered = new ProductRegistered(this);
        productRegistered.publishAfterCommit();
    }

    public static ProductRepository repository() {
        ProductRepository productRepository = ProductApplication.applicationContext.getBean(
            ProductRepository.class
        );
        return productRepository;
    }

    //<<< Clean Arch / Port Method
    public void decreaseProduct(DecreaseProductCommand decreaseProductCommand) {
        //implement business logic here:

        ProductDecreased productDecreased = new ProductDecreased(this);
        productDecreased.publishAfterCommit();
    }

    //>>> Clean Arch / Port Method
    //<<< Clean Arch / Port Method
    public void increaseProduct(IncreaseProductCommand increaseProductCommand) {
        //implement business logic here:

        ProductIncreased productIncreased = new ProductIncreased(this);
        productIncreased.publishAfterCommit();
    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
