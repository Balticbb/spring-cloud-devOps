package com.ms.apigateway.feignclient;

import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

/**
 * Copyright © 2018 上海金互行金融服务有限公司. All rights reserved. *
 *
 * @Title:
 * @Prject: springcloud
 * @Package: com.ms.apigateway.feignclient
 * @Description:
 * @author: Turbo@baidu.com
 * @date: 18-8-5 上午4:53
 * @version: V1.0
 */

@Component
public class HystrixClientFallbackFactory implements FallbackFactory<UserClient> {

    @Override
    public UserClient create(Throwable cause) {

        return new UserClient(){

            @Override
            public String requestRbacAboutTestConfig() {
                return "Hystrix失败原因："+cause.getMessage();
            }
        };
    }
}
