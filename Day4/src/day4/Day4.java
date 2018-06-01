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
public class Day4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Person sagar = new Person();
        System.out.println(sagar.toString());
        
        Person raman = new Person("Raman" , "USA" , "123456" , 'F' , 24 );
        System.out.println(raman.toString());
        
        Person raman2 = new Person(raman);
        System.out.println(raman2.toString());
        
        Employee emp1 = new Employee();
        emp1.name = "Mandeep";
        emp1.address = "IND";
        emp1.phoneNo = "123456";
        emp1.age = 25;
        emp1.gender = 'F';
        emp1.empId = "F101";
        emp1.dept = 20;
        emp1.joiningDate = "01 June 2018";
        
        System.out.println(emp1.toString());
        
        Employee emp2 = new Employee("Shivam" , "Gujarat" , "998877" , 23 , 'M' , "P123" , 30 , "13 May 2017");
        System.out.println(emp2.toString());
              
    }
    
    
    
}
