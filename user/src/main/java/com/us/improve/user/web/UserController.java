package com.us.improve.user.web;

import com.us.improve.user.service.ITaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName UserController
 * @Desciption TODO
 * @Author loren
 * @Date 2019/1/3 8:07 PM
 * @Version 1.0
 **/
@RestController
@RequestMapping("/api/v1/users")
public class UserController {

    @Autowired
    ITaskService taskService;

    @Value("${foo}")
    private String foo;

    @GetMapping
    public String getUser() {
        String task = taskService.getTask();
        String ret = "User: " + foo + ", Task: " + task;
        return ret;
    }

}
