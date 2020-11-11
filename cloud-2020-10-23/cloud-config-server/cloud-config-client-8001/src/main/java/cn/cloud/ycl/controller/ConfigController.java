package cn.cloud.ycl.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigController {

    @Value("${spring.application.name}")
    private String name;

    @RequestMapping("/index")
    public String index() {
        return "name = " + name;
    }

}
