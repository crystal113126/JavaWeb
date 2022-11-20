package com.jt;

import com.jt.mapper.UserMapper;
import com.jt.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@SpringBootTest
public class TestMybatisCache5 {

    @Autowired
    private UserMapper userMapper; //底层实现中包含了SqlSession

    /**
     * 测试:mybatis的一级缓存, SqlSession级别
     * SpringBoot测试说明:
     *   SpringBoot中用户在使用userMapper接口时,用户每调用一次.
     *   SpringBoot就会新创建一个SqlSession.
     * 如何解决多个SqlSession的问题?
     * 解决方案:
     *  利用@Transactional的事务的注解,将多个SqlSession控制为一个.
     */
    @Test
    @Transactional //事务的注解 方法中用户使用同一个SqlSession  单线程操作
    public void testCache1(){
        List<User> list1 = userMapper.findAll(); //sqlSession1
        List<User> list2 = userMapper.findAll(); //sqlSession1
        List<User> list3 = userMapper.findAll(); //SqlSession1
    }
    /**
     * 测试二级缓存
     * 总结: 多线程条件下共享数据,要求数据必须序列化.
     * 高级缓存服务器: redis 集群中使用的
     */
    @Test
    public void testCache2(){
        //第一次查询数据库获取的list1的集合对象,该对象需要保存到缓存中,为了后续线程使用,该对象必须序列化
        List<User> list1 = userMapper.findAll(); //sqlSession1  线程A
        //第二个线程查询数据.有二级缓存的存在.所以从缓存中获取数据.所以直接反序列化该对象获取结果.
        List<User> list2 = userMapper.findAll(); //sqlSession2  线程B
        //第三个线程查询数据,所以直接反序列化该对象获取结果.
        List<User> list3 = userMapper.findAll(); //SqlSession3  线程C
    }
}
