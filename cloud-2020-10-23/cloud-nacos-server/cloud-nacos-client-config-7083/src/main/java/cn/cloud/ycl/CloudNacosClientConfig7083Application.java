package cn.cloud.ycl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CloudNacosClientConfig7083Application {

    public static void main(String[] args) {
        SpringApplication.run(CloudNacosClientConfig7083Application.class, args);
    }

}
