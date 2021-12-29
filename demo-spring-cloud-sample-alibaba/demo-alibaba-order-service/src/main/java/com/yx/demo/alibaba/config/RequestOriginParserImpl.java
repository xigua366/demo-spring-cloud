package com.yx.demo.alibaba.config;

import com.alibaba.csp.sentinel.adapter.spring.webmvc.callback.RequestOriginParser;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

@Slf4j
@Component
public class RequestOriginParserImpl implements RequestOriginParser {

    @Override
    public String parseOrigin(HttpServletRequest request) {
        String userId = request.getHeader("user_id");
        if(StringUtils.isEmpty(userId)) {
            log.warn("user_id is not empty");
        }
        return userId;
    }
}