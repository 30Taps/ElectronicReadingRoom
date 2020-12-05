package com.example.demo.service.impl;

import com.example.demo.dao.BookMapper;
import com.example.demo.service.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class SearchServiceImpl implements SearchService {
    @Autowired
    BookMapper bookMapper;
    public boolean searchbook(String bookname){
        return false;
    }
}
