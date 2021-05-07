package com.example.imooc.repository;
/**
 * Date: 5/5/21
 * Question Description:
 * <p>
 * Examples:
 */

import com.example.imooc.dataobject.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Time Complexity: O()
 * Space Complexity: O()
 */
public interface OrderDetailRepository extends JpaRepository<OrderDetail, String> {
    List<OrderDetail> findByOrderId(String orderId);

}
