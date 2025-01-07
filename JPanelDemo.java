/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.jpaneldemo;
import javax.swing.*;
/**
 *
 * @author klatimer
 */
public class JPanelDemo {
    

    public static void main(String[] args) {
      // create a panel and layout
      JPanel panel = new JPanel();
      panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
      
      // create fields for the panel
      JTextField nameField = new JTextField (10);
      JTextField ageField = new JTextField(10);
      JTextField emailField = new JTextField(10);
      
      // add panel elements to the panel
      panel.add(new JLabel("Name:"));
      panel.add(nameField);
      panel.add(new JLabel("Age:"));
      panel.add(ageField);
      panel.add(new JLabel("Email:"));
      panel.add(emailField);
      
      //panel is contained withon the dialog box
      int result = JOptionPane.showConfirmDialog(null, panel, "Panel Demo",JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE);
      
      if (result == JOptionPane.OK_OPTION)
      {
          // read fields and store in variables
          String name = nameField.getText();
          String age = ageField.getText();
          String email = emailField.getText();
          
          // echo the informaiton
          JOptionPane.showMessageDialog(null, "Name: "+ name +"\nAge: "+ age + "\nemail: " + email, "Panel Demo", JOptionPane.INFORMATION_MESSAGE);
      }
      else
      {
          JOptionPane.showMessageDialog(null, "User cancelled", "Panel Demo",JOptionPane.INFORMATION_MESSAGE );
      }
    }
}
