package com.gwhn.springcloudproductconsumer8200.service.impl;

import com.gwhn.springcloudcommonapi.entity.Result;
import com.gwhn.springcloudproductconsumer8200.service.ProductService;
import org.springframework.stereotype.Component;

/**
 * @author banxian
 * @date 2022/2/22 15:29
 */
@Component
public class ProductFallbackServieImpl implements ProductService {

    public Result getServiceInfo() {
        return new Result(500,"服务器内部出现错误，导致getServiceInfo接口异常",null);
    }

    public Result selectById(Long id) {
        return new Result(500,"服务器内部出现错误，导致selectById接口异常",null);
    }
}
