package com.atzz.springcloud.service;

import org.springframework.stereotype.Service;

/**
 * @author tianhuiwen
 * @date 2020/4/21 17:47
 */
@Service
public class PaymentFallbackService implements PaymentHystrixService {

    @Override
    public String paymentInfo_OK(Integer id) {
        return "-------PaymentFallbackService fall back-paymentInfo_OK,o(╥﹏╥)o";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "-------PaymentFallbackService fall back-paymentInfo_TimeOut,o(╥﹏╥)o";
    }
}
