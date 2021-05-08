package com.example.imooc.dto;
/**
 * Date: 5/7/21
 * Question Description:
 * <p>
 * Examples:
 */

import lombok.Data;

/**
 * Time Complexity: O()
 * Space Complexity: O()
 */
@Data
public class CartDTO {
    private String productId;

    private Integer productQuantity;

    public CartDTO(String productId, Integer productQuantity) {
        this.productId = productId;
        this.productQuantity = productQuantity;
    }
}
