package org.example;
import org.example.configuration.Process;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import process.Vehicle;



public class Main
{
    public static void main(String[] args)
    {
        AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext(Process.class);
        Vehicle vh=(Vehicle)context.getBean(Vehicle.class);
        System.out.println("The vehicle name is :-"+ vh.getName());
        System.out.println("The person name is :-"+vh.getName());

        Vehicle vh1 = new Vehicle();
        vh1.setName("Honda");
        System.out.println("The Vehicle is:- "+vh1.getName());
    }
}