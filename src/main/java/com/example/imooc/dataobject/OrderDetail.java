package com.example.imooc.dataobject;
/**
 * Date: 5/5/21
 * Question Description:
 * <p>
 * Examples:
 */

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

/**
 * Time Complexity: O()
 * Space Complexity: O()
 */
@Entity
@Data
public class OrderDetail {
    @Id
    private String detailId;

    private String orderId;

    private String productId;

    private String productName;

    private BigDecimal productPrice;

    private Integer productQuantity;

    private String productIcon;


}
