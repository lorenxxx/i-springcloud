package com.us.improve.user.provider.fallback;

import com.us.improve.user.provider.ITaskProvider;
import org.springframework.stereotype.Component;

/**
 * @ClassName TaskProviderFallBack
 * @Desciption Task服务提供者降级
 * @Author loren
 * @Date 2020/4/26 8:57 PM
 * @Version 1.0
 **/
@Component
public class TaskProviderFallBack implements ITaskProvider {

    @Override
    public String getTask() {
        return "Sorry, Task service no available.";
    }

}
