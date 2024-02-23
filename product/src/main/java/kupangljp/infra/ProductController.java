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
// @RequestMapping(value="/products")
@Transactional
public class ProductController {

    @Autowired
    ProductRepository productRepository;

    @RequestMapping(
        value = "products/{id}/decreaseproduct",
        method = RequestMethod.PUT,
        produces = "application/json;charset=UTF-8"
    )
    public Product decreaseProduct(
        @PathVariable(value = "id") String id,
        @RequestBody DecreaseProductCommand decreaseProductCommand,
        HttpServletRequest request,
        HttpServletResponse response
    ) throws Exception {
        System.out.println("##### /product/decreaseProduct  called #####");
        Optional<Product> optionalProduct = productRepository.findById(id);

        optionalProduct.orElseThrow(() -> new Exception("No Entity Found"));
        Product product = optionalProduct.get();
        product.decreaseProduct(decreaseProductCommand);

        productRepository.save(product);
        return product;
    }

    @RequestMapping(
        value = "products/{id}/increaseproduct",
        method = RequestMethod.PUT,
        produces = "application/json;charset=UTF-8"
    )
    public Product increaseProduct(
        @PathVariable(value = "id") String id,
        @RequestBody IncreaseProductCommand increaseProductCommand,
        HttpServletRequest request,
        HttpServletResponse response
    ) throws Exception {
        System.out.println("##### /product/increaseProduct  called #####");
        Optional<Product> optionalProduct = productRepository.findById(id);

        optionalProduct.orElseThrow(() -> new Exception("No Entity Found"));
        Product product = optionalProduct.get();
        product.increaseProduct(increaseProductCommand);

        productRepository.save(product);
        return product;
    }
}
//>>> Clean Arch / Inbound Adaptor
