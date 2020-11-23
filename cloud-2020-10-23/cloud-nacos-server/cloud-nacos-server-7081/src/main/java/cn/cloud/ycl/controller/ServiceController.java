package cn.cloud.ycl.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceController {

    @Value("${server.port}")
    private String port;

    @RequestMapping(value = "/index/{id}")
    public String index(@PathVariable Long id) {
        return "nacos service port:" + port + ", client send id = " + id;
    }


}
