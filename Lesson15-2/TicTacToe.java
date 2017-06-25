// Programmer: Edgar Colin
// Student ID: EDG2140344
// Class: CIS263AA JAVA II Class # 12303
// Instructor: Michael Parmeley
// Chapter: 15 Advanced GUI part II
// Problem:2
// Part:
// Filename:TicTacToe.java

import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TicTacToe extends JFrame
   implements ActionListener
{

   JButton button[][] = new JButton[6][6];
   
   int Selected[][] = {{ 0 , 0 , 0 },
                           { 0 , 0 , 0 },
                           { 0 , 0 , 0}}; //not used yet
    // not used yet 
   /*
   int cpuSelected[][] = {{ 0 , 0 , 0 },
                          { 0 , 0 , 0 },
                          { 0 , 0 , 0}};
   */
    // not used yet 
   
   
   Random rndcpu = new Random();
   
   private JPanel panel1 = new JPanel(new GridLayout(3,3));
   
   private Container con = getContentPane();
   
   public TicTacToe()
   {
      setLayout(new BorderLayout());
      
      add(panel1);
      
      for ( int i = 0 ; i < 3 ; i ++ )
      {   
         for ( int j = 0 ; j < 3 ; j ++ )
         {
         
            button[i][j] = new JButton((i+1) + "," + (j+1));
            panel1.add(button[i][j]);
            button[i][j].addActionListener(this);
         }      
      }      
      setSize(500,500);
      
      for ( int i = 0; i < 3; i++)
      {
         for ( int j = 0; j < 3 ; j++)
         {
           
            button[i][j].setText("");                                    
                   
         }
      }     
   }        
   public void actionPerformed(ActionEvent e)
   {
                    
      Random rndcpuX = new Random();
      Random rndcpuY = new Random();
      
      Object source = e.getSource();
      
      for ( int i = 0; i < 3; i++)
      {
         for ( int j = 0; j < 3 ; j++)
         {
           
            if (source == button[i][j])
            {  
               int cpuX_1;
               int cpuX_2;
               int cpuX_i = 0;
               int cpuY_1;
               int cpuY_2;
               int cpuY_j = 0;
                                                    
               //indexTempX = i;
               //indexTempY = j;
               //System.out.println(i + " " + j);       
               
               button[i][j].setText( " X " );
               //JOptionPane.showMessageDialog(null,"User Selected: (" + i + " , " + j + ")");
               button[i][j].setEnabled(false);
               Selected[i][j] = 1;
               
               /*
               System.out.println("USER SELECTIONS");
               for ( int l = 0 ; l < 3; l++ )
               { 
                  for ( int t = 0 ; t < 3 ; t++ )
                  {
                     
                     System.out.print(Selected[l][t] + "");       
                  
                  }                        
                 ;
                  System.out.println();
               }
               */   
               // Need to come up with a general algorithm to select
               // Computer moves that discard User Inputs
               
              
               switch (i) {
                  case 0 :
                     
                     cpuX_1 = 1;
                     cpuX_2 = 2;
                     cpuX_i = rndcpuX.nextBoolean() ? cpuX_1 : cpuX_2;
                     
                     break;           
                  case 1 :  
                     cpuX_1 = 0;
                     cpuX_2 = 2;
                     cpuX_i = rndcpuX.nextBoolean() ? cpuX_1 : cpuX_2;
                     break;
                  case 2 :
                     cpuX_1 = 0;
                     cpuX_2 = 1;
                     cpuX_i = rndcpuX.nextBoolean() ? cpuX_1 : cpuX_2;      
                     break;
               } 
                   
               switch (j) {
                  case 0 : 
                     cpuY_1 = 1;
                     cpuY_2 = 2;
                     cpuY_j = rndcpuX.nextBoolean() ? cpuY_1 : cpuY_2;
                     break;           
                  case 1 :
                     cpuY_1 = 0;
                     cpuY_2 = 2;
                     cpuY_j = rndcpuY.nextBoolean() ? cpuY_1 : cpuY_2;
                     break;
                  case 2 :
                     cpuY_1 = 0;
                     cpuY_2 = 1;
                     cpuY_j = rndcpuX.nextBoolean() ? cpuY_1 : cpuY_2;      
                     break;
               } // end of switch statement
                              
               
               if (button[cpuX_i][cpuY_j].isEnabled() && Selected[cpuX_i][cpuY_j] == 0 )
               {
                  
                                   
                  //System.out.println("Button Enabled");
                  button[cpuX_i][cpuY_j].setText( " O " );
                  //System.out.println("CPU picked :" + cpuX_i + " " + cpuY_j);
                  button[cpuX_i][cpuY_j].setEnabled(false); 
                  Selected[cpuX_i][cpuY_j] = 1;
                  
                  System.out.println("CURRENT BOARD SELECTIONS");
                  for ( int l = 0 ; l < 3; l++ )
                  { 
                     for ( int t = 0 ; t < 3 ; t++ )
                     {
                     
                        System.out.print(Selected[l][t] + "");       
                  
                     }                        
                     
                     System.out.println();
                  }                  
               }
               
               else
               {
                  int TempCpuX = cpuX_i;
                  
                  if ( TempCpuX != 0 || TempCpuX != 1 )
                     TempCpuX = 2;
                  else if ( TempCpuX != 0 || TempCpuX != 2 )  
                     TempCpuX = 1;
                  else if ( TempCpuX != 1 || TempCpuX != 2 )  
                     TempCpuX = 0;
                  
                  int TempCpuY = cpuY_j;
                  
                  if ( TempCpuY != 0 || TempCpuY != 1 )
                     TempCpuY = 2;
                  else if ( TempCpuY != 0 || TempCpuY != 2 )  
                     TempCpuX = 1;
                  else if ( TempCpuY != 1 || TempCpuY != 2 )  
                     TempCpuY = 0;
                     
                  //System.out.println("Button Enabled");
                  button[TempCpuX][TempCpuY].setText( " O " );
                  //System.out.println("CPU picked :" + cpuX_i + " " + cpuY_j);
                  button[TempCpuX][TempCpuY].setEnabled(false); 
                  Selected[TempCpuX][TempCpuY] = 1;
                  
                  System.out.println("CURRENT BOARD SELECTIONS");
                  for ( int l = 0 ; l < 3; l++ )
                  { 
                     for ( int t = 0 ; t < 3 ; t++ )
                     {
                     
                        System.out.print(Selected[l][t] + "");       
                  
                     }                                         
                  
               }               
               
               if (button[cpuX_i][cpuY_j].isEnabled() && Selected[cpuX_i][cpuY_j] == 0 )
               {
                  
                                   
                  //System.out.println("Button Enabled");
                  button[cpuX_i][cpuY_j].setText( " O " );
                  //System.out.println("CPU picked :" + cpuX_i + " " + cpuY_j);
                  button[cpuX_i][cpuY_j].setEnabled(false); 
                  Selected[cpuX_i][cpuY_j] = 1;
                  
                  System.out.println("CURRENT BOARD SELECTIONS");
                  for ( int l = 0 ; l < 3; l++ )
                  { 
                     for ( int t = 0 ; t < 3 ; t++ )
                     {
                     
                        System.out.print(Selected[l][t] + "");       
                  
                     }                        
                     
                     System.out.println();
                  }                  
               }
                  
                  
                  // I do not know what to do! 
                  //System.out.println("Button NOT Enabled\nClick Other");
                  
               }
                                                     
            }          
         }
      }         
   }
   
   public int checkVictory( int a, int b)
   {    
      return 0;   
   }
   public static void main(String[] args)
   {
      TicTacToe frame = new TicTacToe();
      frame.setVisible(true);
   }

}   
   
      
       
            
            
            
            
            
            
            
            
               