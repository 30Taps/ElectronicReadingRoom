package com.example.demo.dao;

import com.example.demo.pojo.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {

    User selectByUsername(String username);
}
