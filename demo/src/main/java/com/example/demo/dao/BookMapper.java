package com.example.demo.dao;

import com.example.demo.pojo.Book;
import org.springframework.stereotype.Repository;

@Repository
public interface BookMapper {
    Book selectByBookname(String bookname);
}
