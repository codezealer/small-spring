package com.codezealer.springframework;

import org.junit.Assert;
import org.junit.Test;

public class BeanFactoryTest {

    BeanFactory beanFactory = new BeanFactory();

    @Test
    public void testRegisterBeanDefinition() {
        UserService userService = new UserService();
        BeanDefinition beanDefinition = new BeanDefinition(userService);
        beanFactory.registerBeanDefinition("userService", beanDefinition);

        Object result = beanFactory.getBean("userService");

        Assert.assertEquals(userService, result);

    }

}
