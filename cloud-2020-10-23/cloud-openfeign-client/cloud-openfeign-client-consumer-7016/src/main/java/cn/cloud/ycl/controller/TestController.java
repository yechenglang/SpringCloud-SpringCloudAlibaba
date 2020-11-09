package cn.cloud.ycl.controller;

import cn.cloud.ycl.feign.FeignService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class TestController {

    @Resource
    private FeignService feignService;

    @RequestMapping("/")
    public String getIndex() {
        return feignService.index();
    }

    @RequestMapping("/timeout")
    public String getTimeOutIndex() {
        return feignService.timeIndex();
    }


}
