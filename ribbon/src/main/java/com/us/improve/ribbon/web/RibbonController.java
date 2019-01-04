package com.us.improve.ribbon.web;

import com.us.improve.ribbon.service.IRibbonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName RibbonController
 * @Desciption TODO
 * @Author loren
 * @Date 2019/1/4 12:19 PM
 * @Version 1.0
 **/
@RestController
@RequestMapping("/api/v1/ribbons")
public class RibbonController {

    @Autowired
    private IRibbonService ribbonService;

    @GetMapping
    public String doRequest() {
        return ribbonService.doRequest();
    }

}
