package com.imooc.product.service;

import com.imooc.product.ProductApplicationTests;
import com.imooc.product.dataobject.ProductCategory;
import com.imooc.product.dataobject.ProductInfo;
import com.imooc.product.enums.ProductStatus;
import com.imooc.product.repository.ProductCategoryRepository;
import com.imooc.product.repository.ProductInfoRepository;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class ProductInfoServiceTest extends ProductApplicationTests {


    @Autowired
    private ProductInfoRepository productInfoRepository;
    @Autowired
    private ProductCategoryRepository productCategoryRepository;

    @Test
    public void getProducts() {
        List<ProductInfo> productInfoList = productInfoRepository.findByProductStatus(ProductStatus.UP.getCode());
        List<Integer> productTypeList = productInfoList.stream().map(ProductInfo::getCategoryType).collect(Collectors.toList());
        List<ProductCategory> productCategoryList = productCategoryRepository.findByCategoryTypeIn(productTypeList);
//        Object collect = productCategoryList.stream().collect(productCategory -> BeanUtils.copyProperties(productCategory,new ProductInfoVO()));
    }
}