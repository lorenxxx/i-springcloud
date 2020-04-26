package com.us.improve.user.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @ClassName ITaskService
 * @Desciption TODO
 * @Author loren
 * @Date 2020/4/26 7:42 PM
 * @Version 1.0
 **/
@FeignClient("service-task")
public interface ITaskService {

    @RequestMapping(value = "/task/api/v1/tasks", method = RequestMethod.GET)
    String getTask();

}