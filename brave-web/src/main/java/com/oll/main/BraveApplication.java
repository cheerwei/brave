package com.oll.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.env.StandardEnvironment;
import org.springframework.stereotype.Controller;

/**
 * @ClassName BraveApplication
 * @Description TODO
 * @Author Hanty
 * @Date 2020/9/28 14:15
 * @ModifyDate 2020/9/28 14:15
 * @Version 1.0
 */
@Controller
public class BraveApplication {
    public static void main(String args[]){
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("classpath:spring/applicationContent.xml");
        Object helloWorld = classPathXmlApplicationContext.getBean("helloWorld");
        boolean helloWorld1 = classPathXmlApplicationContext.containsBean("helloWorld");
    }
}
