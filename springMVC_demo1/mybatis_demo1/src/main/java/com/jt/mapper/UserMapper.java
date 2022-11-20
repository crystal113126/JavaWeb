package com.jt.mapper;

import com.jt.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

//@Mapper //将接口交给Spring容器管理 Map<userMapper,JDK代理对象>
//@Repository //将持久层交给Spring容器管理
public interface UserMapper {
    //查询所有的用户信息
    List<User> findAll();

    User findUserById(int id);

    int saveUser(User user);

    void updateUser(User user);

    void deleteUser(String name);

    List<User> findUserByAge(Map<String, Object> map);
    //如果参数是多值,则需要封装为单值Map
    //@Param将参数封装为Map集合
    List<User> findUserByAge2(@Param("minAge") int minAge,
                              @Param("maxAge") int maxAge);

    List<User> findByLike(String key);

    //List<User> findInArray(Integer[] ids1);
    List<User> findInMap(@Param("ids1") Integer[] ids1,
                         @Param("ids2") Integer[] ids2);

    List<User> findInArray(List<Integer> list);
}
