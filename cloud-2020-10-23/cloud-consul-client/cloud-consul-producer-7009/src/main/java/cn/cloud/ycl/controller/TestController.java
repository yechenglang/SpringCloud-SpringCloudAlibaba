package cn.cloud.ycl.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @author 叶成浪
 * @date 2020.10.29
 *
 */
@RestController
public class TestController {

    @Value("${server.port}")
    private String port;

    @RequestMapping("/index")
    public String index(){
        return "Spring with consul "+port+"\t "+ UUID.randomUUID().toString();
    }

}
