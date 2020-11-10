package cn.cloud.ycl.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

@Service
public class TestService {

    @Value("${server.port}")
    private String port;

    public String ok(Integer id) {
        return "thread name = " + Thread.currentThread().getName() + ", ok , id= " + id + ",port=" + port;
    }

    /**
     * 服务降级 方法timeoutHandler
     *
     * @param id
     * @return
     */
//    @HystrixCommand(fallbackMethod = "timeoutHandler", commandProperties = {
//            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "3000")
//    })
    public String timeout(Integer id) {
        int timeNumber = 4;
        time(timeNumber);
        return "thread name = " + Thread.currentThread().getName() + ", Timeout , id= " + id + ", port=" + port;
    }

    /**
     * 服务降级 方法errorHandler
     *
     * @param id
     * @return
     */
    @HystrixCommand(fallbackMethod = "errorHandler", commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "3000")
    })
    public String error(Integer id) {
        int i = 10 / 0;
        return "thread name = " + Thread.currentThread().getName() + ", error ok, port" + port;
    }

    public String timeoutHandler(Integer id) {
        return "thread name = " + Thread.currentThread().getName() + ",port=" + port + " 服务器繁忙,请稍后再试！ ";
    }

    public String errorHandler(Integer id) {
        return "thread name = " + Thread.currentThread().getName() + ",port=" + port + ",id=" + id + " 服务器错误!";
    }


    void time(Integer timeNumber) {
        try {
            TimeUnit.SECONDS.sleep(timeNumber);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
