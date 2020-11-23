package cn.cloud.ycl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

@SpringBootApplication
@EnableDiscoveryClient
public class CloudNacosServer7081Application {

    public static void main(String[] args) {
        SpringApplication.run(CloudNacosServer7081Application.class, args);
    }


}
