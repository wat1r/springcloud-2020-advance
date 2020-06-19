package com.frankcooper.springcloud.service;

import com.frankcooper.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @Date 2020/6/17
 * @Author Frank Cooper
 * @Description
 */
public interface PaymentService {
    int create(Payment payment);

    Payment getPaymentById(@Param("id") Long id);

}
