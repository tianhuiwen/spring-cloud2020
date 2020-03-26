package com.atzz.springcloud.service.impl;

import com.atzz.springcloud.dao.PaymentDao;
import com.atzz.springcloud.entities.Payment;
import com.atzz.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author tianhuiwen
 * @date 2020/3/24 17:40
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
