package com.in28minutes.learnspringframework.examples.C1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
@ComponentScan("com.in28minutes.learnspringframework.examples.C1")

public class RealWorldSpringLauncherApplication {




   public static void main(String[] args) {
       try (var context = new AnnotationConfigApplicationContext(RealWorldSpringLauncherApplication.class)) {
           Arrays.stream(context.getBeanDefinitionNames())
                   .forEach(System.out:: println);
           System.out.println(context.getBean(BusinessCalculationService.class).findMax());
       }
   }
}


