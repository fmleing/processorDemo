package com.processor.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.PriorityOrdered;
import org.springframework.stereotype.Component;

@Component
public class MyBeanPostProcessor implements BeanPostProcessor,PriorityOrdered {
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof MyBeanBean) {
            System.out.println("MyBeanBean，对象" + beanName + "调用初始化方法之前的数据： " + bean.toString());
        }
        return bean;
    }
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof MyBeanBean) {
            System.out.println("MyBeanBean，对象" + beanName + "调用初始化方法之后的数据：" + bean.toString());
        }
        return bean;
    }

    @Override
    public int getOrder() {
        return 10;
    }
}
