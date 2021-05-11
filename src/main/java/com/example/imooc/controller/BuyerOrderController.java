package com.example.imooc.controller;
/**
 * Date: 5/10/21
 * Question Description:
 * <p>
 * Examples:
 */

import com.example.imooc.VO.ResultVO;
import com.example.imooc.converter.OrderForm2OrderDTOConverter;
import com.example.imooc.dto.OrderDTO;
import com.example.imooc.enums.ResultEnum;
import com.example.imooc.exception.SellException;
import com.example.imooc.form.OrderForm;
import com.example.imooc.service.OrderService;
import com.example.imooc.utils.ResultVOUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.Map;

/**
 * Time Complexity: O()
 * Space Complexity: O()
 */
@RestController
@Slf4j
@RequestMapping("/buyer/order")
public class BuyerOrderController {

    @Autowired
    private OrderService orderService;
    //创建订单
    @PostMapping("/create")
    public ResultVO<Map<String, String>> create(@Valid OrderForm orderForm, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            log.error("parameters incorrect, orderForm={}", orderForm);
            throw new SellException(ResultEnum.PARAM_ERROR.getCode(),
                    bindingResult.getFieldError().getDefaultMessage());
        }
        OrderDTO orderDTO = OrderForm2OrderDTOConverter.convert(orderForm);
        if (CollectionUtils.isEmpty(orderDTO.getOrderDetailList())) {
            log.error("cart can not be empty");
            throw new SellException(ResultEnum.CART_EMPTY);
        }

        OrderDTO createResult = orderService.create(orderDTO);
        Map<String, String> map = new HashMap<>();
        map.put("orderID", createResult.getOrderId());
        return ResultVOUtil.success(map);


    }
    //订单列表
    public ResultVO
    //单个订单
    //取消订单

}
