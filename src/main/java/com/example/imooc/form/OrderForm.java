package com.example.imooc.form;
/**
 * Date: 5/10/21
 * Question Description:
 * <p>
 * Examples:
 */

import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;

/**
 * Time Complexity: O()
 * Space Complexity: O()
 */
@Data
public class OrderForm {
    @NotEmpty(message = "姓名必填")
    private String name;

    @NotEmpty(message = "手机号必填")
    private String phone;

    @NotEmpty(message = "地址必填")
    private String address;

    @NotEmpty(message = "openid必填")
    private String openid;

    @NotEmpty(message = "购物车不能为空")
    private String items;

}
