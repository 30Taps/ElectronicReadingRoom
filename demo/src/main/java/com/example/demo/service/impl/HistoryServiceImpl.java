package com.example.demo.service.impl;

import com.example.demo.pojo.Book;
import com.example.demo.pojo.User;
import com.example.demo.service.HistoryService;
import org.springframework.stereotype.Service;

@Service
public class HistoryServiceImpl implements HistoryService {

    @Override
    public boolean iscollect(User user) {
        return false;
    }

    @Override
    public Book[] recollect(User user) {
        return new Book[0];
    }
}
