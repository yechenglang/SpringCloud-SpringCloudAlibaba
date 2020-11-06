package cn.cloud.ycl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class TestController {

    @Autowired
    private RestTemplate restTemplate;

    private static final String url = "http://cloud-ribbon-client-producer";

    @RequestMapping("/")
    public String index() {
        return restTemplate.getForObject(url + "/index", String.class);
    }

}
