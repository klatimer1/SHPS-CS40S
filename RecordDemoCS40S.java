/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.recorddemocs40s;

/**
 *
 * @author klatimer
 */
   

public class RecordDemoCS40S {

 // defining a record data structure called book   
 public record Book(String name, double price){}
    
    public static void main(String[] args) {
        // Creates an instance of book and populates the fields
        Book libraryItem = new Book ("The Great Gatsby", 12.99);
        Book libraryItem1 = new Book ("The Great Gatsby", 12.99);
        
        // Displays the value inside the record fields
        System.out.println(libraryItem.name);
        System.out.println(libraryItem.price);
        
        System.out.println(libraryItem.toString());
        
        System.out.println(libraryItem.hashCode());
        System.out.println(libraryItem1.hashCode());
        System.out.println(libraryItem.equals(libraryItem1));
 
    }
}
