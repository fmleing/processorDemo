package com.processor.beanFactor;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class MyBeanFactoryBean implements InitializingBean {
    private String initEcho;
    private String processorEcho;

    public String getProcessorEcho() {
        return processorEcho;
    }

    public void setProcessorEcho(String processorEcho) {
        this.processorEcho = processorEcho;
    }

    public String getInitEcho() {
        return initEcho;
    }

    public void setInitEcho(String initEcho) {
        this.initEcho = initEcho;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("调用afterPropertiesSet方法");
        this.initEcho = "在初始化方法中修改之后的信息";
    }
}
