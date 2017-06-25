// Programmer: Edgar Colin
// Student ID: EDG2140344
// Class: CIS263AA JAVA II Class # 12303
// Instructor: Michael Parmeley
// Chapter: FinalProject 
// Problem: 1
// Part:
// Filename: JLotery2.java

import java.util.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class JLottery2 extends JFrame implements ItemListener, ActionListener
{

   final int WIDTH = 400;
   final int LENGTH = 300;
   final int NUMS = 6;
   final int SIZE = 31;
   
   final int THREE_MATCH = 100;
   final int FOUR_MATCH = 10000;
   final int FIVE_MATCH = 50000;
   final int SIX_MATCH = 1000000;
   final int LESS_TWO_MATCH = 0 ;
   
   private int counter = 0;
   private int hits = 0;
   private int cashPrice = 0;
   private int[] rand = new int[6];
   private int[] userNum = new int[6];
  
   private JCheckBox[] box = new JCheckBox[30];
   private FlowLayout mainFlowLayout = new FlowLayout();
   private GridLayout boxGrid = new GridLayout(5,5,10,10);
   private JPanel mainPanel = new JPanel(mainFlowLayout);
   private JPanel boxPanel = new JPanel(boxGrid);
   private JLabel Label = new JLabel("PICK 6 LUCKY NUMBERS TO WIN BIG!");
   Container Con = getContentPane();
    
   public JLottery2()
   {
      /* Window Setup */
      setTitle("FUN LOTTERY GAME");
      setSize(WIDTH, LENGTH);
      System.out.println();  
      
      /* Initializing Random Winning Numbers */
      for (int i = 0 ; i < 6 ; i++ )
      { 
         rand[i] = (int) (Math.random() * 30 + 1);  
      }
              
      /* Menu Setup */    
      JMenuBar Bar = new JMenuBar();
      setJMenuBar(Bar);
      JMenu menu = new JMenu("File");
      Bar.add(menu);
      JMenuItem section1 = new JMenuItem("About");
      menu.add(section1);
      section1.addActionListener(this);
      
      /* Setting Box Array */
      Con.add(mainPanel);
      mainPanel.add(Label);
      mainPanel.add(boxPanel);
      
      /* Initializing CheckBoxes  */
      for (int i = 0 ; i < 30 ; i++ )
      { 
         box[i] = new JCheckBox(String.valueOf(i+1));
         boxPanel.add(box[i]);  
         box[i].addItemListener(this);               
      }
        
   }  
   public static int arrayCompare( int[] a, int[] b )
   {
      int match = 0;    
      for ( int i = 0 ; i < a.length ; i++ )
      {
         if ( a[i] == b[i] )
         {
           match++;           
         }
      }
    
      return(match);          
   }
   public static int price( int matches )
   {
      int award = 0;
      
      if ( matches <= 2 )
      {
         award = 0;
      }
      else if (  matches == 3 )
      {
         award = 100;
      }
      else if ( matches == 4 )
      {
         award = 10000;
      }
      else if ( matches == 5 )
      {
         award = 50000;
      }
      else if ( matches == 6 )
      {
         award = 1000000;
      }
      else{ /* Do Nothing */ }
      
      return award;
   }
   public void actionPerformed(ActionEvent e) 
   {
      JOptionPane.showMessageDialog(null, "Programmer: Edgar Colin\n" +
                                          "Course: CIS263AA JAVA II\n" +
                                          "Section: Class # 12303\n" +
                                          "MEID: EDG2140344\n"  );
   }
   public void itemStateChanged(ItemEvent ex)
   {
      Object source = ex.getItem();
      String a;
      a = (((JCheckBox) source).getText());  
      
      int num = Integer.valueOf(a);
               
      if ( source == box[num-1] ) 
      {
         box[num-1].setEnabled(false); 
         userNum[counter] = num;
         counter++;
         // print used to motitor behavior 
         //System.out.println("Counter :" + counter);
         
         if ( counter > 5 )
         {
            for ( int i = 0 ; i < 30; i++)
            {
               box[i].setEnabled(false);
            }
            
            JOptionPane.showMessageDialog(null,
               "NUMBERS USER SELECTED:\n" + userNum[0] + " " + userNum[1] + " " +
                  userNum[2] + " " + userNum[3] + " " + userNum[4] + " " + userNum[5] + "\n" +
               "RANDOM LOTTERY NUMBERS:\n" + rand[0] + " " + rand[1] + " " +
                  rand[2] + " " + rand[3] + " " + rand[4] + " " + rand[5]); 
                  
            hits = arrayCompare(rand , userNum);
            // Testing Code Behavior 
            System.out.println("Hits: " + hits);      
            // Code works with by setting hits to 1,2,3,4,5,6 
            // Winning the Lottery is not Easy! 
            cashPrice = price( hits );
            System.out.println("Cash won: $" + cashPrice);
          
            JOptionPane.showMessageDialog(null, "You have won: $  " + cashPrice  );
          }                  
      }               
   }
   public static void main(String args[])
   {
      JLottery2 Lottery2 = new JLottery2();
      Lottery2.setVisible(true);      
   }
}   