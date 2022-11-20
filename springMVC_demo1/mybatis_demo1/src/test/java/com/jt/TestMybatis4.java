package com.jt;

import com.jt.mapper.DeptMapper;
import com.jt.mapper.DogMapper;
import com.jt.mapper.EmpMapper;
import com.jt.pojo.Dept;
import com.jt.pojo.Dog;
import com.jt.pojo.Emp;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class TestMybatis4 {

    @Autowired
    private DeptMapper deptMapper;
    @Autowired
    private EmpMapper  empMapper;

    //完成一对一测试
    @Test
    public void testEmp(){
        List<Emp> empList = empMapper.findAll();
        System.out.println(empList);
    }

    /*一对多测试*/
    @Test
    public void testDept(){
        List<Dept> deptList = deptMapper.findAll();
        System.out.println(deptList);
    }

    /**
     * 测试mybatis注解形式
     */
    @Test
    public void testAnno(){
        System.out.println(deptMapper.selectAll());
        Dept dept = new Dept();
        dept.setDeptName("公关部--喝2斤");
        deptMapper.saveDept(dept);
    }
}
