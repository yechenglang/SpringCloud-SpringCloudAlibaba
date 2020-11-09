package cn.cloud.ycl.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

@RestController
public class TestController {

    @Value("${server.port}")
    private String port;

    @RequestMapping("/index")
    public String index() {
        return "server port : " + port + " , hello ycl";
    }

    @RequestMapping("/timeIndex")
    public String timeIndex() {
        timeout();
        return "server port : " + port + " , hello ycl";
    }

    public void timeout() {
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
