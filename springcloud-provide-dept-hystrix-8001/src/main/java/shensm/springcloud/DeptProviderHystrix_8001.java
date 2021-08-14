package shensm.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author shkstart
 * @create 2021-08-13-14:10
 **/
@SpringBootApplication  //表明这是一个启动类
@EnableEurekaClient     //在服务器启动后自动注册到Eureka中！
@EnableDiscoveryClient  //服务发现
@EnableCircuitBreaker   //添加对熔断的支持
public class DeptProviderHystrix_8001 {
    public static void main(String [] args){
        SpringApplication.run(DeptProviderHystrix_8001.class,args);
    }
}
