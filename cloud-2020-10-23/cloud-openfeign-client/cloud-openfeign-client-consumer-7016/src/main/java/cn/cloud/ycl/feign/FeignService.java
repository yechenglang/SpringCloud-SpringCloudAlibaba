package cn.cloud.ycl.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@FeignClient(value = "cloud-openfeign-client-producer-7015")
public interface FeignService {

    @RequestMapping("/index")
    String index();

}
