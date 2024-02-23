package kupangljp.infra;

import java.util.Optional;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.transaction.Transactional;
import kupangljp.domain.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//<<< Clean Arch / Inbound Adaptor

@RestController
// @RequestMapping(value="/payments")
@Transactional
public class PaymentController {

    @Autowired
    PaymentRepository paymentRepository;

    @RequestMapping(
        value = "payments/{id}/capturepayment",
        method = RequestMethod.PUT,
        produces = "application/json;charset=UTF-8"
    )
    public Payment capturePayment(
        @PathVariable(value = "id") String id,
        @RequestBody CapturePaymentCommand capturePaymentCommand,
        HttpServletRequest request,
        HttpServletResponse response
    ) throws Exception {
        System.out.println("##### /payment/capturePayment  called #####");
        Optional<Payment> optionalPayment = paymentRepository.findById(id);

        optionalPayment.orElseThrow(() -> new Exception("No Entity Found"));
        Payment payment = optionalPayment.get();
        payment.capturePayment(capturePaymentCommand);

        paymentRepository.save(payment);
        return payment;
    }

    @RequestMapping(
        value = "payments/{id}/failpayment",
        method = RequestMethod.PUT,
        produces = "application/json;charset=UTF-8"
    )
    public Payment failPayment(
        @PathVariable(value = "id") String id,
        @RequestBody FailPaymentCommand failPaymentCommand,
        HttpServletRequest request,
        HttpServletResponse response
    ) throws Exception {
        System.out.println("##### /payment/failPayment  called #####");
        Optional<Payment> optionalPayment = paymentRepository.findById(id);

        optionalPayment.orElseThrow(() -> new Exception("No Entity Found"));
        Payment payment = optionalPayment.get();
        payment.failPayment(failPaymentCommand);

        paymentRepository.save(payment);
        return payment;
    }
}
//>>> Clean Arch / Inbound Adaptor
