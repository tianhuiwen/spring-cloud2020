package com.atzz.springcloud.service.impl;

import com.atzz.springcloud.service.IMessageProvider;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;

import javax.annotation.Resource;
import java.util.UUID;

/**
 * @author tianhuiwen
 * @date 2020/5/2 19:44
 */
@EnableBinding(Source.class)  //定义消息的推送广告
public class MessageProviderImpl implements IMessageProvider {


    /**
     * 消息发送管道
     */
    @Resource
    private MessageChannel output;

    @Override
    public String send() {
        String serial = UUID.randomUUID().toString();
        output.send(MessageBuilder.withPayload(serial).build());
        System.out.println("*****serial: " +serial);
        return null;
    }
}
