package cn.cloud.ycl.controller;

import cn.cloud.ycl.service.TestService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class TestController {

    @Autowired
    private TestService testService;

    @RequestMapping("/ok/{id}")
    public String ok(@PathVariable Integer id) {
        String result = testService.ok(id);
        log.info(result);
        return result;
    }

    @RequestMapping("/timeout/{id}")
    public String timeout(@PathVariable Integer id) {
        String result = testService.timeout(id);
        log.info(result);
        return result;
    }

    @RequestMapping("/error/{id}")
    public String error(@PathVariable Integer id) {
        String result = testService.error(id);
        log.info(result);
        return result;
    }


}
