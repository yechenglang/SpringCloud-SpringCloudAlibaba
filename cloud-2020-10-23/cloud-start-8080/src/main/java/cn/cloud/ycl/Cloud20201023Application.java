package cn.cloud.ycl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 叶成浪
 * @date 2020.10.23
 */
@SpringBootApplication
@RestController
public class Cloud20201023Application {

    public static void main(String[] args) {
        SpringApplication.run(Cloud20201023Application.class,args);
    }

    @RequestMapping("/index")
    public String getIndex(){
        return "index ok";
    }

}
