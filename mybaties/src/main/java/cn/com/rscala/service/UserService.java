package cn.com.rscala.service;

import cn.com.rscala.dao.UserMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by hadoop on 2017/6/23.
 */
@Service
public class UserService {
    @Resource
    private UserMapper userDao;

    public UserMapper getUserMapper(){
        return this.userDao;
    }
}
