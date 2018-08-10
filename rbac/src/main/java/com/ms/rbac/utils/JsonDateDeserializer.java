package com.ms.rbac.utils;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Copyright © 2018 上海金互行金融服务有限公司. All rights reserved. *
 *
 * @Title:
 * @Prject: springcloud
 * @Package: com.ms.rbac.utils
 * @Description: ${todo}
 * @author: Turbo@baidu.com
 * @date: 18-8-4 上午1:56
 * @version: V1.0
 */
public class JsonDateDeserializer extends JsonDeserializer<Date> {

    private static final SimpleDateFormat SIMPLEDATEFORMAT = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    @Override
    public Date deserialize(JsonParser jsonParser, DeserializationContext ctxt) throws IOException, JsonProcessingException {
        String text = jsonParser.getText();
        try {
            return SIMPLEDATEFORMAT.parse(text);
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }
}
