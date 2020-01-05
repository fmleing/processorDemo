package com.processor.beanFactor;

import org.springframework.beans.BeansException;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {
        System.out.println("调用MyBeanFactoryPostProcessor的postProcessBeanFactory");
        BeanDefinition bd = configurableListableBeanFactory.getBeanDefinition("myBeanFactoryBean");
        MutablePropertyValues pv = bd.getPropertyValues();
        if (pv.contains("processorEcho")) {
            pv.addPropertyValue("processorEcho", "在BeanFactoryPostProcessor中修改之后的信息");
        }
    }
}
