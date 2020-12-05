package com.example.demo.dao;

import com.example.demo.pojo.Book;
import com.example.demo.pojo.User;
import org.springframework.stereotype.Repository;

@Repository
public interface HistoryMapper {
    Book[] collectByUser(User user);//通过用户选取收藏的书籍
}
