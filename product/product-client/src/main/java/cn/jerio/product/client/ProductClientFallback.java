package cn.jerio.product.client;

import cn.jerio.product.common.DecreaseStockInput;
import cn.jerio.product.common.ProductInfoOutput;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jerio on 2018/10/08
 */
@Component
public class ProductClientFallback implements ProductClient{
    @Override
    public List<ProductInfoOutput> listForOrder(@RequestBody List<String> productIdList) {
        return new ArrayList<ProductInfoOutput>();
    }

    @Override
    public void decreaseStock(@RequestBody List<DecreaseStockInput> decreaseStockInputList) {

    }

    @Override
    public String testClient() {
        return "触发降级。";
    }
}
