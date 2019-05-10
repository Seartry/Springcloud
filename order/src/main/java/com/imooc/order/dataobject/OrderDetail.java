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
public class OrderDetail {

    private String orderId;
    private String buyerName;
    private String buyerPhone;
    private String buyerAddress;
    private String buyerOpenid;
    private BigDecimal orderAmount;
    private int orderStatus;
    private int payStatus;
    private Date createTime;
    private Date updateTime;

}
