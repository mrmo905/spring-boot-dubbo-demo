package cn.echomo.user.service.impl;

import cn.echomo.service.UserService;
import com.alibaba.dubbo.config.annotation.Service;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public String getUsername(int id) {
        switch (id){
            case 1 : return "zhangsan";
            case 2 : return "lisi";
            case 3 : return "wangwu";
            case 4 : return "zhaosi";
            default: return "can't find name";
        }
    }
}
