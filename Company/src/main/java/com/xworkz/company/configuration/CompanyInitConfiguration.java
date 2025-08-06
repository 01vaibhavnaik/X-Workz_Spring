package com.xworkz.company.configuration;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class CompanyInitConfiguration extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[0];
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{CompanyConfiguration.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/biryani","/bottle","/butter","/chappal","/chutney","/curry","/curry","/egg","/milk","/onion","/parotha","/shoe","/soap","/socks"};
    }


}
