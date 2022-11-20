package learn.example.demo2.demo2;

import learn.example.demo2.demo2.service.UserService;
import learn.example.demo2.demo2.config.SpringConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;



public class Spring_AOP {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        UserService userService = context.getBean(UserService.class);
        userService.addUser();
    }
}
