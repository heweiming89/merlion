package com.heweiming.merlion.config;

import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

@Configuration
public class ServletConfiguration {

    @Bean
    public FilterRegistrationBean webStatFilter() {
        WebStatFilter filter = new WebStatFilter();
        FilterRegistrationBean registration = new FilterRegistrationBean();
        registration.setFilter(filter);
        Map<String, String> initParameters = new LinkedHashMap<>();
        initParameters.put("exclusions", "*.js,*.gif,*.jpg,*.png,*.css,*.ico,/druid/*");
        registration.setInitParameters(initParameters);
        registration.setUrlPatterns(Collections.singleton("/*"));
        return registration;
    }

    @Bean
    public ServletRegistrationBean statViewServlet() {
        StatViewServlet servlet = new StatViewServlet();
        ServletRegistrationBean registration = new ServletRegistrationBean();
        registration.setServlet(servlet);
        registration.setUrlMappings(Collections.singleton("/druid/*"));
        return registration;
    }

}
