package shensm.springcloud.Controller;

import org.shensm.springcloud.pojo.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;
import shensm.springcloud.service.DeptServiceImpl;

import java.util.List;

/**
 * @author shkstart
 * @create 2021-08-13-14:03
 **/
//提供Restful服务
@RestController
public class DeptController {
    @Autowired
    private DeptServiceImpl deptServiceImpl;
    @Autowired
    private DiscoveryClient client;

    @PostMapping("dept/add")
    public boolean addDept(Dept dept){
        return deptServiceImpl.addDept(dept);
    }

    @GetMapping("dept/get/{id}")
    public Dept get(@PathVariable("id") Long id){
        return deptServiceImpl.queryById(id);
    }

    @GetMapping("dept/list")
    public List<Dept> queryAll(Dept dept){
        return deptServiceImpl.queryAll();
    }

    //注册进来的微服务，获取一些消息
    @RequestMapping("/dept/discovery")
    public Object discovery(){
        //获取微服务列表的清单
        List<String> services = client.getServices();
        System.out.println("discovery=>services:"+services);
        //得到一个具体的微服务信息，同通过具体的微服务id，applicaioiName;
        List<ServiceInstance> instances = client.getInstances("SPRINGCLOUD-PROVIDE-DEPT");
        for (ServiceInstance instance : instances) {
            System.out.println(instance.getHost());
            System.out.println(instance.getPort());
            System.out.println(instance.getUri());
            System.out.println(instance.getServiceId());
        }
        return this.client;
    }
}
