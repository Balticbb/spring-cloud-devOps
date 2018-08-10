package com.ms.rbac;

import com.ms.rbac.config.UserInfoConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class RbacApplication {



    public static void main(String[] args) {
        SpringApplication.run(RbacApplication.class, args);
    }

}
