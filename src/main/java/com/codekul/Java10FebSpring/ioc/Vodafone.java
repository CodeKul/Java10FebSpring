package com.codekul.Java10FebSpring.ioc;

public class Vodafone implements Sim {

    @Override
    public void calling() {
        System.out.println("calling vodafone");
    }

    @Override
    public void msg() {
        System.out.println("msg vodafone");

    }
}
