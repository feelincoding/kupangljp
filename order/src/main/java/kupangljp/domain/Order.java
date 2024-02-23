package kupangljp.domain;

import kupangljp.domain.OrderCreated;
import kupangljp.OrderApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;
import java.time.LocalDate;


@Entity
@Table(name="Order_table")
@Data

//<<< DDD / Aggregate Root
public class Order  {


    
    @Id
    
    
    
    
    
    private String orderId;
    
    
    
    
    private String userId;
    
    
    
    
    private String productName;
    
    
    
    
    private String status;
    
    
    
    
    private Integer qty;

    @PostPersist
    public void onPostPersist(){


        OrderCreated orderCreated = new OrderCreated(this);
        orderCreated.publishAfterCommit();

    }

    public static OrderRepository repository(){
        OrderRepository orderRepository = OrderApplication.applicationContext.getBean(OrderRepository.class);
        return orderRepository;
    }

    public void create order(){
        //
    }


//<<< Clean Arch / Port Method
    public void confirmOrder(){
        
        //implement business logic here:
        
        OrderConfirmed orderConfirmed = new OrderConfirmed(this);
        orderConfirmed.publishAfterCommit();

    }
//>>> Clean Arch / Port Method
//<<< Clean Arch / Port Method
    public void cancelOrder(CancelOrderCommand cancelOrderCommand){
        
        //implement business logic here:
        
        OrderCancelled orderCancelled = new OrderCancelled(this);
        orderCancelled.publishAfterCommit();

    }
//>>> Clean Arch / Port Method



}
//>>> DDD / Aggregate Root
