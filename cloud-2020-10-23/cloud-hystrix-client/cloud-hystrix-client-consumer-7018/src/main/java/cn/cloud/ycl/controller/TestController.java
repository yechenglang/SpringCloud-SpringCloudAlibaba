package cn.cloud.ycl.controller;

import cn.cloud.ycl.feign.TestFeignService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Slf4j
@RestController
public class TestController {

    @Autowired
    private TestFeignService testFeignService;


    @RequestMapping("/ok/{id}")
    public String ok(@PathVariable("id") Integer id) {
        String result = testFeignService.ok(id);
        return result;
    }

    @RequestMapping("/timeout/{id}")
    public String timeout(@PathVariable("id") Integer id) {
        String result = testFeignService.timeout(id);
        return result;
    }

    @RequestMapping("/error/{id}")
    public String error(@PathVariable("id") Integer id) {
        String result = testFeignService.error(id);
        return result;
    }

    @RequestMapping("/circuitBreaker/{id}")
    public String circuitBreaker(@PathVariable("id") Integer id) {
        String result = testFeignService.circuitBreaker(id);
        return result;
    }

}
