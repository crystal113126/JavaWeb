package demo3;

import org.springframework.context.annotation.*;

@ComponentScan("demo3")
@Configuration
public class SpringCatConfig {
    /**
     * For self define class;
     * 1. must be public
     * 2. must have return type and return the containers' object
     * 3. the method name is the Bean's Id;
     * 4. method must using @Bean annotation;
     */
    @Bean
    @Lazy
    @Scope("prototype")
    public Cat cat() {
        return new Cat();
    }

    @Bean
    public Snake snake(){
        return new Snake();
    }

}
