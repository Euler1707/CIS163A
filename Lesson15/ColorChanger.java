// Programmer: Edgar Colin
// Student ID: EDG2140344
// Class: CIS263AA JAVA II Class # 12303
// Instructor: Michael Parmeley
// Chapter: 15 
// Problem: 2
// Part:
// Filename: ColorChager.java
 
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ColorChanger extends 
   JFrame implements ActionListener
{
   // Creating Panels
   private JPanel nb = new JPanel();
   private JPanel sb = new JPanel();
   private JPanel eb = new JPanel();
   private JPanel wb = new JPanel();
   private JButton cb = new JButton("Center");
   // cb.setPreferredSize(new Dimension(100,100));
   
   public Container con = getContentPane();
   
   // Creating Arrays for Random Selection
   JPanel[] jp = {nb,sb,eb,wb};
   Color[] colors = { Color.red, Color.blue, Color.green, Color.yellow,
      Color.magenta, Color.orange, Color.pink, Color.black,
      Color.cyan, Color.darkGray};
  
   // Random Variables Created 
   Random rndCol = new Random();
   Random rndBut = new Random();
     
   public ColorChanger()
   {
      // Setting the Layout
      con.setLayout(new BorderLayout());
      con.add(nb, BorderLayout.NORTH);
      con.add(sb, BorderLayout.SOUTH);
      con.add(eb, BorderLayout.EAST);
      con.add(wb, BorderLayout.WEST);
      con.add(cb, BorderLayout.CENTER);
            
      cb.addActionListener(this);
      setSize(500, 500); // Window Size
      
      
   }
   public void actionPerformed(ActionEvent event)
   {
          
      Object source = event.getSource();
      
      if(source == cb)
      {
         int arrLength;
         int index;
     
         arrLength = jp.length;       
         index = rndBut.nextInt(jp.length); 
         //System.out.println(index);
         
         System.out.println("\n");  
         if (index == 0)
         {     
            jp[index].setBackground(colors[rndCol.nextInt(colors.length)]);
            jp[index+1].setBackground(Color.WHITE);
            jp[index+2].setBackground(Color.WHITE);
            jp[index+3].setBackground(Color.WHITE);
         }
         else if (index == 1)   
         {
            jp[index].setBackground(colors[rndCol.nextInt(colors.length)]);
            jp[index-1].setBackground(Color.WHITE);
            jp[index+1].setBackground(Color.WHITE);
            jp[index+2].setBackground(Color.WHITE);
         }
         else if (index == 2)   
         {
            jp[index].setBackground(colors[rndCol.nextInt(colors.length)]);
            jp[index-2].setBackground(Color.WHITE);
            jp[index-1].setBackground(Color.WHITE);
            jp[index+1].setBackground(Color.WHITE);
         }  
         else    
         {
            jp[index].setBackground(colors[rndCol.nextInt(colors.length)]);
            jp[index-3].setBackground(Color.WHITE);
            jp[index-2].setBackground(Color.WHITE);
            jp[index-1].setBackground(Color.WHITE);
         }    
         
      }
       else 
      { 
         // Do nothing
      }        
      con.invalidate();
      con.validate();
   }
   public static void main(String[] args)
   {
      ColorChanger frame = new ColorChanger();
      frame.setVisible(true);
   }
}         