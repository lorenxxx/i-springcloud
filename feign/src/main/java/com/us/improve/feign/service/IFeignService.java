package com.us.improve.feign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @ClassName IFeignService
 * @Desciption TODO
 * @Author loren
 * @Date 2019/1/4 3:19 PM
 * @Version 1.0
 **/
@FeignClient("user")
public interface IFeignService {

    @RequestMapping(value = "/api/v1/users", method = RequestMethod.GET)
    String doRequest();

}