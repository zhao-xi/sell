package com.imooc.enums;

import lombok.Getter;

/*
* 标识数据库返回结果的enum
* */


@Getter
public enum ResultEnum {
    PRODUCT_NOT_EXIST(10, "商品不存在"),
    PRODUCT_STOCK_ERROR(11, "商品库存不正确"),
    ORDER_NOT_EXISIT(12, "订单不存在"),
    ORDERDETAIL_NOT_EXISIT(13, "订单详情不存在"),
    ORDER_STATUS_ERROR(14, "订单状态不正确"),
    PAY_STATUS_ERROR(15,"支付状态不正确")
    ;

    private Integer code;
    private String message;

    ResultEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
