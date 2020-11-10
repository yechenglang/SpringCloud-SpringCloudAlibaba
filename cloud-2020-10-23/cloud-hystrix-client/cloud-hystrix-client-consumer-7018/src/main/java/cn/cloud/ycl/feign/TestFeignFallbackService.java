package cn.cloud.ycl.feign;

import org.springframework.stereotype.Component;

/**
 * 服务降级
 */
@Component
public class TestFeignFallbackService implements TestFeignService {
    @Override
    public String ok(Integer id) {
        return "ok 服务降级,consumer 7018,function TestFeignFallbackService";
    }

    @Override
    public String timeout(Integer id) {
        return "timeout 服务降级,consumer 7018,function TestFeignFallbackService";
    }

    @Override
    public String error(Integer id) {
        return "error 服务降级,consumer 7018,function TestFeignFallbackService";
    }

    @Override
    public String circuitBreaker(Integer id) {
        return "circuitBreaker 服务降级,consumer 7018,function TestFeignFallbackService";
    }
}
