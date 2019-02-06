package com.safebear.auto.syntax;

import org.testng.annotations.Test;

public class EmployeeTest {

    @Test
    public void testEmployee() {



    Employee hannah = new Employee();
    Employee bob = new Employee();
    SalesEmployee victoria = new SalesEmployee();


    //Employee Hannah and fire Bob
    hannah.employ();
    bob.fire();
    victoria.employ();
    victoria.changeCar("bmw");


    //Print out employment status to screen
        System.out.println("Hannahs employment state: " + hannah.employed);
        System.out.println("Bobss employment state: " + bob.employed);
        System.out.println("Victoria employment state: "+victoria.employed);
        System.out.println("Victoria's car: " + victoria.car);





} //test

}//class
