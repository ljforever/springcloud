package com.gwhn.springcloudstreamconsumer8800.config;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

/**
 * @author banxian
 * @date 2022/2/22 16:29
 */
public interface MySink {

    @Input("myInput")
    SubscribableChannel myInput();
}
