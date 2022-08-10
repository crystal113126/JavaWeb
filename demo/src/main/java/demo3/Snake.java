package demo3;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


public class Snake {
    public Snake(){
        System.out.println("do snack construct");
    }
    @PostConstruct
    public void init(){
        System.out.println("Init!!!");
    }

    public void eat(){
        System.out.println("go around and find food");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("snack run away!");
    }
}
