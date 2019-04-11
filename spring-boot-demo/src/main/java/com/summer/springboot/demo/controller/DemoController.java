package com.summer.springboot.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.async.DeferredResult;

@RestController
public class DemoController {
    @RequestMapping("/hello")
    public DeferredResult<Long> hello() throws InterruptedException {
        DeferredResult<Long> res = new DeferredResult<>();
        long time = System.currentTimeMillis();
        System.out.println("aaa" + time);
        Thread.sleep(5000);
        res.setResult(time);
        return res;
    }
}
