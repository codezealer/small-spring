package com.codezealer.springframework.factory;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class BeanFactory {

    Map<String, BeanDefinition> beanDefinitionMap = new ConcurrentHashMap<>();

    public Object getBean(String beanName) {
        return beanDefinitionMap.get(beanName).getBean();
    }

    public void registerBeanDefinition(String name, BeanDefinition beanDefinition) {
        beanDefinitionMap.put(name, beanDefinition);
    }

}
