package com.ms.apigateway.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Copyright © 2018 上海金互行金融服务有限公司. All rights reserved. *
 *
 * @Title:
 * @Prject: springcloud
 * @Package: com.ms.apigateway.config
 * @Description: ${todo}
 * @author: Turbo@baidu.com
 * @date: 18-8-5 上午5:04
 * @version: V1.0
 */
@Configuration
public class ApiGatewayConfiguration {

    @Bean
    Logger.Level feignLoggerLevel() {
        return Logger.Level.FULL;
    }
}
