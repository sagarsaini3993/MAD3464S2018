/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day4;

import java.util.Scanner;

/**
 *
 * @author macstudent
 */
public class Person {
    
    String name;
    String address;
    String phoneNo;
    int age;
    char gender;
    
    Scanner in = new Scanner(System.in);
    
    // Default constructor
    
    Person() {
        
        this.name = "Unknown";
        this.address = "Unknown";
        this.phoneNo = "Unknown";
        this.age = 1;
        this.gender = 'U';
    }
    
    // Parameterized constructor
    
    Person(String name, String address, String phoneNo, char gender, int age) {
        
        this.name = name;
        this.address = address;
        this.phoneNo = phoneNo;
        this.age = age;
        this.gender = gender;
        
    }
    
    // Copy constructor
    
    Person(Person anotherPerson) {
        
        this.name = anotherPerson.name;
        this.address = anotherPerson.address;
        this.age = anotherPerson.age;
        this.phoneNo = anotherPerson.phoneNo;
        this.gender = anotherPerson.gender;
    }
    
    public String toString() {
        
       
        String data = "Name : " + "\n" + this.name + "\n" + "Address : " + this.address + "\n" + "phoneNo : " + this.phoneNo + "gender : " + this.gender;
        
       
        return data;
    }
    
    
}
