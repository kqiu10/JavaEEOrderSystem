package com.example.imooc.dto;
/**
 * Date: 5/5/21
 * Question Description:
 * <p>
 * Examples:
 */

import com.example.imooc.dataobject.OrderDetail;
import com.example.imooc.enums.OrderStatusEnum;
import com.example.imooc.enums.PayStatusEnum;
import lombok.Data;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.List;

/**
 * Time Complexity: O()
 * Space Complexity: O()
 */
@Data
public class OrderDTO {
    private String orderId;

    private String buyerName;

    private String buyerPhone;

    private String buyerAddress;

    private String buyerOpenid;

    private BigDecimal orderAmount;

    private Integer orderStatus = OrderStatusEnum.NEW.getCode();

    private Integer payStatus = PayStatusEnum.WAIT.getCode();

    private Date createTime;

    private Date updateTime;

    List<OrderDetail> orderDetailList;
}
