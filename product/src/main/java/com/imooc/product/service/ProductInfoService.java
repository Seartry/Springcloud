package com.imooc.product.service;

import com.imooc.product.dataobject.ProductCategory;
import com.imooc.product.dataobject.ProductInfo;
import com.imooc.product.enums.ProductStatus;
import com.imooc.product.repository.ProductCategoryRepository;
import com.imooc.product.repository.ProductInfoRepository;
import com.imooc.product.viewobject.ProductCategoryVO;
import com.imooc.product.viewobject.ProductInfoVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author zhangxiaopan
 * @create 2019 - 04 - 26  4:38 PM
 **/
@Service
@Slf4j
public class ProductInfoService {

    @Autowired
    private ProductInfoRepository productInfoRepository;
    @Autowired
    private ProductCategoryRepository productCategoryRepository;

    public List<ProductCategoryVO> getProducts() {
        //获取在架商品列表
        List<ProductInfo> productInfoList = productInfoRepository.findByProductStatus(ProductStatus.UP.getCode());
        List<Integer> productTypeList = productInfoList.stream().map(ProductInfo::getCategoryType).collect(Collectors.toList());
        //获取所有在架商品类目
        List<ProductCategory> productCategoryList = productCategoryRepository.findByCategoryTypeIn(productTypeList);
        List<ProductCategoryVO> productCategoryVOList = new ArrayList<ProductCategoryVO>();
        //组装数据
        for (ProductCategory productCategory : productCategoryList) {
            ProductCategoryVO productCategoryVO = new ProductCategoryVO();
            BeanUtils.copyProperties(productCategory, productCategoryVO);
            List<ProductInfoVO> productInfoVOList = new ArrayList<>();
            productInfoList.stream().filter(productInfo ->
                    productCategory.getCategoryType() == productInfo.getCategoryType())
                    .collect(Collectors.toList()).stream().forEach(productInfo -> {
                ProductInfoVO product = new ProductInfoVO();
                BeanUtils.copyProperties(productInfo, product);
                productInfoVOList.add(product);
            });
            productCategoryVO.setList(productInfoVOList);
            log.info(productCategoryVO.toString());
            productCategoryVOList.add(productCategoryVO);
        }
        return productCategoryVOList;

    }

}
