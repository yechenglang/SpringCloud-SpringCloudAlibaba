package cn.cloud.ycl.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.UUID;

/**
 * @author 叶成浪
 * @date 2020.10.29
 *
 */
@RestController
@Slf4j
public class TestController {


    public static final String invoke_url="http://cloud-zookeeper-producer-7007";

    @Resource
    private RestTemplate restTemplate;


    @RequestMapping(value = "/paymentInfo")
    public String paymentInfo(){
        String result = restTemplate.getForObject(invoke_url+"/index",String.class);
        log.info("result:"+result);
        return result;
    }

}
