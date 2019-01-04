package com.us.improve.feign.web;

import com.us.improve.feign.service.IFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName FeignController
 * @Desciption TODO
 * @Author loren
 * @Date 2019/1/4 3:23 PM
 * @Version 1.0
 **/
@RestController
@RequestMapping("/api/v1/feigns")
public class FeignController {

    @Autowired
    private IFeignService feignService;

    @GetMapping
    public String doRequest() {
        return feignService.doRequest();
    }

}
