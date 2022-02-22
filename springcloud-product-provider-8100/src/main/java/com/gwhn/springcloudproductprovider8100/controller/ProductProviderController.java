package com.gwhn.springcloudproductprovider8100.controller;

import com.gwhn.springcloudcommonapi.entity.Product;
import com.gwhn.springcloudcommonapi.entity.Result;
import com.gwhn.springcloudproductprovider8100.service.ProductProviderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.devtools.restart.RestartScope;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author banxian
 * @date 2022/2/22 8:46
 */
@RestController
@Slf4j
@RequestMapping("/")
@RefreshScope
public class ProductProviderController {

    @Resource
    private ProductProviderService productService;

    @Value("${spring.application.name}")
    private String instanceName;

    @Value("${server.port}")
    private String port;

    @Value("${hello}")
    private String hello;

    @GetMapping("product/provider/get/config/info")
    public Result getConfigInfo()throws Exception{
        return new Result(200,"",this.hello);
    }


    @GetMapping("product/provider/get/info")
    public Result geServieInfo(){
        return new Result(200, "查询成功", "当前服务名："+instanceName + " 当前端口："+port);
    }

    /**
     * 查询
     * @param id
     * @return
     */
    @GetMapping("product/provider/get/{id}")
    public Result selectById(@PathVariable("id") Long id){
        return new Result(200, "查询成功", productService.selectById(id));
    }

    /**
     * 删除
     * @param id
     * @return
     */
    @GetMapping("product/provider/delete/{id}")
    public Result deleteById(@PathVariable("id") Long id){
        return new Result(200, "删除成功", productService.deleteById(id));
    }

    /**
     * 修改
     * @param product
     * @return
     */
    @PostMapping("product/provider/update")
    public Result updateById(@RequestBody Product product){
        return new Result(200, "修改成功", productService.updateById(product.getId(), product.getName()));

    }

    /**
     * 新增
     * @return
     */
    @PutMapping( "product/provider/add")
    public Result insertById(@RequestBody Product product){
        return new Result(200, "修改成功", productService.insertOne(product));
    }
}
