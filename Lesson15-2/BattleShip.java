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


public class BattleShip extends JFrame 
   implements ActionListener
{
   JButton button[][] = new JButton[6][6];
   
   // Random Variables Created 
   Random rndAlightment = new Random();
      
   private JPanel panel01 = new JPanel(new GridLayout(6, 6));
   private Container con = getContentPane();
   
   int min=0;
   int max=2;
     
   int[] intArray = new int[] {1,2,3,4,5,6};
   int arrLength = intArray.length;
   
   Random rndMode = new Random();
   Random rndIndex = new Random();
            
   final int mode = rndMode.nextInt(max-min);
   final int index = rndIndex.nextInt(arrLength);
   int ctr = 0;   
   public BattleShip()
   {
      //System.out.println(mode);

      setLayout(new BorderLayout());
      add(panel01);
      
      for ( int i = 0; i < 6; i++)
      {
         for ( int j = 0; j < 6 ; j++)
         {
            button[i][j] = new JButton((i+1) + "," + (j+1));
            panel01.add(button[i][j]);
            button[i][j].addActionListener(this);
         }   
      }
           
      setSize(500, 500);

   }
   public void actionPerformed(ActionEvent e)
   {
      Object source = e.getSource();
      
      if ( mode == 0 ) // ROW
      {
           
         for ( int i = 0; i < 6; i++)
         {
            for ( int j = 0; j < 6 ; j++)
            {
           
              if (source == button[i][j])
              {
                  if ( i == index )
                  {
                     button[i][j].setText( " 1 " );
                     JOptionPane.showMessageDialog(null,"A HIT!");
                     button[i][j].setEnabled(false);
                     ctr++; 
                  }
                  else
                  {
                     button[i][j].setText( " 0 " );
                     button[i][j].setEnabled(false);
                  }
              }   
         
            }
         }            
      }// End of Row  
      else //( mode == 1 ) // ROW
      {
           
         for ( int k = 0; k < 6; k++)
         {
            for ( int q = 0; q < 6 ; q++)
            {
              
              if (source == button[k][q])
              {
                  if ( q == index )
                  {
                     button[k][q].setText( " 1 " );
                     button[k][q].setEnabled(false);
                     JOptionPane.showMessageDialog(null,"A HIT!");
                     ctr++; 
                  }
                  else
                  {
                     button[k][q].setText( " 0 " );
                     button[k][q].setEnabled(false);
                     
                  }
              }   
         
            }
         }            
      }   
      //System.out.print(ctr); 
      if (ctr >= 6)
      {
         JOptionPane.showMessageDialog(null,"SHIP SUNK, GAME OVER");
         
         System.exit(0);  
      }      
   }  
   public static void main(String[] args)
   {
      BattleShip frame = new BattleShip();
      frame.setVisible(true);
   }
}    
      
      
      
      
      
      

      

   
