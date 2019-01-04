package com.us.improve.ribbon.service.impl;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.us.improve.ribbon.service.IRibbonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName RibbonService
 * @Desciption TODO
 * @Author loren
 * @Date 2019/1/4 11:24 AM
 * @Version 1.0
 **/
@Service
public class RibbonService implements IRibbonService {

    @Autowired
    private RestTemplate restTemplate;

    @Override
    @HystrixCommand(fallbackMethod = "doRequestError")
    public String doRequest() {
        return restTemplate.getForObject("http://service-user/user/api/v1/users", String.class);
    }

    public String doRequestError() {
        return "Sorry, error.";
    }

}
