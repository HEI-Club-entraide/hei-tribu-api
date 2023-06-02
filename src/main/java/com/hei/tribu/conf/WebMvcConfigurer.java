package com.hei.tribu.conf;

import com.hei.tribu.controller.converter.PageConverter;
import com.hei.tribu.controller.converter.PageSizeConverter;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;

@Configuration
public class WebMvcConfigurer implements org.springframework.web.servlet.config.annotation.WebMvcConfigurer {
    @Override
    public void addFormatters(FormatterRegistry registry) {
        registry.addConverter(new PageConverter());
        registry.addConverter(new PageSizeConverter());
    }
}
