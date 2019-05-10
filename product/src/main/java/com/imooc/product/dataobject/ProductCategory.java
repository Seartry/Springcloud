package com.imooc.product.dataobject;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

/**
 * @author zhangxiaopan
 * @create 2019 - 04 - 26  4:38 PM
 **/
@Data
@Entity
public class ProductCategory {

    @Id
    private String categoryId;
    private String categoryName;
    private int categoryType;
    private Date createTime;
    private Date updateTime;
}
