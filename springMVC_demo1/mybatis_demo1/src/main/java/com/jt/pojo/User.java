package com.jt.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import org.apache.ibatis.type.Alias;

import java.io.Serializable;

@Data //动态生成get/set/toString/equals/hashCode等方法
@Accessors(chain = true) //开启链式加载  重写set方法
@NoArgsConstructor       //无参构造
@AllArgsConstructor      //全参构造
//@Alias("User")  该注解需要一个一个标识 比较繁琐.
public class User implements Serializable {//以后扩展方便!!!
    private Integer id;
    private String name;
    private Integer age;
    private String sex;

   /* public User setId(Integer id){
        this.id = id;
        return this; //表示当前对象 运行期有效
    }

    public void xx(){
        User user = new User();
        //链式结构 重写set方法 要求返回user对象
        user.setName("xxx").setAge(10).setSex("女");
    }*/

}
