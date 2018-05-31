/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day3;

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
//    char gender;
    String gender;
    
    // WE HAVE USED SCANNER CLASS COZ WE WANT TO GIVE INPUT
    
    Scanner in = new Scanner(System.in);
    
    // SETTER 
    
    void setName() {
        System.out.println("Enter name :" );
        name = in.nextLine(); 
        
    }
    
    // GETTER
    
    String getName() { 
        return name;
        
    }
    
    void setAddress() {
        System.out.println("Enter address :");
        address = in.nextLine();
    }
            
    String getAddress() {
        return address;
    }
    
    void setPhoneNo() {
        System.out.println("Enter phone no : ");
        phoneNo = in.nextLine();
    }
    
    String getPhoneNo() {
        return phoneNo;
    }
    
        void setAge() {
        System.out.println("Enter age : ");
//        age = in.nextInt();
        age = Integer.parseInt(in.nextLine());
    }
    
    int getAge() {
        return age;
    }
    
    void setGender() {
        System.out.println("Enter gender : ");
        gender = in.nextLine();
//        gender = (char)in.nextInt();
//        in.nextLine();
    }
    
    String getGender() {
        return gender;
    } 
    
    @Override
    public String toString() {
        String data = "Name : " +name + "\n" + "Address : " + address + "\n" + "PhoneNo : " + phoneNo + "\n" +  "Age : " + age + "\n" + "Gender : " + "\n" + gender + "\n";
        return data;
    }
    
    void setData() {
        setName();
        setAddress();
        setPhoneNo();
        setAge();
        setGender();
    }
}
