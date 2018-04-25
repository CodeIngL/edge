package com.qianmi.edge;

import com.qianmi.edge.listener.StartupListener;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.embedded.InitParameterConfiguringServletContextInitializer;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ImportResource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.util.IntrospectorCleanupListener;

import javax.servlet.ServletContextListener;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>Description: </p>
 * <p>税友软件集团有限公司</p>
 *
 * @author laihj
 *         2018/4/25
 */
@SpringBootApplication
@EnableWebMvc
@ImportResource(locations = "classpath:applicationContext-dubbo.xml")
public class BootStartup {

    @Bean(name = "startupListener")
    public ServletContextListener startupListener() {
        return new StartupListener();
    }

    @Bean(name = "introspectorCleanupListener")
    public ServletContextListener introspectorCleanupListener() {
        return new IntrospectorCleanupListener();
    }

    @Bean
    public WebMvcConfigurerAdapter webMvcConfig(){
        return new WebMvcConfigurerAdapter() {
            @Override
            public void addResourceHandlers(ResourceHandlerRegistry registry) {
                registry.addResourceHandler("/**").addResourceLocations("classpath:/webapp/");
            }
        };
    }
    public static void main(String[] args) {
        new SpringApplicationBuilder(BootStartup.class).web(true).run(args);
    }
}
