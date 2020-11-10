package cn.cloud.ycl.controller;

import cn.cloud.ycl.service.TestService;
import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@DefaultProperties(defaultFallback = "globalFallback")
public class TestController {

    @Autowired
    private TestService testService;

    @RequestMapping("/ok/{id}")
    public String ok(@PathVariable Integer id) {
        String result = testService.ok(id);
        log.info(result);
        return result;
    }

    @HystrixCommand
    @RequestMapping("/timeout/{id}")
    public String timeout(@PathVariable Integer id) {
        String result = testService.timeout(id);
        log.info(result);
        return result;
    }

    @HystrixCommand
    @RequestMapping("/error/{id}")
    public String error(@PathVariable Integer id) {
        String result = testService.error(id);
        log.info(result);
        return result;
    }

    String globalFallback(){
        return "全局控制降级方法,服务繁忙稍后再试！";
    }

}
