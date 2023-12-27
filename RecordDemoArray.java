/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.recorddemoarray;

import javax.swing.*;

public class RecordDemoArray {
        public record Book(String name, double price){
 }
        public static void main(String[] args) {
            
        // creates an array of 3 books     
        Book[] library = new Book[3];
            
        String bookTitle;
        double bookPrice;
        
       for (int i=0; i<library.length; i++)
       {
           bookTitle = JOptionPane.showInputDialog(null,"Enter Book Title","Data Entry",JOptionPane.INFORMATION_MESSAGE);
           bookPrice =Double.parseDouble(JOptionPane.showInputDialog(null, "Enter Book Price", JOptionPane.INFORMATION_MESSAGE));
           library[i] = new Book (bookTitle, bookPrice);
       }
        // Displays the value inside the record fields
        for (int j=0; j<library.length; j++)
        {
           System.out.println(library[j].name + " " + library[j].price);
        }

    }
}
