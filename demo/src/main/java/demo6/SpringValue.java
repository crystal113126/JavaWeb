package demo6;

import demo6.config.SpringConfig;
import demo6.mapper.UserMapper;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringValue {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        UserMapper userMapper = context.getBean(UserMapper.class);
        userMapper.addUser();
    }
}
