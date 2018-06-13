/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author macstudent
 */
public class Generics {
    
    public static <E> void printArray(E [] inputArray) {
        
        for(E element : inputArray) {
            System.out.printf("%s ,",element);
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        
        Box<Integer> integerBox = new Box<Integer>();
        integerBox.set(new Integer(10));
        System.out.printf("Integer Value :%d\n", integerBox.get());
        
        Box<String> stringBox = new Box<String>();
        stringBox.set(new String("Hello World"));
        System.out.printf("Starting value :%s\n\n", stringBox.get());
        
        Integer[] intArr = {1,2,3,4,5};
        System.out.println("Array integerArray contains:");
        printArray(intArr);
        
        Double[] doubleArr = {1.1,2.2,3.3,4.4};
        System.out.println("\nArray doubleArray contains:");
        printArray(doubleArr);
        
        Character[] charArr = {'H','E','L','L','O'};
        System.out.println("\nArray charaterArray contains:");
        printArray(charArr);
    }
    
}

class Box<T> {
    private T t;
    
    public void set(T t) {
        this.t = t;
    }
    
    public T get() {
        return t;
    }
}
