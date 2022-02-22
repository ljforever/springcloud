package com.gwhn.springcloudproductconsumer8200.controller;

import com.gwhn.springcloudcommonapi.entity.Result;
import com.gwhn.springcloudproductconsumer8200.service.ProductService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author banxian
 * @date 2022/2/22 9:33
 */
@RestController
public class ProductConsumerController {

    @Resource
    RestTemplate restTemplate;

    @Resource
    ProductService productService;

    //public static String url = "http://localhost:8100/";
    public static String url = "http://springcloud-product-provider/";

    /**
     * 查询
     * @return
     */
    @GetMapping("product/consumer/get/info")
    public Result getServiceInfo(){
        return productService.getServiceInfo();
        /*return new Result(200, "查询成功",
                restTemplate.getForObject(url+"product/provider/get/info", Result.class));*/
    }

    /**
     * 查询
     * @param id
     * @return
     */
//    @HystrixCommand(fallbackMethod = "getErroInfo")
    @GetMapping("product/consumer/get/{id}")
    public Result selectById(@PathVariable("id") Long id){
        return productService.selectById(id);
       /* return new Result(200, "查询成功",
                restTemplate.getForObject(url+"product/provider/get/"+id, Result.class));*/
    }

    public Result getErroInfo(Long id){
        return new Result(500, "服务器内部出现错误", null);
    }
}