package com.jt;

import com.jt.mapper.UserMapper;
import com.jt.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SpringBootTest(classes = MybatisDemo1Application.class)
public class TestMybatis {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void test01(){

        List<User> userList = userMapper.findAll();
        System.out.println(userList);
    }

    @Test
    public void test02() {
        int id = 1;
        User user = userMapper.findUserById(id);
        System.out.println(user);
    }

    /*
    insert
     */
    @Test
    public void saveUser() {
        User user = new User();
        user.setFirst_name("France").setLast_name("Can").setAddress("12 North Cycle Rd").setCity("Knoxville").setState("TN").setPoints(1617);
        int rows = userMapper.saveUser(user);
        System.out.println("Save the user and impact "+rows);
    }

    @Test
    public void UpdateUser() {
        User user = new User();
        user.setCustomer_id(12).setState("NY").setPoints(331);
        userMapper.updateUser(user);
        System.out.println("updated!");
    }
    @Test
    public void deleteUser() {
        String name = "Kelly";
        userMapper.deleteUser(name);
        System.out.println("deleted");
    }


    @Test
    public void findUserByPoints() {
        Map<String,Object> map = new HashMap<>();
        map.put("maxPoints", 2000);
        map.put("minPoints", 500);
        List<User> resultList= userMapper.findUserByPoints(map);
        System.out.println(resultList);
    }

    @Test
    public void findUserByPoints2() {
        int maxPoints = 2000;
        int minPoints = 500;
        List<User> resultList= userMapper.findUserByPoints2(minPoints, maxPoints);
        System.out.println(resultList);
    }

    @Test
    public void findUserLike() {
        String key = "ca";
       List<User> userList = userMapper.findUserLike(key);
       System.out.println(userList);
    }

    @Test
    public void findId() {
        Integer[] ids = {1,3,5};
        List<User> userList = userMapper.findId(ids);
        System.out.println(userList);
    }


    @Test
    public void testUpdateUser() {
        User user = new User();
        user.setCustomer_id(12).setState("NY");
        userMapper.testUpdateUser(user);
        System.out.println("updated");

    }

    @Test
    public void testChoose() {
        User user = new User();
        user.setCustomer_id(13).setFirst_name("France").setLast_name("Can").setAddress("12 North Cycle Rd").setCity("Knoxville").setState("TN").setPoints(1617);
    }


}
