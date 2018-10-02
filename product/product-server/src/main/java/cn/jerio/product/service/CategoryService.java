package cn.jerio.product.service;



import cn.jerio.product.dataobject.ProductCategory;

import java.util.List;

public interface CategoryService {

    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);
}
