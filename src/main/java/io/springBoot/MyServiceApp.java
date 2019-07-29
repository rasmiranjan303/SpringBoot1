package io.springBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyServiceApp {

    public static void main(String args[])
    {
        //Run as Spring boot application
         SpringApplication.run(MyServiceApp.class,args);
    }
}
