package com.codezealer.springframework.factory;

public class BeanDefinition {

    private Object bean;

    public BeanDefinition(Object bean) {
        this.bean = bean;
    }

    public Object getBean() {
        return this.bean;
    }
}