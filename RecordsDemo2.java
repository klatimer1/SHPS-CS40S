/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.recordsdemo2;

/**
 *
 * @author klatimer
 */
import javax.swing.*;


public class RecordsDemo2 {
       public record Book(String name, double price){
 }
        public static void main(String[] args) {
            
        String bookTitle;
        double bookPrice;
        
        // Creates an instance of book and populates the fields
        Book libraryItem = new Book ("The Great Gatsby", 12.99);
        
        bookTitle = JOptionPane.showInputDialog(null,"Enter Book Title","Data Entry",JOptionPane.INFORMATION_MESSAGE);
        bookPrice =Double.parseDouble(JOptionPane.showInputDialog(null, "Enter Book Price", JOptionPane.INFORMATION_MESSAGE));
     
        Book libraryItem1 = new Book (bookTitle, bookPrice);
        
        // Displays the value inside the record fields
        System.out.println(libraryItem.name + " " + libraryItem.price);
        System.out.println(libraryItem1.name + " " + libraryItem1.price);

    }
}
