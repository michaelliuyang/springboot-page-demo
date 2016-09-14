package com.springboot.jsp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by liuyang on 16/9/13.
 */
@RestController
public class IndexController {

    @RequestMapping("index")
    public String index() {
        return "hello world";
    }

}
