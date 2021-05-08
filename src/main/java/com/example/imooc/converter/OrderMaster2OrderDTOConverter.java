package com.example.imooc.converter;
/**
 * Date: 5/7/21
 * Question Description:
 * <p>
 * Examples:
 */

import com.example.imooc.dataobject.OrderMaster;
import com.example.imooc.dto.OrderDTO;
import org.springframework.beans.BeanUtils;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Time Complexity: O()
 * Space Complexity: O()
 */
public class OrderMaster2OrderDTOConverter {

    public static OrderDTO convert(OrderMaster orderMaster) {
        OrderDTO orderDTO = new OrderDTO();
        BeanUtils.copyProperties(orderMaster, orderDTO);
        return orderDTO;
    }

    public static List<OrderDTO> convert(List<OrderMaster> orderMasterList) {
        return orderMasterList.stream().map(e ->convert(e)).collect(Collectors.toList());
    }
}
