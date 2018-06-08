/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
/**
 *
 * @author macstudent
 */
public class Library {
    
    public static void main(String [] args) {
        ArrayList<String> bookId = new ArrayList<String>();
        
        bookId.add("B001");
        bookId.add("B002");
        
        for(String str1 : bookId) {
            System.out.println(str1);
        }
        
        bookId.add(1, "B005");
        
        if (bookId.contains("B001")) {
            System.out.println("We have a book");
            bookId.remove("B001");
        } else {
            System.out.println("Book unavailable");
        }
        
        for(String str1 : bookId) {
            System.out.print(str1);
        }
        ArrayList<Books> Library = new ArrayList<Books>();
        Books book1 = new Books(1,"Java",2);
        Books book2 = new Books(2,"Android",5);
        Books book3 = new Books(3,"Swift",7);
        Books book4 = new Books(4,"iOS",4);
        
        Library.add(book1);
        Library.add(book2);
        Library.add(book3);
        Library.add(book4);
        
        Library.add(2, new Books(10,"Database",9)); 
        
        if (Library.contains(book4)) {
            Library.remove(book4);
        }
        
        System.out.println("No. of books in the library :" + Library.size());
        
        Collections.sort(Library, new bookTitleComparator()); {
        for (Books bk: Library) {
            bk.displayInfo();
        }
    }
        
//        for(Books book : Library) { 
//            book.displayInfo();
//        }
    }
    
}
