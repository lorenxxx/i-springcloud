package com.us.improve.feign.service.impl;

import com.us.improve.feign.service.IFeignService;
import org.springframework.stereotype.Service;

/**
 * @ClassName FeignServiceHystrix
 * @Desciption TODO
 * @Author loren
 * @Date 2019/1/4 5:27 PM
 * @Version 1.0
 **/
@Service
public class FeignServiceHystrix implements IFeignService {

    @Override
    public String doRequest() {
        return "Sorry, error.";
    }

}
