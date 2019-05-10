package com.imooc.product.dataobject;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author zhangxiaopan
 * @create 2019 - 04 - 26  3:52 PM
 **/
@Data
@Entity
@Slf4j
public class ProductInfo {
    @Id
    private String productId;
    private String productName;
    private BigDecimal productPrice;
    private int productStock;
    private String productDescription;
    private String productIcon;
    private int productStatus;
    private int categoryType;
    private Date createTime;
    private Date updateTime;

}
