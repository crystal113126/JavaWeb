package learn.example.demo2.demo2.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class SpringAOP {
    /**
     * 切面 = 切入点 + 通知
     * 切入点
     * 切入表达式
     * 通知
     */

    //@Pointcut("bean(userServiceImpl)")
    //@Pointcut("within( learn.example.demo2.demo2)")
    @Pointcut("execution(*  learn.example.demo2.demo2.service..*.add*(..))")
    public void pointcut() {
        System.out.println("here is pointcut");
    }

    @Before("pointcut()")
    public void before(){
        System.out.println("before the pointcut");

    }
}
