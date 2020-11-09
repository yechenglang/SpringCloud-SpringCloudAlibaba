package cn.cloud.ycl.controller;

import cn.cloud.ycl.lb.MyLb;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.net.URI;
import java.util.List;

@RestController
public class TestController {

    @Resource
    private RestTemplate restTemplate;

    @Autowired
    private MyLb myLb;

    private static final String serviceName = "cloud-ribbon-client-producer";

    @Resource
    private DiscoveryClient discoveryClient;

    @RequestMapping("/")
    public String index() {
        List<ServiceInstance> instances = discoveryClient.getInstances(serviceName);
        if (instances == null || instances.size() <= 0) {
            return null;
        }
        ServiceInstance serviceInstance = myLb.instances(instances);
        URI uri = serviceInstance.getUri();

        return restTemplate.getForObject(uri + "/index", String.class);
    }

}
