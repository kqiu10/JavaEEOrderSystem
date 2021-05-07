package com.example.imooc.dataobject;
/**
 * Date: 5/5/21
 * Question Description:
 * <p>
 * Examples:
 */

import com.example.imooc.enums.OrderStatusEnum;
import com.example.imooc.enums.PayStatusEnum;
import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.sql.Date;

/**
 * Time Complexity: O()
 * Space Complexity: O()
 */
@Entity
@Data
@DynamicUpdate
public class OrderMaster {
    @Id
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
}
