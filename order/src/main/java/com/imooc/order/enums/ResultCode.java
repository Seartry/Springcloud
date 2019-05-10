package com.imooc.order.enums;

/**
 * @author zhangxiaopan
 * @create 2019 - 04 - 29  10:13 AM
 **/
public enum ResultCode {
    SUCCESS("0","成功"),
    FAILURE("1","失败");

    private final String code;
    private final String msg;

    private ResultCode(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
