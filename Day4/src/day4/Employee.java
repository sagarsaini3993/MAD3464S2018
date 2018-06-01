/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day4;

/**
 *
 * @author macstudent
 */

// Inheritance 
public class Employee extends Person {
    
    String empId;
    int dept;
    String joiningDate;

    Employee() {
        
        super();
        this.empId = "temp";
         this.dept = 0;
         this.joiningDate = "not started yet";
    }
    

    Employee(String name, String address, String phoneNo, int age, char gender, String empId, int dept, String joiningDate) {
         
        super(name, address, phoneNo, gender, age);
        this.empId = empId;
        this.dept = dept;
        this.joiningDate = joiningDate;
         
    }
    
    
    
    @Override
    public String toString() {
        
        String personDetails = super.toString();
        String data = "Employee ID : " + "\n" + this.empId + "\n" + "Department : " + this.dept + "\n" + "Joining Date : " + this.joiningDate;
        
        data = personDetails + data;
        return data;
    }
    
}
