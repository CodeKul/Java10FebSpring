package com.codekul.Java10FebSpring.apo;

import org.springframework.stereotype.Component;

@Component
public class Boy {

    public int studyMaths(int i){
        System.out.println("boys are studying");
        return 100;
    }


    public Exception myException() throws Exception{
        throw new Exception("Throwing exception");
    }
}
