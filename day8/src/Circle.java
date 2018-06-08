/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author macstudent
 */
public class Circle extends shape {

    Circle(int x, int y) {
        super(x,y);
    }
    
    

    @Override
    void draw() {
        
//        super.x = 10;
//        super.y = 20;
//        System.out.println("X: " +super.x);
//        System.out.println("Y: " +super.y);
        System.out.println("Drawing circle at X : " + super.x +  "and Y: " +super.y);
        
    }
    
//    abstract void animate(); 
}
