package cn.jerio.product.client;

import cn.jerio.product.common.DecreaseStockInput;
import cn.jerio.product.common.ProductInfoOutput;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

/**
 * Created by Jerio on 2018/10/2
 */
@FeignClient(name = "product" ,fallback = ProductClientFallback.class)
public interface ProductClient {

    @PostMapping("/product/listForOrder")
    List<ProductInfoOutput> listForOrder(@RequestBody List<String> productIdList);

    @PostMapping("/product/decreaseStock")
    void decreaseStock(@RequestBody List<DecreaseStockInput> decreaseStockInputList);

    @GetMapping("/product/testClient")
    String testClient();
}
