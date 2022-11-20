package learn.example.demo2.demo1;

import learn.example.demo2.demo1.config.SpringConfig;
import learn.example.demo2.demo1.proxy.JDKProxy;
import learn.example.demo2.demo1.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringTx {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        UserService userService = context.getBean(UserService.class);
        UserService proxy = (UserService) JDKProxy.getProxy(userService);
        System.out.println(proxy);
        proxy.addUser();
        proxy.deleteUser();


       // userService.addUser();
       // userService.deleteUser();

    }
}
