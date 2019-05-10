package com.imooc.product.util;

import com.imooc.product.enums.ResultCode;
import com.imooc.product.viewobject.ResultVO;

/**
 * @author zhangxiaopan
 * @create 2019 - 04 - 29  10:11 AM
 **/
public class ResultUtil {
    public static ResultVO success(){
        return new ResultVO(ResultCode.SUCCESS.getCode(),ResultCode.FAILURE.getCode());
    }

    public static ResultVO success(String msg){
        return new ResultVO(ResultCode.SUCCESS.getCode(),msg);
    }

    public static ResultVO success(String msg,Object data){
        return new ResultVO(ResultCode.SUCCESS.getCode(),msg,data);
    }

    public static ResultVO success(Object data){
        return new ResultVO(ResultCode.SUCCESS.getCode(),ResultCode.SUCCESS.getMsg(),data);
    }
}
