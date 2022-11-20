package com.jt.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;


import java.io.Serializable;

@Data //动态生成get/set/toString/equals/hashCode等方法<lombok>
@Accessors(chain = true) //开启链式加载  重写set方法
@NoArgsConstructor       //无参构造
@AllArgsConstructor      //全参构造
//@Alias("User")  该注解需要一个一个标识 比较繁琐.
public class User implements Serializable {//以后扩展方便!!!

    private Integer customer_id;
    private String first_name;
    private String last_name;
    private String address;
    private String city;
    private String state;
    private Integer points;

}
