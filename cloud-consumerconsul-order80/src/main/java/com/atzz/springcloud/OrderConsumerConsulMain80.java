package com.atzz.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author tianhuiwen
 * @date 2020/4/17 10:18
 */
@SpringBootApplication
@EnableDiscoveryClient
public class OrderConsumerConsulMain80 {
    public static void main(String[] args) {
        SpringApplication.run(OrderConsumerConsulMain80.class, args);
    }
}
