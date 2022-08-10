package demo3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan("demo3")
@Configuration
public class SpringCatConfig {

    /**
     * 1. must be public
     * 2. must have return type and return the containers' object
     * 3. the method name is the Bean's Id;
     * 4. method must using @Bean annotation;
     */
    @Bean
    public Cat cat() {
        return new Cat();
    }

}
