package demo4;

import org.springframework.stereotype.Component;

@Component
public class Dog implements Pet{

    @Override
    public void hello() {
        System.out.println("Hello");
    }
}
