package org.shensm.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author shkstart
 * @create 2021-08-13-14:28
 **/
@Configuration
public class ConfigBean {
    //配置负载均衡实现
    @Bean
    @LoadBalanced   //ribbon
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
