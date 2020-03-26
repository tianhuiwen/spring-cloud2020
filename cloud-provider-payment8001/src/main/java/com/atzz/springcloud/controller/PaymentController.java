package com.atzz.springcloud.controller;

import com.atzz.springcloud.entities.CommonResult;
import com.atzz.springcloud.entities.Payment;
import com.atzz.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * @author tianhuiwen
 * @date 2020/3/24 17:43
 */
@RestController
@Slf4j
public class PaymentController {

    @Resource
    private PaymentService paymentService;

    @Value("${server.port}")
    private String serverPort;

   /* @Resource
    private DiscoveryClient discoveryClient;*/

    @PostMapping(value = "/payment/create")
    public CommonResult create(@RequestBody Payment payment) {
        int result = paymentService.create(payment);
        log.info("插入结果:" + result);
        if (result > 0) {
            return new CommonResult(200, "插入成功,serverPort: " + serverPort, result);
        } else {
            return new CommonResult(444, "插入失败", null);
        }
    }

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id) {
        Payment paymentById = paymentService.getPaymentById(id);
        log.info("查询结果:" + paymentById);
        if (paymentById != null) {
            return new CommonResult(200, "查询成功,serverPort: "+ serverPort, paymentById);
        } else {
            return new CommonResult(444, "没有对应记录，查询id:" + id, null);
        }
    }

}
