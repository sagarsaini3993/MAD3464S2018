/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.*;
/**
 *
 * @author macstudent
 */
public class Employee {
    public String name;
    public String address;
    public int SSN;
    public int number;
    
    public void mailChange() {
        System.out.println("Mailing a cheque to " +name+ " " +address);
    }
}
