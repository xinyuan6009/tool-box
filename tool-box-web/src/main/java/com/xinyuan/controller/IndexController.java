package com.xinyuan.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: 欣元
 * @date: 2018/2/13 下午11:37
 */

@RestController
public class IndexController {

    @Value("${test-v}")
    private String testP;

    @RequestMapping("/index.html")
    public String index(){
        return "<h1>Welcome!</h1>";
    }

}
