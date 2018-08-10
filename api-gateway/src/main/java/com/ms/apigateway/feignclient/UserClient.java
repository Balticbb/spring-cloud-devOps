package com.ms.apigateway.feignclient;

import com.ms.apigateway.config.ApiGatewayConfiguration;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Copyright © 2018 上海金互行金融服务有限公司. All rights reserved. *
 *
 * @Title:
 * @Prject: springcloud
 * @Package: com.ms.apigateway.feignclient
 * @Description:
 * @author: Turbo@baidu.com
 * @date: 18-8-5 上午2:24
 * @version: V1.0
 */

@FeignClient(name = "rbac",configuration = ApiGatewayConfiguration.class,fallbackFactory = HystrixClientFallbackFactory.class)
public interface UserClient {

    @RequestMapping("/testConfig")
    public String requestRbacAboutTestConfig();

}
