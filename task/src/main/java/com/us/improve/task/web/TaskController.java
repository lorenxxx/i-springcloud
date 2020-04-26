package com.us.improve.task.web;

import com.us.improve.task.service.ITaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName TaskController
 * @Desciption Task控制层
 * @Author loren
 * @Date 2020/4/26 5:50 PM
 * @Version 1.0
 **/
@RestController
@RequestMapping("/api/v1/tasks")
public class TaskController {

    @Autowired
    private ITaskService taskService;

    @GetMapping
    public String getTask() {
        return taskService.getFirstTask();
    }

}
