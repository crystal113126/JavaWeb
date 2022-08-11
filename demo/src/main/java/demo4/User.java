package demo4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class User {
    @Autowired
    private Pet pet;
    public void hello(){
        pet.hello();
    }


}
