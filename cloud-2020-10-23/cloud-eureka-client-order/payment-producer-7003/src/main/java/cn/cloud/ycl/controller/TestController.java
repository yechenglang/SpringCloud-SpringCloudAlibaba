package cn.cloud.ycl.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 叶成浪
 */
@RestController
@Slf4j
public class TestController {

    @Resource
    private DiscoveryClient discoveryClient;

    @GetMapping("/")
    public String get() {
        return "ok";
    }

    @GetMapping(value = "/discovery")
    @ResponseBody
    public Object discovery() {
        List<String> services = discoveryClient.getServices();
        services.forEach(c -> {
            log.info("***service=" + c);
        });

        List<ServiceInstance> instances = discoveryClient.getInstances(services.get(1));
        instances.forEach(c -> {
            log.info("***instance:, serviceId=" + c.getServiceId() + "\t"
                    + "host=" + c.getHost() + "\t" + "port=" + c.getPort() + "\t" + "uri=" + c.getUri());
        });
        return discoveryClient;
    }

}
