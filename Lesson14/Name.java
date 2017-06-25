// Programmer: Edgar Colin
// Student ID: EDG2140344
// Class: CIS263AA JAVA II Class # 12303
// Instructor: Michael Parmeley
// Chapter: 14 
// Problem: 1
// Part:
// Filename: Name.java

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Name extends
   JFrame implements ActionListener
{
   
   JButton nameBob = new JButton("Bob");
   JButton nameSally = new JButton("Sally"); 
   JButton nameMike = new JButton("Mike");
   JButton nameAlice = new JButton("Alice"); 
   JButton nameTom = new JButton("Tom");
   JTextField nameBox = new JTextField(14);
   String selected = "";

   
   
   public Name()
   {
      super("List of Names");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setLayout(new FlowLayout());
      add(nameBob);
      add(nameSally);
      add(nameMike);
      add(nameAlice);
      add(nameTom);
      add(nameBox);
      nameBox.setText(selected );
      
      nameBob.addActionListener(this);
      nameSally.addActionListener(this);
      nameMike.addActionListener(this);
      nameAlice.addActionListener(this);
      nameTom.addActionListener(this); // Item or Action Listener
   
   }
   public void actionPerformed(ActionEvent event)
   {
      Object source = event.getSource();
   
          
      if (source == nameBob)
      {
         selected = "Bob";
      }
      else if ( source == nameSally)
      {
         selected = "Sally";  
      }
      else if ( source == nameMike)
      {
         selected = "Mike";  
      }
      else if ( source == nameAlice)
      {
         selected = "Alice";  
      }
      else if ( source == nameTom)
      {
         selected = "Tom";  
      }
      nameBox.setText(selected);
        
   }
   public static void main(String[] args)
   {
      Name aFrame = 
         new Name();
      final int WIDTH = 300;
      final int HEIGHT = 200;
      aFrame.setSize(WIDTH, HEIGHT);
      aFrame.setVisible(true);
   }
}  
   

   
 
      
