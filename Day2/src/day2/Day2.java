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
public class Day2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        for(int i=0;i<6;i++){
            
            for(int j=6;j>i;j--) {
                System.out.print("*");
            }
            
            System.out.println("");
            
        }
        
        
        
        
        int i = 1;
        while(i < 6) {
            System.out.println("i :" +i);
            i++;
            
        }
            System.out.println("Loop ended");
            
            i = 6;
            do {
                System.out.println("i :" +i);
                i++;
            }while(i < 6);
            
            for(i=1; i<6; i++){
                if(i == 3) {
                    continue;
                }
                
                System.out.println("i :" +i);
                
            }
            
            int numbers[] = new int[5]; //ARRAY
            
//            for(int j=10; int k = 10; k<numbers.length; k++) {
//                numbers[k] = j;
//                System.out.println("numbers["+ k +"]" +numbers[k]);
//            }

            int arr[][] = new int[4][3];
            
            for(int row=0; row<4; row++) {
                for(int col=0; col<3; col++) {
                    arr[row][col] = i++;
//                    System.out.println("arr["+ row +"] [" + col +"] :" +arr[row][col]);
                      System.out.print(arr[row][col] + " ");
                }
                System.out.println("");
            }
            
            
            for(int a=5; a>0; a--){
                
                for(int s=5; s>a; s--) {
                    System.out.print(" ");
                    
                }
                for(int k=0; k<a; k++) {
                    System.out.print("* ");
                    
                }
                System.out.println("");
                
                
            }
            
            for(int no : numbers) {
                System.out.println("no : " + no);
            }
        
    }
    
}
