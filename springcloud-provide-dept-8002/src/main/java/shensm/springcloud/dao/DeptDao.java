package shensm.springcloud.dao;

import org.apache.ibatis.annotations.Mapper;
import org.shensm.springcloud.pojo.Dept;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author shkstart
 * @create 2021-08-13-11:57
 **/
@Mapper
@Repository
public interface DeptDao {
    public boolean addDept(Dept dept);

    public Dept queryById(Long id);

    public List<Dept> queryAll();
}
