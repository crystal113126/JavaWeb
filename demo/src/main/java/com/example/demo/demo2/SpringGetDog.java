package com.example.demo.demo2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringGetDog {
    public static void main(String[] args) {
        String resource = "spring.xml"; //define file;
        ApplicationContext context = new ClassPathXmlApplicationContext(resource);
        Dog dog = (Dog) context.getBean("dog");
        Dog dog2 = context.getBean(Dog.class);
        dog2.hello();
        getDog();


    }

    public static void getDog(){
        try{
            Dog dog = (Dog) Class.forName("com.example.demo.demo2.Dog").getDeclaredConstructor().newInstance();
            dog.hello();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
