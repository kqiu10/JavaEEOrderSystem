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
public enum PayStatusEnum {
    WAIT(0, "wait payment"),
    SUCCESS(1, "success payment");

    private Integer code;
    private String msg;

    PayStatusEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
