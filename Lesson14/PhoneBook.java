// Programmer: Edgar Colin
// Student ID: EDG2140344
// Class: CIS263AA JAVA II Class # 12303
// Instructor: Michael Parmeley
// Chapter: 14 
// Problem: 2
// Part:
// Filename: PhoneBook.java

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PhoneBook extends JFrame
    implements ActionListener
{
   String[] list = {"Select Name","Carol", "Edgar", "John", "Susan" , "Erik"};
   
   JLabel description = new JLabel("Phone Directory");
   JComboBox pNumberBox = new JComboBox(list);
   JLabel dispName = new JLabel("Select a name from the drop down list");
   
   public PhoneBook()
   {
      super("Phone List");
      setSize(300, 100);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setLayout(new FlowLayout());
      
      add(description);
      add(pNumberBox);
      add(dispName);    
      pNumberBox.addActionListener(this); 
      
      setVisible(true);
   }
   
   public void actionPerformed(ActionEvent e)
   {
      String[] Phone = {""," : 313-567-2321"," : 313-432-2353"," : 313-896-7483",
                           " : 313-593-7562", " : 708-484-4342"};
      int index = pNumberBox.getSelectedIndex();      
      dispName.setText( list[index] + Phone[index]);
   }
   
   public static void main(String[] args)
   {
      PhoneBook demo = new PhoneBook();
   }
}   
   
         
   