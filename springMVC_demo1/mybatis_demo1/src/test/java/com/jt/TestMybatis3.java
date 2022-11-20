package com.jt;

import com.jt.mapper.DogMapper;
import com.jt.pojo.Dog;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class TestMybatis3 {

    @Autowired
    private DogMapper dogMapper;

    @Test
    public void testFindAll(){
        List<Dog> dogList = dogMapper.findAll();
        System.out.println(dogList);
    }
}
