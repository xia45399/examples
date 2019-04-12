package com.summer.springboot.demo.task;

import com.summer.springboot.demo.controller.DemoController;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.async.DeferredResult;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Component
public class ThreadUtils {
    private static final Log log = LogFactory.getLog(DemoController.class);
    private static ExecutorService pool = Executors.newCachedThreadPool();


    public void setResult(DeferredResult<Long> result) {
        Runnable task = new Runnable() {
            @Override
            public void run() {
                doService2(result);
            }
        };
        pool.submit(task);
    }

    private void doService2(DeferredResult<Long> res) {
        long time = System.currentTimeMillis();
        log.info("service2 响应 开始" + time);
        try {
            Thread.sleep(60000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        log.info("service2 响应 结束" + time);
        res.setResult(time);
    }
}
