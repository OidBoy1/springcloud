package shensm.springcloud.service;

import org.shensm.springcloud.pojo.Dept;

import java.util.List;

/**
 * @author shkstart
 * @create 2021-08-13-14:00
 **/
public interface DeptService {
    public boolean addDept(Dept dept);

    public  Dept queryById(Long id);

    public List<Dept> queryAll();
}
