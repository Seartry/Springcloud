package com.imooc.product.viewobject;

import lombok.Data;

/**
 * @author zhangxiaopan
 * @create 2019 - 04 - 29  10:05 AM
 **/
@Data
public class ResultVO {

    private String code;
    private String msg;
    private Object data;

    public ResultVO() {

    }

    public ResultVO(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public ResultVO(String code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

}
