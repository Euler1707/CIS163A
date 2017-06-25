// Programmer: Edgar Colin
// Student ID: EDG2140344
// Class: CIS263AA JAVA II Class # 12303
// Instructor: Michael Parmeley
// Chapter: 15 
// Problem: 1
// Part:
// Filename: BorderLocation.java
 

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BorderLocation extends 
   JFrame implements ActionListener
{
   private JButton nb = new JButton("");
   private JButton sb = new JButton("");
   private JButton eb = new JButton("");
   private JButton wb = new JButton("");
   private JButton cb = new JButton("");
   public Container con = getContentPane();
   
   
   public BorderLocation()
   {
   
      con.setLayout(new BorderLayout());
      con.add(nb, BorderLayout.NORTH);
      con.add(sb, BorderLayout.SOUTH);
      con.add(eb, BorderLayout.EAST);
      con.add(wb, BorderLayout.WEST);
      con.add(cb, BorderLayout.CENTER);
      nb.addActionListener(this);
      sb.addActionListener(this);
      eb.addActionListener(this);
      wb.addActionListener(this);
      cb.addActionListener(this);
      setSize(400, 150);
   }
   public void actionPerformed(ActionEvent event)
   {
      Object source = event.getSource();
      if(source == nb)
      {
         nb.setText("North");
         sb.setText("");
         eb.setText("");
         wb.setText("");
         cb.setText("");
      }
      else if (source == sb)
      { 
         nb.setText("");
         sb.setText("South");
         eb.setText("");
         wb.setText("");
         cb.setText("");
      }   
      else if (source == eb)
      { 
         nb.setText("");
         sb.setText("");
         eb.setText("East");
         wb.setText("");
         cb.setText(""); 
      }    
      else if (source == wb)
      { 
         nb.setText("");
         sb.setText("");
         eb.setText("");
         wb.setText("West");
         cb.setText("");
      }   
      else 
      { 
         nb.setText("");
         sb.setText("");
         eb.setText("");
         wb.setText("");
         cb.setText("Center"); 
      }        
      con.invalidate();
      con.validate();
   }
   public static void main(String[] args)
   {
      BorderLocation frame = new BorderLocation();
      frame.setVisible(true);
   }
}         