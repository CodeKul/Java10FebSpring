package com.codekul.Java10FebSpring;

import com.codekul.Java10FebSpring.apo.Boy;
import com.codekul.Java10FebSpring.apo.Girl;
import com.codekul.Java10FebSpring.di.Company;
import com.codekul.Java10FebSpring.ioc.Jio;
import com.codekul.Java10FebSpring.ioc.SimConfig;
import com.codekul.Java10FebSpring.ioc.Vodafone;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Java10FebSpringApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(Java10FebSpringApplication.class, args);
        Vodafone vodafone1 = applicationContext.getBean(Vodafone.class);
//        vodafone1.calling();

        ApplicationContext context = new AnnotationConfigApplicationContext(SimConfig.class);
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(applicationContext1);
//
//        Jio jio = context.getBean(Jio.class);
//        jio.calling();
//        jio.msg();

//        Vodafone vodafone = context.getBean(Vodafone.class);
//        vodafone.msg();
//        vodafone.calling();

//        Company company = applicationContext.getBean(Company.class);
//        company.display();


        Boy boy = applicationContext.getBean(Boy.class);
        Girl girl = applicationContext.getBean(Girl.class);
        //
        boy.study();
        girl.study();
    }

    @GetMapping("hello")
    public String msg() {
        return "Hello Spring...";
    }

}
