package com.imooc.product.enums;

/**
 * @author zhangxiaopan
 * @create 2019 - 04 - 29  10:27 AM
 **/
public enum ProductStatus {
    UP(0,"在架"),
    DOWN(1,"下架");

    private final int code;
    private final String name;

    private ProductStatus(int code, String name) {
        this.code = code;
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }
}
