package org.shensm.springcloud.service;

import feign.hystrix.FallbackFactory;
import org.shensm.springcloud.pojo.Dept;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author shkstart
 * @create 2021-08-14-9:22
 **/
@Component
public class DeptClientServiceFallbackFactory implements FallbackFactory {
    public DeptClientService create(Throwable throwable) {
        return new DeptClientService() {
            public Dept queryById(Long id) {
                Dept dept = new Dept();
                dept.setDeptno(id);
                dept.setDname("id=>"+id+",没有对应的信息，客户端提供了降级的信息，这个服务现在已经被关闭了");
                dept.setDb_source("没有数据");
                return dept;
            }

            public List<Dept> queryAll() {
                return null;
            }

            public boolean addDept(Dept dept) {
                return false;
            }
        };
    }
}
