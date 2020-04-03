package com.atzz.springcloud.service;

import com.atzz.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @author tianhuiwen
 * @date 2020/3/24 17:39
 */
public interface PaymentService {

    int create(Payment payment);

    Payment getPaymentById(@Param("id") Long id);
}
