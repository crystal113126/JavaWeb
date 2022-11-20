package com.jt.mapper;

import com.jt.pojo.Dog;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

//@Mapper
public interface DogMapper {

    List<Dog> findAll();
}
