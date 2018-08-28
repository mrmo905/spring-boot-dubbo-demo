package cn.echomo.dubbo.comsume;

import cn.echomo.service.UserService;
import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@EnableDubbo(scanBasePackages = "cn.echomo.dubbo")
public class DubboComsumeApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(DubboComsumeApplication.class, args);
    }
}
