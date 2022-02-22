package com.gwhn.springcloudproductconsumer8200.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RoundRobinRule;
import org.springframework.context.annotation.Configuration;

/**
 * @author banxian
 * @date 2022/2/22 9:52
 */
@Configuration
public class MyRule {

    public IRule getLoadBalancedRule(){
        return new RoundRobinRule();
    }
}
