package com.us.improve.task.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName TaskController
 * @Desciption TODO
 * @Author loren
 * @Date 2020/4/26 5:50 PM
 * @Version 1.0
 **/
@RestController
@RequestMapping("/api/v1/tasks")
public class TaskController {

    @GetMapping
    public String getTask() {
        return "FirstTask";
    }

}
