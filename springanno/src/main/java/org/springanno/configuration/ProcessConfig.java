package org.springanno.configuration;

import org.springanno.vehicle.Person;
import org.springanno.vehicle.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan(basePackages = "org.springanno.vehicle")
public class ProcessConfig {

    @Bean
    @Primary
    public Vehicle vehicle(){
        Vehicle vh= new Vehicle();
        vh.setName("Honda");
        return vh;
    }
/*
    @Bean(name = "tesla")
    public Vehicle vehicle1(){
        Vehicle vh = new Vehicle();
        vh.setName("Tesla");
        return vh;
    }

    @Bean
    public  Vehicle vehicle2(){
        Vehicle vh = new Vehicle();
        vh.setName("BMW");
        return  vh;
    }
    */
    @Bean
    public Person person(Vehicle vehicle){
        Person p = new Person();
        p.setName("Bob");
        p.setVehicle(vehicle());
        return p;
    }

}
