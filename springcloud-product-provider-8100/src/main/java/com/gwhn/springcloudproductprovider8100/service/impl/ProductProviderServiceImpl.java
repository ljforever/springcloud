package com.gwhn.springcloudproductprovider8100.service.impl;

import com.gwhn.springcloudcommonapi.entity.Product;
import com.gwhn.springcloudproductprovider8100.mapper.ProductProviderMapper;
import com.gwhn.springcloudproductprovider8100.service.ProductProviderService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author banxian
 * @date 2022/2/22 8:41
 */
@Service
public class ProductProviderServiceImpl implements ProductProviderService {

    @Resource
    private ProductProviderMapper productMapper;

    @HystrixCommand(fallbackMethod = "selectByIdFallbackHandler", commandProperties = {
            // 是否启用服务熔断
            @HystrixProperty(name = "circuitBreaker.enabled", value = "true"),
            // 请求阈值
            @HystrixProperty(name = "circuitBreaker.requestVolumeThreshold", value = "10"),
            // 时间窗口
            @HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds", value = "10000"),
            // 错误比率
            @HystrixProperty(name = "circuitBreaker.errorThresholdPercentage", value = "50")
    })
    @Override
    public Product selectById(Long id) {
        return productMapper.selectById(id);
    }

    @Override
    public int deleteById(Long id) {
        return productMapper.deleteById(id);
    }

    @Override
    public int updateById(Long id, String name) {
        return 0;
    }

    @Override
    public int insertOne(Product product) {
        return productMapper.insert(product);
    }

    public Product selectByIdFallbackHandler(Long id){
        return null;
    }
}
