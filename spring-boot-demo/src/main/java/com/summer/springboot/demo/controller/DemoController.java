package com.summer.springboot.demo.controller;

import com.summer.springboot.demo.task.ThreadUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.async.DeferredResult;

import javax.annotation.Resource;

@RestController
public class DemoController {
    @Resource
    private ThreadUtils threadUtils;
    private static final Log log = LogFactory.getLog(DemoController.class);

    @RequestMapping("/hello1")
    public long hello1() {
        log.info("hello1 请求 开始");
        long time = doService1();
        log.info("hello1 请求 结束");
        return time;
    }

    private long doService1() {
        long time = System.currentTimeMillis();
        log.info("hello1 业务响应 开始" + time);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        log.info("hello1 业务响应 结束" + time);
        return time;
    }


    @RequestMapping("/hello2")
    public DeferredResult<Long> hello2() {
        log.info("hello2 请求 开始");
        DeferredResult<Long> res = new DeferredResult<>();
        threadUtils.setResult(res);
        log.info("hello2 请求 结束");
        return res;
    }


}
