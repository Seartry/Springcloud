package com.imooc.product.controller;

import com.imooc.product.service.ProductInfoService;
import com.imooc.product.util.ResultUtil;
import com.imooc.product.viewobject.ResultVO;
import lombok.extern.java.Log;
import lombok.val;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhangxiaopan
 * @create 2019 - 04 - 26  3:51 PM
 **/
// @Log 使用的java.util.logging.Logger类
@Log
@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductInfoService productInfoService;

    @GetMapping("/list")
    public ResultVO getAllUpProductInfo(){
        //lombok包的类型推到val
        val products = productInfoService.getProducts();
        products.stream().forEach(product->{
            log.info(product.toString());
        });
        return ResultUtil.success(products);
    }
}
