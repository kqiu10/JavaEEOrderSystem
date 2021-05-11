package com.example.imooc.enums;

import lombok.Getter;

@Getter
public enum ResultEnum {
    PARAM_ERROR(0, "parameters not correct"),
    PRODUCT_NOT_EXIST(10, "not exist"),
    PRODUCT_NOT_ENOUGH(20, "product not enough"),
    ORDER_NOT_EXIST(30, "sell not exist"),
    ORDERDETAIL_NOT_EXIST(40, "order detail not exits"),
    ORDER_STATUS_ERROR(50, "order cancelled"),
    ORDER_UPDATE_FAIL(60, "order update fail"),
    ORDER_DETAIL_EMPTY(70, "order details no exits"),
    ORDER_PAY_STATUS_ERROR(80, "order payment status incorrect"),
    CART_EMPTY(90, "cart is empty");
    private Integer code;
    private String message;

    ResultEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

}
