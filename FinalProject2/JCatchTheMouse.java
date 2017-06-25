// Programmer: Edgar Colin
// Student ID: EDG2140344
// Class: CIS263AA JAVA II Class # 12303
// Instructor: Michael Parmeley
// Chapter: 15 Advanced GUI part II
// Problem:1
// Part:
// Filename:BattleShip.java

import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JCatchTheMouse extends JFrame implements ActionListener
{  
   private int rX, rY;
   private int hits, misses;
   JButton button[][] = new JButton[8][6];
   
   private JPanel gamePanel = new JPanel(new GridLayout(8, 6));
   private Container con = getContentPane();
  
   
   public JCatchTheMouse()
   {
      con.setLayout(new BorderLayout());
      con.add(gamePanel);
      
      for ( int i = 0; i < 8; i++)
      {
         for ( int j = 0; j < 6 ; j++)
         {
            button[i][j] = new JButton((i+1) + "," + (j+1));
            gamePanel.add(button[i][j]);
            button[i][j].addActionListener(this);
         }   
      }
        
      rX = (int) (Math.random() * 6);
      rY = (int) (Math.random() * 6);
      button[rX][rY].setText("X");
 
   }
   public void actionPerformed(ActionEvent e)
   {
      int randX, randY;
      int tempx, tempY;
      
      randX = (int) (Math.random() * 6);
      randY = (int) (Math.random() * 6);
      System.out.println(randX + " " + randY);
      
      Object source = e.getSource();
      
      String a;
      a = (((JButton) source).getText());
      
      if ( a == "X" )
      {
         
         button[randX][randY].setText("X");
         button[rX][rY].setText((rX+1) +"," + (rY+1));
         rX = randX;
         rY = randY;
         hits++;
         
      }
      else
      {
         String[] b = a.split(",");     
         System.out.println(a);
         System.out.println(b[0]);
         System.out.println(b[1]);
         int numx = Integer.valueOf(b[0]);
         int numy = Integer.valueOf(b[1]);
         if ( source == button[numx-1][numy-1])
         {
            
            misses++;
            
            button[randX][randY].setText("X");
            button[rX][rY].setText((numx-1) + "," + (numy-1));
            rX = randX;
            rY = randY;  
            
                       
         }

      }
      System.out.println("HITS: " + hits + " Misses: " + misses); 
      
      if ( hits >= 10 )
      {
         JOptionPane.showMessageDialog(null, "Programmer: Edgar Colin\n" +
                                             "Course: CIS263AA JAVA II\n" +
                                             "Section: Class # 12303\n" +
                                             "MEID: EDG2140344\n"  );
         hits =0;
         misses = 0;
      }                                   
          
   }
   public static void main(String[] args)
   {
      JCatchTheMouse frame = new JCatchTheMouse();
      frame.setSize(500,500);
      frame.setVisible(true);
      
   }

}
