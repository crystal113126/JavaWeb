package com.jt;

import com.jt.mapper.UserMapper;
import com.jt.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SpringBootTest //该注解的作用启动spring容器中,之后动态的获取对象
public class TestMybatis {

    @Autowired  //IDEA编译异常 不影响代码的执行
    private UserMapper userMapper;

    @Test
    public void test01(){
        System.out.println(userMapper.getClass());
        List<User> userList = userMapper.findAll();
        System.out.println(userList);
    }

    /**
     * 业务需求:  根据ID查询数据
     * 参数:  id = 1
     */
    @Test
    public void test02(){
        int id = 1;
        User user = userMapper.findUserById(id);
        System.out.println(user);
    }

    /**
     * 实现用户入库操作
     */
    @Test
    public void saveUser(){
        User user = new User();
        user.setName("元旦快乐").setAge(2022).setSex("女");
        //如果需要返回值  则int接收
        int rows = userMapper.saveUser(user);
        //如果不需要返回值 则void标识
        //userMapper.saveUser(user);
        System.out.println("入库成功:影响:"+rows+"行");
    }

    /**
     * 3.修改操作  将name="元旦快乐" 改为age=17,sex=男
     */
     @Test
     public void updateUser(){
         User user = new User();
         user.setName("元旦快乐").setAge(17).setSex("男");
         userMapper.updateUser(user);
         System.out.println("修改操作成功!!!");
     }
     //注意事项: 暂时练习时接口方法的参数只写1个. 否则程序必然报错....
     //4.删除操作  将name="元旦快乐"的数据删除
     @Test
     public void deleteUser(){
         String name = "元旦快乐";
         userMapper.deleteUser(name);
         System.out.println("删除成功!!!");
     }

    /**
     * 业务: 查询age> 18岁  and  age <100的用户.
     * 知识点:
     *      1.mybatis的参数可以是基本类型或者字符串.
     *      2.如果遇到多个参数,应该使用对象(POJO)进行封装.
     *      3.如果通过pojo封装不方便.则使用功能最为强大的Map进行封装
     *      4.Mybatis的接口方法中只允许传递单值
     */
    @Test
    public void testFindUserByAge(){
        Map<String,Object> map = new HashMap<>();
        map.put("minAge",18);
        map.put("maxAge",100);
        List<User> userList = userMapper.findUserByAge(map);
        System.out.println(userList);
    }

    @Test
    public void testFindUserByAge2(){
        int minAge = 18;
        int maxAge = 100;
        List<User> userList = userMapper.findUserByAge2(minAge,maxAge);
        System.out.println(userList);
    }

    /**
     * 需求: 查询name中 包含"君"字的数据
     * Sql:  where name like "%君%"
     */
    @Test
    public void findByLike(){
        String key = "君";
        List<User> userList = userMapper.findByLike(key);
        System.out.println(userList);
    }

    /**
     * 业务说明: 集合参数的用法
     * 需求: 查询id=1,3,4,5,6的数据
     * Sql:  where id in (1,3,4,5,6)
     */
    @Test
    public void findInArray(){
        Integer[] ids1 = {1,3,4,5,6};
        List<Integer> list = Arrays.asList(ids1);
        List<User> userList = userMapper.findInArray(list);
        System.out.println(userList);
    }

    @Test
    public void findInMap(){
        //准备2个集合,测试map集合封装
        Integer[] ids1 = {1,3};
        Integer[] ids2 = {4,5,6};
        List<User> list = userMapper.findInMap(ids1,ids2);
        System.out.println(list);
    }












}
