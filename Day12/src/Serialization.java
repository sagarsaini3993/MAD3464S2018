
import java.io.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author macstudent
 */
public class Serialization {
    
    public static void main(String[] args) {
    
        Employee emp = new Employee();
        emp.name = "Ashley";
        emp.address = "Vancouver";
        emp.SSN = 4444444;
        emp.number = 101;
        
        try {
            FileOutputStream fileOut = new FileOutputStream("employee.txt");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            
            out.writeObject(emp);
            out.close();
            fileOut.close();
            
            System.out.println("Serialized data is saved as employee.txt");
        } catch(IOException e) {
            e.printStackTrace();
        }
    
        
        //Deserialization
        Employee e = null;
        
        try {
            FileInputStream fileIn = new FileInputStream("employee.txt");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            
            e = (Employee) in.readObject();
            
            in.close();
            fileIn.close();
        } catch(IOException i) {
            i.printStackTrace();
            return;
        } catch(ClassNotFoundException c) {
            System.out.println("\n Employee class not found");
            c.printStackTrace();
            return;
        }
        
    }
    
          
    
}
