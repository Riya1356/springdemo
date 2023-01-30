package org.springanno;

import org.springanno.configuration.ProcessConfig;
import org.springanno.vehicle.Person;
import org.springanno.vehicle.Vehicle;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext(ProcessConfig.class);
        Vehicle vh = context.getBean(Vehicle.class);
        Person p = context.getBean(Person.class);
        System.out.println("Vehicle name from spring context:-"+vh.getName());
        System.out.println("person name from spring context:-"+p.getName());
        System.out.println("vehicle that person own is:-"+p.getVehicle());




    }
}