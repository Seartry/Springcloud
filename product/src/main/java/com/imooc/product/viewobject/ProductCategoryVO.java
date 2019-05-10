package com.imooc.product.viewobject;

import lombok.Data;

import java.util.List;

/**
 * @author zhangxiaopan
 * @create 2019 - 04 - 26  5:20 PM
 **/
@Data
public class ProductCategoryVO {

    private String categoryId;
    private String categoryName;
    private int categoryType;
    private List<ProductInfoVO> list;

}
