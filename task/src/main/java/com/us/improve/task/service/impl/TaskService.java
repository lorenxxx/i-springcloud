package com.us.improve.task.service.impl;

import com.us.improve.task.service.ITaskService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * @ClassName TaskService
 * @Desciption Task服务层
 * @Author loren
 * @Date 2020/4/26 8:38 PM
 * @Version 1.0
 **/
@Service
public class TaskService implements ITaskService {

    @Value("${server.port}")
    private String port;

    @Override
    public String getFirstTask() {
        return "FirstTask" + "[Port: " + port + "]";
    }

}
