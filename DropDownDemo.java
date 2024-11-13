/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.dropdowndemo;
import javax.swing.*;
/**
 *
 * @author klatimer
 */
public class DropDownDemo {

    public static void main(String[] args) {
       String[] province = {"British Columbia", 
                            "Manitoba", 
                            "New Brunswick", 
                            "Nova Scotia", 
                            "Ontario"};
       
       
       
       
       String provinceSelected = (String) JOptionPane.showInputDialog(null, "Please select your province", //user prompt
                                                            "Province Select",  // title
                                                            JOptionPane.QUESTION_MESSAGE, //icon
                                                            null,
                                                            province,       // populate list
                                                            province[0]);   // d efault
        System.out.println("you have selected " + provinceSelected);
    }
}
