package com.summer.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cgi/test")
public class TestController {

    @RequestMapping("test1")
    public Object test() {
        return "a";
    }
}
