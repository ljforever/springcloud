package com.gwhn.springcloudstreamproducer8700.service;

import com.gwhn.springcloudstreamproducer8700.config.MySource;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.messaging.support.MessageBuilder;

import javax.annotation.Resource;

/**
 * @author banxian
 * @date 2022/2/22 16:25
 */
@EnableBinding({MySource.class})
public class SendService {

    @Resource
    private MySource mysource;

    public void sendMsg(String msg) {
        mysource.myOutput().send(MessageBuilder.withPayload(msg).build());
    }
}
