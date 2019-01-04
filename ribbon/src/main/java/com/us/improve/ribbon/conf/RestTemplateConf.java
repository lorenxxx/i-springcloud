package com.us.improve.ribbon.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName RestTemplateConf
 * @Desciption TODO
 * @Author loren
 * @Date 2019/1/4 11:22 AM
 * @Version 1.0
 **/
@Configuration
public class RestTemplateConf {

    @Bean
    RestTemplate restTemplate() {
        return new RestTemplate();
    }

}
