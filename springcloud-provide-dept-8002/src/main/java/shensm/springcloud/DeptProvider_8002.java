package shensm.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author shkstart
 * @create 2021-08-13-14:10
 **/
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
public class DeptProvider_8002 {
    public static void main(String [] args){
        SpringApplication.run(DeptProvider_8002.class,args);
    }
}
