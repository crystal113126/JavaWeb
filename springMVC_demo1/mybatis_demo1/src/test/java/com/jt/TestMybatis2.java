package com.jt;

import com.jt.mapper.UserMapper2;
import com.jt.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class TestMybatis2 {

    @Autowired
    private UserMapper2 userMapper;

    /**
     * 需求: 根据用户不为null的属性充当where条件
     */
    @Test
    public void testSqlWhere(){
        User user = new User();
        user.setAge(3000).setSex("男");
        List<User> userList = userMapper.findSqlWhere(user);
        System.out.println(userList);
    }

    /**
     * 需求: 修改id=1 的数据 name="北极熊",age=4000 sex="男"
     */
    @Test
    public void testUpdateUser(){
        User user = new User();
        user.setId(1).setAge(5000);
        userMapper.updateUser(user);
        System.out.println("更新成功!!!");
    }

    /**
     * 如果name有值,则根据name查询.
     * 如果name没有值,则根据age查询.
     * 如果name/age都没有值,则根据sex查询
     */
    @Test
    public void testChoose(){
        User user = new User();
        user.setSex("男");
        List<User> userList = userMapper.findChoose(user);
        System.out.println(userList);
    }
}
