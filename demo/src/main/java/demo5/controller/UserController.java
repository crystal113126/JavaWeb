package demo5.controller;

import demo5.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {
    @Autowired
    UserService userService;

    public void addUser(){
        userService.addUser();
    }
}
