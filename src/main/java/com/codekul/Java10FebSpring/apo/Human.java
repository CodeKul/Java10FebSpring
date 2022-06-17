package com.codekul.Java10FebSpring.apo;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Aspect
@EnableAspectJAutoProxy
@Component
public class Human {


    @Before("execution(public void study())")
    public void warmUp(){
        System.out.println("warm up");
    }



}
