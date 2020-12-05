package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/search")
public class SearchController {
    @RequestMapping("/")
    public String Search(HttpServletRequest request){
        return "book";
    }
}
