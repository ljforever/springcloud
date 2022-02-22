package com.gwhn.springcloudstreamconsumer8800;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringcloudStreamConsumer8800Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudStreamConsumer8800Application.class, args);
    }

}
