package com.jt.mapper;

import com.jt.pojo.Dept;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

//@Mapper
public interface DeptMapper {
    List<Dept> findAll();
    //鸡肋: 1.大公司一般不用,  2.只适用于单表操作.多表操作必须写映射文件
    // 注解和映射文件二选一
    @Select("select * from dept")
    List<Dept> selectAll();
    @Insert("insert into dept values (null,#{deptName})")
    void saveDept(Dept dept);
}
