package learn.example.demo2.demo1.service;

import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    @Override
    public void addUser() {
        System.out.println("Add new user");
    }

    @Override
    public void deleteUser() {
        System.out.println("delete user");

    }
}
