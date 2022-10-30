package com.astlaure.midgard;

import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.thymeleaf.templatemode.TemplateMode;
import org.thymeleaf.templateresolver.ClassLoaderTemplateResolver;
import org.thymeleaf.templateresolver.ITemplateResolver;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

@AutoConfiguration
public class MidgardAutoConfiguration implements WebMvcConfigurer {
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry
                .addResourceHandler("/midgard-static/**")
                .addResourceLocations("classpath:/midgard-static/");

        registry
                .addResourceHandler("/angular-static/**")
                .addResourceLocations("classpath:/angular-static/");

        WebMvcConfigurer.super.addResourceHandlers(registry);
    }

    @Bean
    public ITemplateResolver midgardTemplateResolver() {
        ClassLoaderTemplateResolver templateResolver = new ClassLoaderTemplateResolver();
        templateResolver.setSuffix(".html");
        templateResolver.setCacheable(false);
        templateResolver.setTemplateMode(TemplateMode.HTML);
        templateResolver.setCharacterEncoding("UTF-8");
        templateResolver.setResolvablePatterns(Collections.singleton("midgard-templates/**"));
        templateResolver.setOrder(1);

        return templateResolver;
    }

    @Bean
    public ITemplateResolver angularTemplateResolver() {
        ClassLoaderTemplateResolver templateResolver = new ClassLoaderTemplateResolver();
        templateResolver.setSuffix(".html");
        templateResolver.setCacheable(false);
        templateResolver.setTemplateMode(TemplateMode.HTML);
        templateResolver.setCharacterEncoding("UTF-8");
        templateResolver.setResolvablePatterns(Collections.singleton("angular-templates/**"));
        templateResolver.setOrder(1);

        return templateResolver;
    }
}
