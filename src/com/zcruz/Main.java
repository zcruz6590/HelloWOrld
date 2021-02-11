package com.zcruz;
/*
This program demonstrates the basic use of 2 classes.
 */
public class Main {
    //main method
    public static void main(String[] args) {
        //Prints a greeting from the Main Class.
        System.out.println("Hello Universe in Main Class!");
        //Creates an object of the DemoClass class
        DemoClass dc = new DemoClass();
        //calls the method of the dc object
        dc.demo();
    }
}
