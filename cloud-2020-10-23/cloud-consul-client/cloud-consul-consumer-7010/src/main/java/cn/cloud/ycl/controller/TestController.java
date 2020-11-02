package cn.cloud.ycl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
public class TestController {

    @Resource
    private RestTemplate restTemplate;

    public static final String invoke_url = "http://cloud-consul-producer-7009";


    @RequestMapping("/")
    public String index() {
        return restTemplate.getForObject(invoke_url + "/index", String.class);
    }


}
