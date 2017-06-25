// Programmer: Edgar Colin
// Student ID: EDG2140344
// Class: CIS263AA JAVA II Class # 12303
// Instructor: Michael Parmeley
// Chapter: 16  Advanced GUI part II
// Problem:2
// Part:
// Filename:Triangle.java

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Triangle extends 
   JFrame implements ActionListener
{  
      
   int flag;
   JButton pressButton = new JButton("NORMAL");
   JButton pressButton2 = new JButton("MIRROR");
   
   
   
   public Triangle()
   {
      setTitle("Paint Demo");
      setLayout(new FlowLayout());
      
      add(pressButton);
      pressButton.addActionListener(this);
      add(pressButton2);
      pressButton2.addActionListener(this);
      
   }
   public void actionPerformed(ActionEvent e)
   {
        
     Object source = e.getSource();
          
     flag++;
     System.out.println(flag);  
 
     if (source == pressButton) 
     {
         
       int xPoints[] = {150,200,250}; 
       int yPoints[] = {200,100,200};
         
       Graphics g1 = getGraphics();
       g1.drawPolygon(xPoints, yPoints, xPoints.length);
       flag--; 
       System.out.println(flag);
       repaint();                 
     }    
     else if (source == pressButton2) 
     {     
       
       int xPoints[] = {150,200,250}; 
       int yPoints[] = {200,300,200};
       
         
       Graphics g1 = getGraphics();
       g1.drawPolygon(xPoints, yPoints, xPoints.length);
       flag--;                
     } 
         
   } 
   public void paint(Graphics gr)
   {
       super.paint(gr);
       int xPoints[] = {150,200,250}; 
       int yPoints[] = {200,100,200};
       
       gr.drawPolygon(xPoints, yPoints, xPoints.length);
       
   } 
   public static void main(String[] args)
   {
      Triangle frame = new Triangle();
      frame.setSize(400, 400);
      frame.setVisible(true);
       
   }
}               