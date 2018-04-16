package com.dev.mail.mailtemplatefreemaker;

import org.springframework.context.annotation.Configuration;
import org.springframework.ui.freemarker.FreeMarkerConfigurationFactoryBean;

@Configuration
public class FreemarkerConfig {

    public FreeMarkerConfigurationFactoryBean getFreeMarkerConfiguration() {
        FreeMarkerConfigurationFactoryBean bean = new FreeMarkerConfigurationFactoryBean();
        bean.setTemplateLoaderPath("/templates/");

        return bean;
    }
}
