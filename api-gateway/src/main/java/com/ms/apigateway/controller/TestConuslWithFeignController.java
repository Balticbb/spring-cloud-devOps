package com.ms.apigateway.controller;

import com.ms.apigateway.feignclient.UserClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Copyright © 2018 上海金互行金融服务有限公司. All rights reserved. *
 *
 * @Title:
 * @Prject: springcloud
 * @Package: com.ms.apigateway.controller
 * @Description: ${todo}
 * @author: Turbo@baidu.com
 * @date: 18-8-5 上午2:33
 * @version: V1.0
 */

@RestController
public class TestConuslWithFeignController {

    @Autowired
    private UserClient userClient;

    @GetMapping("/testConsulWithFeign")
    public String doTestConuslWithFeign(){

        String s = userClient.requestRbacAboutTestConfig();
        return s;
    }
}
