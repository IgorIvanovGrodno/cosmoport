package com.space.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

//Регистрируем конфиги в контексте
public class MyWebAppInit extends AbstractAnnotationConfigDispatcherServletInitializer {

    // Этот метод должен содержать конфигурации которые инициализируют Beans
    // для инициализации бинов у нас использовалась аннотация @Bean
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{AppConfig.class};
    }
    // Тут добавляем конфигурацию, в которой инициализируем ViewResolver
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[] {WebConfig.class};
    }

    //Определяем servlet-mapping веб контекст - в данном случае все что содержит / за распределение
    // запросов между контроллерами отвечает AbstractAnnotationConfigDispatcherServletInitializer
    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}