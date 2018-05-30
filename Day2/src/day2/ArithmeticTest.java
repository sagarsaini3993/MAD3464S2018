/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day2;

/**
 *
 * @author macstudent
 */
public class ArithmeticTest {
    
    public static void main(String [] args) {
        Arithmetic operation1 = new Arithmetic();
        
        System.out.println(operation1.number1);
        operation1.addition();
        operation1.addition(20,34);
        float result = operation1.addition(12.34f, 24.24f);
        System.out.println("result : " +result);
        
        operation1.addition(10,10,10,20);
        
    }
    
    
    
}
