/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day6;

/**
 *
 * @author macstudent
 */
public class Day6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int n1 = 10;
        int n2 = 5;
        int numbers[] = {10,20,30};
        
        try {
            int result = n1 / n2;
            result += numbers[6];
            System.out.println("result : " +result);
        } catch(ArithmeticException e) {
            System.err.println("Cannot divide by zero");
        } catch(ArrayIndexOutOfBoundsException e) {
            System.err.println("Arr element unavailable");
        } catch(Exception e) {
//          e.printStackTrace();
            System.err.println("Something went wrong");
        } finally {
            System.out.println("This is a final block");
        }
         
        Addition add = new Addition();
        add.display();
        
        add.multiplication();
        
        Person per = new Person();
        per.setName();
        System.out.println("Name is : " +per.getName());
        per.setAge();
        System.out.println("Age is : " +per.getAge());
        
        
    }
    
}
