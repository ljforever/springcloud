package com.gwhn.springcloudstreamproducer8700.config;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.stereotype.Component;

/**
 * @author banxian
 * @date 2022/2/22 16:25
 */
@Component
public interface MySource {

    @Output("myOutput")
    MessageChannel myOutput();
}
