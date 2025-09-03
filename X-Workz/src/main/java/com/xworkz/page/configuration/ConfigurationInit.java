package com.xworkz.page.configuration;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
@Slf4j
public class ConfigurationInit extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class<?>[] getRootConfigClasses() {
        log.info("Hiii");
        return new Class[0];
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{XworkzConfiguration.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
