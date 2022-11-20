package com.jt.mapper;

import com.jt.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;


@Mapper //将接口交给Spring容器管理 Map<userMapper,JDK代理对象>
//@Repository //将持久层交给Spring容器管理
public interface UserMapper {

    void updateUserid(User user);

    //查询所有的用户信息
    List<User> findAll();

    User findUserById(int id);

    int saveUser(User user);

    void updateUser(User user);

    void deleteUser(String name);

    List<User> findUserByPoints(Map<String, Object> map);

    List<User> findUserByPoints2( @Param("minPoints") int minPoints, @Param("maxPoints") int maxPoints);

    List<User> findUserLike(String key);

    List<User> findId(Integer[] ids);


    void testUpdateUser(User user);

    List<User> testFindWhere(User user);
}
