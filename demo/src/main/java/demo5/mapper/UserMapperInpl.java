package demo5.mapper;

import org.springframework.stereotype.Repository;

@Repository // for data layer
public class UserMapperInpl implements UserMapper{
    @Override
    public void addUser() {
        System.out.println("Add a new user");
    }
}
