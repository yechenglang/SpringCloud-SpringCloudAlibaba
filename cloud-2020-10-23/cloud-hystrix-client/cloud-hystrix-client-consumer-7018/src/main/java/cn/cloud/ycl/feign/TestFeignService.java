package cn.cloud.ycl.feign;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@FeignClient(value = "cloud-hystrix-client-producer-7017")
public interface TestFeignService {

    @RequestMapping("/ok/{id}")
    String ok(@PathVariable(value = "id") Integer id);

    @RequestMapping("/timeout/{id}")
    String timeout(@PathVariable(value = "id") Integer id);

    @RequestMapping("/error/{id}")
    String error(@PathVariable(value = "id") Integer id);

}
