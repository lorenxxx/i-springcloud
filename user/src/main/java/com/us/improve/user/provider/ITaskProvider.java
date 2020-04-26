package com.us.improve.user.provider;

import com.us.improve.user.provider.fallback.TaskProviderFallBack;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @ClassName ITaskProvider
 * @Desciption Task服务提供者
 * @Author loren
 * @Date 2020/4/26 7:42 PM
 * @Version 1.0
 **/
@FeignClient(value = "service-task", fallback = TaskProviderFallBack.class)
public interface ITaskProvider {

    @RequestMapping(value = "/task/api/v1/tasks", method = RequestMethod.GET)
    String getTask();

}