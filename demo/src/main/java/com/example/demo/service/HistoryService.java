package com.example.demo.service;

import com.example.demo.pojo.Book;
import com.example.demo.pojo.User;

public interface HistoryService {

    public boolean iscollect(User user);//判断是否收藏；
    public Book[] recollect(User user);//返回收藏的书籍
}
