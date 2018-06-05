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
public class Addition implements arithmetic, multiplication{

    @Override
    public void display() {
        System.out.println("Addition is : " + (n1 + n2));
    } 

    @Override
    public void multiplication() {
        System.out.println("Mutiplication is : " + (n1 * n2));
    }
    
}
