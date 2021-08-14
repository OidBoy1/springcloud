package shensm.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author shkstart
 * @create 2021-08-13-14:10
 **/
@SpringBootApplication
@EnableZuulProxy
public class ZuuApplication_9527 {
    public static void main(String [] args){
        SpringApplication.run(ZuuApplication_9527.class,args);
    }
}
