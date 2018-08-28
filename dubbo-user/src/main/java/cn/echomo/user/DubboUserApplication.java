package cn.echomo.user;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubbo(scanBasePackages = "cn.echomo.user")
public class DubboUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(DubboUserApplication.class, args);
    }
}
