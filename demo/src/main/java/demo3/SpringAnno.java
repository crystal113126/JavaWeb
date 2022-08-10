package demo3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringAnno {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringCatConfig.class);
        Snake snake  = context.getBean(Snake.class);
        /*Cat cat = context.getBean(Cat.class);
        Cat cat1 = context.getBean(Cat.class);
        System.out.println(cat);
        System.out.println(cat1);
        cat.hello();*/
        snake.eat();

    }
}
