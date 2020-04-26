package com.us.improve.user.web;

import com.us.improve.user.provider.ITaskProvider;
import com.us.improve.user.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName UserController
 * @Desciption User控制层
 * @Author loren
 * @Date 2019/1/3 8:07 PM
 * @Version 1.0
 **/
@RestController
@RequestMapping("/api/v1/users")
public class UserController {

    @Autowired
    private IUserService userService;

    @GetMapping
    public String getUser() {
        return userService.getLoren();
    }

}
