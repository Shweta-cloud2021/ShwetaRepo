package day2;
//        Write a program for creating Laptop.
//        Name, Price, Processor, Ram and Hard drive should be defined in base class as constant.
//        You need to inherit these functionalities in your program and Print Details.
//        All the laptop should have different name, price, processor, ram and hard drive.

public class Laptop {
     final String NAME;
     final double PRICE;
     final String PROCESSOR;
     final String RAM;
     final String HARDDRIVE;


    public Laptop(String name, double price, String processor,String ram, String harddrive) {
        this.NAME=name;
        this.PRICE=price;
        this.PROCESSOR=processor;
        this.RAM=ram;
        this.HARDDRIVE=harddrive;

        System.out.println("**********Laptop Details**************");
        System.out.println("Name: "+name);
        System.out.println("Price: "+price);
        System.out.println("Processor: "+processor);
        System.out.println("RAM: "+ram);
        System.out.println("Harddrive: "+harddrive);
    }
}
