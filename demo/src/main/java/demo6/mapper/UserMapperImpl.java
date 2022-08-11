package demo6.mapper;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Repository;

@Repository
@PropertySource(value = "classpath:/addUser.properties", encoding = "UTF-8") // set properties file. add to spring
public class UserMapperImpl implements UserMapper{

    @Value("${name}")
    private String name;
    @Override
    public void addUser() {
        System.out.println(" New add user " + name);


    }
}
