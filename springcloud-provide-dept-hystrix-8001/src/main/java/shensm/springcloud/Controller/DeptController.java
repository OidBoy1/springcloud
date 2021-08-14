package shensm.springcloud.Controller;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.shensm.springcloud.pojo.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import shensm.springcloud.service.DeptService;
import sun.rmi.runtime.Log;

/**
 * @author shkstart
 * @create 2021-08-13-14:03
 **/
//提供Restful服务
@RestController
public class DeptController {
   @Autowired
    private DeptService deptService;

   @GetMapping("/dept/get/{id}")
   @HystrixCommand(fallbackMethod = "hystrixGet")
    public Dept get(@PathVariable("id") Long id) throws Exception {
       Dept dept = deptService.queryById(id);
       if (dept==null){
           throw new RuntimeException("id=>"+id+",该用户不存在，或信息无法找到");
       }
       return dept;
   }

   public Dept hystrixGet(@PathVariable("id") Long id){
       Dept dept = new Dept();
       dept.setDeptno(id);
       dept.setDname("id => "+id+",没有对应的信息，null--@Hystrix");
       dept.setDb_source("no this database in Mysql");
       return dept;
   }
}
