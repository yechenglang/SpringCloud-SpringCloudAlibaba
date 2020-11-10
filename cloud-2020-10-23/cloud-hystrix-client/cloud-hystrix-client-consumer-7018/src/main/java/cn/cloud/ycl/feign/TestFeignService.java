package cn.cloud.ycl.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@FeignClient(value = "cloud-hystrix-client-producer-7017")
public interface TestFeignService {

    @RequestMapping("/ok/{id}")
    public String ok(@PathVariable(value = "id") Integer id);

    @RequestMapping("/timeout/{id}")
    public String timeout(@PathVariable(value = "id") Integer id);

    @RequestMapping("/error/{id}")
    public String error(@PathVariable(value = "id") Integer id);
}
