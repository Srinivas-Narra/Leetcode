package com.easy;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.naming.Context;

public class mains {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        SqrtX s = (SqrtX) context.getBean("mySqrt");
        System.out.println(s.mySqrt(20));

        FizzBuzz f = (FizzBuzz) context.getBean("fizzBuzz");
        System.out.println(f.fizzBuzz(15));
    }
}
