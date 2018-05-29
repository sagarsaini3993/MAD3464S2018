/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author macstudent
 */
public class HelloWorld {
    
    public static void main(String [] args)
    {
        System.out.println("Hello World");
        
         int number = 10;
        float fNumber = 10.2f;
        double dnumber;
        short s1;
        long l1;  
        
        number *= 10;
        System.out.println("Output is :" +number);
        
        number = 20;
        System.out.println("output is : "+ (10 + number));
        
//        number = number/0;
        
        char ch = 'W';
        System.out.println(" Naunihal : " + (ch));
        System.out.println("ch : " + (ch + 1)); // integer
        System.out.println("ch : " + (char)(ch + 1));
        
        ch++;
        System.out.println("after increment ch : " + (ch + 1));
        
        ++ch;
        System.out.println("ch : " + (ch + 1));
        
        
       
        for(int i=0;i<=6;++i) {
            System.out.print(i);
        }
       
       
       
       boolean flag = true;
       System.out.println("value is  : " + flag);
        
        if (flag) {
            System.out.println("Name is 0 ");
        }
        else {
            System.out.println("Name is 1 ");
        }
        
        char vowel = 'y';
        switch(vowel){
            case 'a' :
                System.out.println("given char is vowel ");
                break;
            case 'e' :
                System.out.println("given char is vowel ");
                break;
            case 'i' :
                System.out.println("given char is vowel ");
                break;
            case 'o' :
                System.out.println("given char is vowel ");
                break;
            case 'u' :
                System.out.println("given char is vowel ");
                break;
                default:
                    System.out.println("given char is not vowel ");
                
        }
        
//        switch province = "ON";
                
        
    }
    
    
}
