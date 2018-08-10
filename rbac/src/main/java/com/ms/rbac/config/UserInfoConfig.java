package com.ms.rbac.config;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.ms.rbac.utils.JsonDateDeserializer;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Copyright © 2018 上海金互行金融服务有限公司. All rights reserved. *
 *
 * @Title:
 * @Prject: springcloud
 * @Package: com.ms.rbac.config
 * @Description: 配置类
 * @author: Turbo@baidu.com
 * @date: 18-8-4 上午1:03
 * @version: V1.0
 */

@ConfigurationProperties
@Component
@Data
public class UserInfoConfig {
    private String name;
    private Integer age;
    private Date birthday;
    private BigDecimal sclary;


    @JsonDeserialize(using = JsonDateDeserializer.class)
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

}
