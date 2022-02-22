package com.gwhn.springcloudstreamproducer8700.controller;

import com.gwhn.springcloudstreamproducer8700.service.SendService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author banxian
 * @date 2022/2/22 16:26
 */

@RestController
public class StreamProducerController {

    @Resource
    private SendService sendService;

    @GetMapping(value="/send/{msg}")
    public void send(@PathVariable("msg") String msg){
        sendService.sendMsg(msg);
    }
}