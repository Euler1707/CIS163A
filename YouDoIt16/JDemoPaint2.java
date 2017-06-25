import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class JDemoPaint2 extends 
   JFrame implements ActionListener
{  
      
   int flag;
   JButton pressButton = new JButton("UPRIGHT");
   JButton pressButton2 = new JButton("FLIP");
   
   public JDemoPaint2()
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
     if (source == pressButton2) 
     {
            
       int xPoints[] = {150,200,250}; 
       int yPoints[] = {200,300,200};
         
       Graphics g1 = getGraphics();
       g1.drawPolygon(xPoints, yPoints, xPoints.length);
       flag--; 
       System.out.println(flag);
                        
     }    
     else if (source == pressButton) 
     {     
       
       int xPoints[] = {150,200,250}; 
       int yPoints[] = {200,100,200};
         
       Graphics g2 = getGraphics();
       g2.drawPolygon(xPoints, yPoints, xPoints.length);
       flag--;                
     }     
   } 
   public void paint(Graphics gr)
   {
       super.paint(gr);
       int xPoints[] = {150,200,250}; 
       int yPoints[] = {200,100,200};
       
       //gr.drawPolygon(xPoints, yPoints, xPoints.length);
       
   } 
   public static void main(String[] args)
   {
      JDemoPaint2 frame = new JDemoPaint2();
      frame.setSize(400, 400);
      frame.setVisible(true);
       
   }
}               