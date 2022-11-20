package learn.example.demo2.demo2.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("learn.example.demo2.demo2")
@EnableAspectJAutoProxy
public class SpringConfig {
}
