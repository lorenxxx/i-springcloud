package com.us.improve.feign.service;

import com.us.improve.feign.service.impl.FeignServiceHystrix;
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
@FeignClient(value = "service-user", fallback = FeignServiceHystrix.class)
public interface IFeignService {

    @RequestMapping(value = "/user/api/v1/users", method = RequestMethod.GET)
    String doRequest();

}