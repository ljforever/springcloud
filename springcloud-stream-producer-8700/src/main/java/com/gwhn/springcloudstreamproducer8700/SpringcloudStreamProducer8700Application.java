package com.gwhn.springcloudstreamproducer8700;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringcloudStreamProducer8700Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudStreamProducer8700Application.class, args);
    }

}
