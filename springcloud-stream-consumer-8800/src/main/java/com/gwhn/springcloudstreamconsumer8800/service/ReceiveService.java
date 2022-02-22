package com.gwhn.springcloudstreamconsumer8800.service;

import com.gwhn.springcloudstreamconsumer8800.config.MySink;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Service;

/**
 * @author banxian
 * @date 2022/2/22 16:30
 */
@Service
@EnableBinding(MySink.class)
public class ReceiveService {

    @StreamListener("myInput")
    public void recieve(Object payload){
        System.out.println(payload);
    }
}
