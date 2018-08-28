package cn.echomo.dubbo.comsume.controller;

import cn.echomo.service.UserService;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Reference
    private UserService userService;

    @RequestMapping("/username/{id}")
    public String username(@PathVariable int id){
        return userService.getUsername(id);
    }
}
