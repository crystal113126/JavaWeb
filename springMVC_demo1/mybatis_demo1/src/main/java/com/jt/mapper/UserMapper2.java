package com.jt.mapper;

import com.jt.pojo.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

//@Mapper //将接口的代理对象交给Spring容器管理
public interface UserMapper2 {
    List<User> findSqlWhere(User user);

    void updateUser(User user);

    List<User> findChoose(User user);
}
