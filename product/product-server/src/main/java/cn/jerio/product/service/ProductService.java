package cn.jerio.product.service;


import cn.jerio.product.common.DecreaseStockInput;
import cn.jerio.product.common.ProductInfoOutput;
import cn.jerio.product.dataobject.ProductInfo;
import java.util.List;


public interface ProductService {

    /**
     * 查询所有在架商品列表
     */
    List<ProductInfo> findUpAll();

    /**
     * 查询商品列表
     * @param productIdList
     * @return
     */
    List<ProductInfoOutput> findList(List<String> productIdList);

    /**
     * 扣库存
     * @param decreaseStockInputList
     */
    void decreaseStock(List<DecreaseStockInput> decreaseStockInputList);
}
