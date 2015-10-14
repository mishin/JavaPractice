package com.example.beanaware;

import org.springframework.context.support.GenericXmlApplicationContext;

import javax.annotation.PreDestroy;

/**
 * Created by krishna_hotha on 4/16/15.
 */
public class DummyBean {

    private String name;

    public DummyBean() {

        System.out.println("no dummy");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @PreDestroy
    public void destroyMethod(){

        System.out.println("calling before destory method");
    }

    public static void main(String[] args) {

        GenericXmlApplicationContext context = new GenericXmlApplicationContext("spring-beanaware.xml");


        BeanNameAwareCheck bw=(BeanNameAwareCheck)context.getBean("beanNameCheck");
        bw.someOperation();

        DummyBean dw=(DummyBean)context.getBean("dummyBean");
        System.out.println(dw);



    }
}
