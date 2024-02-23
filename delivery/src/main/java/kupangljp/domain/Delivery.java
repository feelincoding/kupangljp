package kupangljp.domain;

import kupangljp.domain.DeliveryStarted;
import kupangljp.DeliveryApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;
import java.time.LocalDate;


@Entity
@Table(name="Delivery_table")
@Data

//<<< DDD / Aggregate Root
public class Delivery  {


    
    @Id
    
    
    
    
    
    private String deliveryId;
    
    
    
    
    private String orderId;
    
    
    
    
    private String status;

    @PostPersist
    public void onPostPersist(){


        DeliveryStarted deliveryStarted = new DeliveryStarted(this);
        deliveryStarted.publishAfterCommit();

    }

    public static DeliveryRepository repository(){
        DeliveryRepository deliveryRepository = DeliveryApplication.applicationContext.getBean(DeliveryRepository.class);
        return deliveryRepository;
    }

    public void start delivery(){
        //
    }


//<<< Clean Arch / Port Method
    public void cancleDelivery(CancleDeliveryCommand cancleDeliveryCommand){
        
        //implement business logic here:
        
        DeliveryCand deliveryCand = new DeliveryCand(this);
        deliveryCand.publishAfterCommit();

    }
//>>> Clean Arch / Port Method



}
//>>> DDD / Aggregate Root
