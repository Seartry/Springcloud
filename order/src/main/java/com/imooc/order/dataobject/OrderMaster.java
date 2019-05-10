package com.imooc.order.dataobject;

import lombok.Data;

import javax.persistence.Entity;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author zhangxiaopan
 * @create 2019 - 04 - 29  6:10 PM
 **/
@Data
@Entity
public class OrderMaster {

    private String detailId;
    private String orderId;
    private String productId;
    private String productName;
    private BigDecimal productPrice;
    private int productQuantity;
    private int productIcon;
    private Date createTime;
    private Date updateTime;


}
