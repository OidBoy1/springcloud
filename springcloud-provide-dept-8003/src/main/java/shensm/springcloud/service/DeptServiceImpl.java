package shensm.springcloud.service;

import org.shensm.springcloud.pojo.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import shensm.springcloud.dao.DeptDao;

import java.util.List;

/**
 * @author shkstart
 * @create 2021-08-13-14:01
 **/
@Service
public class DeptServiceImpl implements DeptService{
    @Autowired
    private DeptDao deptDao;


    public boolean addDept(Dept dept) {
        return deptDao.addDept(dept);
    }

    public Dept queryById(Long id) {
        return deptDao.queryById(id);
    }

    public List<Dept> queryAll() {
        return deptDao.queryAll();
    }
}
