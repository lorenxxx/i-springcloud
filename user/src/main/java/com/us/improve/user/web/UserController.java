package com.us.improve.user.web;

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

    @GetMapping
    public String getUserById() {
        return "Loren";
    }

}
