package com.gwhn.springcloudproductconsumer8200.service;

import com.gwhn.springcloudcommonapi.entity.Result;
import com.gwhn.springcloudproductconsumer8200.service.impl.ProductFallbackServieImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author banxian
 * @date 2022/2/22 12:09
 */
@Component
@FeignClient(name = "springcloud-product-provider", fallback = ProductFallbackServieImpl.class)
public interface ProductService {

    /**
     * 查询
     * @return
     */
    @GetMapping("product/provider/get/info")
    public Result getServiceInfo();

    /**
     * 查询
     * @param id
     * @return
     */
    @GetMapping("product/provider/get/{id}")
    public Result selectById(@PathVariable("id") Long id);
}
