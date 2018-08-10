package com.ms.rbac.controller;

import com.ms.rbac.config.UserInfoConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Copyright © 2018 上海金互行金融服务有限公司. All rights reserved. *
 *
 * @Title:
 * @Prject: springcloud
 * @Package: com.ms.rbac.controller
 * @Description:
 * @author: Turbo@baidu.com
 * @date: 18-8-4 上午1:20
 * @version: V1.0
 */

@RestController
public class TestConfigController {

    private final UserInfoConfig userInfoConfig;
    private final ApplicationContext applicationContext;

    @Autowired
    public TestConfigController(UserInfoConfig userInfoConfig, ApplicationContext applicationContext) {
        this.userInfoConfig = userInfoConfig;
        this.applicationContext = applicationContext;
    }

    @GetMapping("/testConfig")
    public String print(){
        Environment environment = applicationContext.getEnvironment();
        String[] defaultProfiles = environment.getDefaultProfiles();
        String[] activeProfiles = environment.getActiveProfiles();
        StringBuilder defaultStringBuilder = new StringBuilder("defaultProfiles:\t");
        StringBuilder activeStringBuilder = new StringBuilder("activeProfiles:\t");

        for (String defaultProfile : defaultProfiles) {
            defaultStringBuilder.append(defaultProfile).append("\t");
        }
        for (String activeProfile : activeProfiles) {
            activeStringBuilder.append(activeProfile).append("\t");
        }
        System.out.println(defaultStringBuilder);
        System.out.println(activeStringBuilder);
        return userInfoConfig.toString();
    }
}
