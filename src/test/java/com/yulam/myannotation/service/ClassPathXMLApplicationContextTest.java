package com.yulam.myannotation.service;

import static org.junit.Assert.*;

public class ClassPathXMLApplicationContextTest {

    public static void main(String[] args) {
        ClassPathXMLApplicationContext path = new ClassPathXMLApplicationContext(
                "configAnnotation.xml");
        UserServiceImpl userService =(UserServiceImpl)path.getBean("userService");
        userService.show();
    }

}