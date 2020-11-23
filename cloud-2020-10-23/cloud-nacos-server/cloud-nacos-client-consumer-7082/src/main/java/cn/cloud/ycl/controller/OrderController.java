package cn.cloud.ycl.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
@Slf4j
public class OrderController {


    @Resource
    private RestTemplate restTemplate;

    @Value("${server-url.nacos-user-service}")
    private String serviceName;


    @RequestMapping("/index/{id}")
    public String index(@PathVariable Long id) {
        return restTemplate.getForObject(serviceName + "/index/" + id, String.class) + "____ nacos client successful";
    }

}
