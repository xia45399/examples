package com.summer.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/cgi/test")
public class TestController {

    @RequestMapping("test1")
    public Object test() {
        return "a";
    }

    @RequestMapping("test2")
    public Object test2(Long a) {
        return a;
    }

    @RequestMapping("test3")
    public Object test3() {
        Map<String, Object> map = new HashMap<>();
        map.put("a", "a");
        map.put("b", "啊");
        map.put("c", 1);
        return map;
    }
}
