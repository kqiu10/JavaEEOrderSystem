package com.example.imooc.enums;
/**
 * Date: 5/5/21
 * Question Description:
 * <p>
 * Examples:
 */

import lombok.Getter;

/**
 * Time Complexity: O()
 * Space Complexity: O()
 */
@Getter
public enum OrderStatusEnum {
    NEW(0, "new order"),
    FINISH(1, "finished order"),
    CANCEL(2, "canceled orderr");

    private Integer code;
    private String msg;

    OrderStatusEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
