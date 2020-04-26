package com.us.improve.user.service.impl;

import com.us.improve.user.provider.ITaskProvider;
import com.us.improve.user.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * @ClassName UserService
 * @Desciption User服务层
 * @Author loren
 * @Date 2020/4/26 8:49 PM
 * @Version 1.0
 **/
@Service
public class UserService implements IUserService {

    @Value("${foo}")
    private String foo;

    @Autowired
    ITaskProvider taskProvider;

    @Override
    public String getLoren() {
        String loren = foo;
        String task = taskProvider.getTask();
        String ret = "User: " + loren + ", Task: " + task;

        return ret;
    }

}
