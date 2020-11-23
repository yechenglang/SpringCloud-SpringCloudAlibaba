package cn.cloud.ycl.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RefreshScope  //nacos也支持自动更新
public class ConfigController {

    @Value("${config.info}")
    private String configInfo;

    @RequestMapping("/index")
    public String index() {
        return configInfo;
    }

}
