package kupangljp.infra;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import javax.naming.NameParser;
import javax.naming.NameParser;
import javax.transaction.Transactional;
import kupangljp.config.kafka.KafkaProcessor;
import kupangljp.domain.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

//<<< Clean Arch / Inbound Adaptor
@Service
@Transactional
public class PolicyHandler {

    @Autowired
    OrderRepository orderRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString) {}

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='OrderCreated'"
    )
    public void wheneverOrderCreated_OrderSaga(
        @Payload OrderCreated orderCreated
    ) {
        OrderCreated event = orderCreated;
        System.out.println(
            "\n\n##### listener OrderSaga : " + orderCreated + "\n\n"
        );
        // Sample Logic //

    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='PaymentAuthorized'"
    )
    public void wheneverPaymentAuthorized_OrderSaga(
        @Payload PaymentAuthorized paymentAuthorized
    ) {
        PaymentAuthorized event = paymentAuthorized;
        System.out.println(
            "\n\n##### listener OrderSaga : " + paymentAuthorized + "\n\n"
        );
        // Sample Logic //

    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='PaymentCaptured'"
    )
    public void wheneverPaymentCaptured_OrderSaga(
        @Payload PaymentCaptured paymentCaptured
    ) {
        PaymentCaptured event = paymentCaptured;
        System.out.println(
            "\n\n##### listener OrderSaga : " + paymentCaptured + "\n\n"
        );
        // Sample Logic //

    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='DeliveryStarted'"
    )
    public void wheneverDeliveryStarted_OrderSaga(
        @Payload DeliveryStarted deliveryStarted
    ) {
        DeliveryStarted event = deliveryStarted;
        System.out.println(
            "\n\n##### listener OrderSaga : " + deliveryStarted + "\n\n"
        );
        // Sample Logic //

    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='ProductDecreased'"
    )
    public void wheneverProductDecreased_OrderSaga(
        @Payload ProductDecreased productDecreased
    ) {
        ProductDecreased event = productDecreased;
        System.out.println(
            "\n\n##### listener OrderSaga : " + productDecreased + "\n\n"
        );
        // Sample Logic //

    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='OrderConfirmed'"
    )
    public void wheneverOrderConfirmed_OrderSaga(
        @Payload OrderConfirmed orderConfirmed
    ) {
        OrderConfirmed event = orderConfirmed;
        System.out.println(
            "\n\n##### listener OrderSaga : " + orderConfirmed + "\n\n"
        );
        // Sample Logic //

    }
}
//>>> Clean Arch / Inbound Adaptor
