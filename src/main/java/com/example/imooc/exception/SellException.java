package com.example.imooc.exception;
/**
 * Date: 5/5/21
 * Question Description:
 * <p>
 * Examples:
 */

import com.example.imooc.enums.ResultEnum;

/**
 * Time Complexity: O()
 * Space Complexity: O()
 */
public class SellException extends RuntimeException{
    private Integer code;

    public SellException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());

        this.code = resultEnum.getCode();
    }

    public SellException(Integer code, String message) {
        super(message);
        this.code = code;
    }
}
