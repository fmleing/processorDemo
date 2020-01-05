package com.processor;

import com.processor.beanFactor.MyBeanFactoryBean;
import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ProcessorApplication {
    public static void main(String[] args) {
        //启动WEB项目
        SpringApplication application = new SpringApplication(ProcessorApplication.class);
        ConfigurableApplicationContext context = application.run(args);
        MyBeanFactoryBean bean = (MyBeanFactoryBean) context.getBean("myBeanFactoryBean");
        System.out.println("===============下面输出结果============");
        System.out.println("初始化信息：" + bean.getInitEcho());
        System.out.println("后处理信息：" + bean.getProcessorEcho());
    }

}
