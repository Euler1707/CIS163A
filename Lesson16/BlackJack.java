// Programmer: Edgar Colin
// Student ID: EDG2140344
// Class: CIS263AA JAVA II Class # 12303
// Instructor: Michael Parmeley
// Chapter: 16  Advanced GUI part II
// Problem:2
// Part: 1
// Filename:BlackJack.java

import javax.swing.*;
import java.awt.*;
import java.awt.Color;
import java.awt.event.*;
import java.util.*;

public class BlackJack extends JFrame
  implements ActionListener
  {
   private final int WIDTH = 500;
   private final int HEIGHT = 900;
   
   int counter = 4;
   int sum = 0;
   
   int player1Hand = 0; 
   int cpuHand = 0;
   
   private ArrayList<String> obj = new ArrayList<String>();
   private ArrayList<String> shuffledObj =  new ArrayList<String>(); 
     
   private CardLayout cards = new CardLayout();
   private GridLayout p1cards = new GridLayout(3,4,10,10);
   private CardLayout ccards = new CardLayout();
   
   private JPanel player1Pnl = new JPanel(p1cards);
   private JButton p1 = new JButton("Player 1 Hand");
     
   private JPanel player2Pnl = new JPanel(ccards); 
   private JButton c1 = new JButton("CPU Hand");
   
      
   private JPanel DealerPnl = new JPanel(new GridLayout(1,4,10,10));
   private JButton hitButton = new JButton("HIT");
   private JButton stayButton = new JButton("STAY");
   private JButton resetButton = new JButton("RESET");   
   
   private JPanel deckPanel = new JPanel(cards);
   private JButton d1 = new JButton("DECK");
   
   private JButton[] cardButton = new JButton[51];
   
   private String[] objA = new String[51];
   
   private String[] valueInput = new String[51];
   private int[] valueOut = new int[51];
   
   
   Container FrameCon = getContentPane();
   
  
   public BlackJack()
   {
      super("BLACKJACK");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      FrameCon.setLayout(new GridLayout(3,1,10,10));
      FrameCon.add(player1Pnl);
      FrameCon.add(DealerPnl);
      FrameCon.add(player2Pnl);
      
      obj = makeDeck();
      Collections.shuffle(obj);
            
      objA = obj.toArray( new String[obj.size()]); 
      
      for (int q = 0; q <= 3 ; q++) 
      {   
         cardButton[q] = new JButton(objA[q]);
      }
         
         // Player 1 Cards Before reaching 21
                
         cardButton[4] = new JButton();
         cardButton[5] = new JButton();
         cardButton[6] = new JButton();
         cardButton[7] = new JButton();
         cardButton[8] = new JButton();
         cardButton[9] = new JButton();
         cardButton[10] = new JButton();
         cardButton[11] = new JButton();
         cardButton[12] = new JButton();
         cardButton[13] = new JButton();
         
           
      player1Pnl.setBackground(Color.GREEN);
      player1Pnl.setSize(300,300);
      
      for (int q = 2; q < 14 ; q++) 
      {   
         player1Pnl.add(cardButton[q]);
         cardButton[q].addActionListener(this);
      }
      
      
      int sum = 0;
      for ( int n = 0; n < 4 ; n++)
      {
         valueInput[n] = cardButton[n].getText().toString();
         valueOut[n] = FaceValue(valueInput[n]);
         sum +=valueOut[n];
         System.out.println("Item" + n + ":  " + valueOut[n] );
         System.out.println(sum); 
      }  
          
      System.out.println("\nComputer Hand:  " + valueOut[0] + ", " + valueOut[1]);
 
      System.out.println(valueOut[0] + valueOut[1]);
      
      System.out.println("Player 1 Hand: " + valueOut[2] + ", "  + valueOut[3]);
      System.out.println(valueOut[2] + valueOut[3]);     
            
      DealerPnl.setBackground(Color.GREEN);
      DealerPnl.setSize(300,300);
      DealerPnl.add(hitButton);
      hitButton.addActionListener(this);
      DealerPnl.add(stayButton);
      stayButton.addActionListener(this);
      
      DealerPnl.add(deckPanel);
      deckPanel.add(d1);     
      
      DealerPnl.add(resetButton);
      resetButton.addActionListener(this);
          
      player2Pnl.setBackground(Color.GREEN);
      player2Pnl.setSize(300,300);
      player2Pnl.add(c1);
                  
      setSize(WIDTH, HEIGHT);           
   }
   public ArrayList makeDeck()
   {
      ArrayList<String> made = new ArrayList<String>();
      
      String[] Set = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10","Q", "J", "K",
                      "A", "2", "3", "4", "5", "6", "7", "8", "9", "10","Q", "J", "K",
                      "A", "2", "3", "4", "5", "6", "7", "8", "9", "10","Q", "J", "K",
                      "A", "2", "3", "4", "5", "6", "7", "8", "9", "10","Q", "J", "K" };
      
      for ( int i  = 0 ; i < 51; i++)
      {
         made.add(Set[i]);
      }   
      return made; 
   
   }
   public int FaceValue(String str)
   {
      int a = 0;
      
      switch (str){
         case "A": a = 11;
            break;
         case "2": a = 2;
            break;
         case "3": a = 3;
            break;
         case "4": a = 4;
            break;
         case "5": a = 5;
            break;
         case "6": a = 6;
            break;
         case "7": a = 7;
            break;
         case "8": a = 8;
            break;
         case "9": a = 9;
            break;
         case "10": a = 10;
            break;  
         case "J": a = 10;
            break; 
         case "Q": a = 10;
            break;              
         case "K": a = 10;
            break;          
      }                             
         
      return a;
   }
   public void actionPerformed(ActionEvent e)
   {
     
     
      Object source = e.getSource();
      if ( source == hitButton )
      {   
         cardButton[counter].setText(objA[counter]);  
         valueInput[counter] = cardButton[counter].getText().toString();
         valueOut[counter] = FaceValue(valueInput[counter]);
         sum += valueOut[counter];
         counter++; 
           
      } 
      
      player1Hand = sum + valueOut[2] + valueOut[3]; 
         
      cpuHand = valueOut[0] + valueOut[1];
    
      if ( source == stayButton )
      {
         
         hitButton.setEnabled(false);
         stayButton.setEnabled(false);
         
         if ( player1Hand > cpuHand && player1Hand < 21 )
         {
            JOptionPane.showMessageDialog(null, "You have decided to stay you have: " + player1Hand + 
               "\nThe computer has: " + cpuHand + "\nPLAYER 1 WINS"); 
         } 
         else if ( player1Hand < cpuHand  && cpuHand < 21 )
         {
            JOptionPane.showMessageDialog(null, "You have decided to stay you have: " + player1Hand + 
               "\nThe computer has: " + cpuHand + "\nCOMPUTER WINS");
         
         } 
         else if ( player1Hand == cpuHand && player1Hand < 21 )
         {
            JOptionPane.showMessageDialog(null, "You have decided to stay you have: " + player1Hand + 
               "\nThe computer has: " + cpuHand + "\nNOBODY WINS");

         }
         if ( player1Hand < cpuHand && player1Hand > 21 )
         {
            JOptionPane.showMessageDialog(null, "You have decided to stay you have: " + player1Hand + 
               "\nThe computer has: " + cpuHand + "\nPLAYER 1 WINS"); 
         } 

      }
      
      if ( player1Hand > 21 && cpuHand < 21 )
      {
         JOptionPane.showMessageDialog(null, "You have more than 21!!!\n" + 
             "Your hand is " + player1Hand + ", YOU LOST!!!" + 
            "\nThe computer has: " + cpuHand + "\nCOMPUTER WINS! " ); 
         hitButton.setEnabled(false);
         stayButton.setEnabled(false);
      }
      if ( player1Hand > 21 && cpuHand > 21 )
      {
         JOptionPane.showMessageDialog(null, "You have more than 21!!!\n" + 
             "Your hand is " + player1Hand  + 
            "\nThe computer has more than 21 as well: " + cpuHand + "\nCOMPUTER WINS!  TIE!! " ); 
         hitButton.setEnabled(false);
         stayButton.setEnabled(false);
      }
      if ( cpuHand > 21 && player1Hand < 21)
      {
         JOptionPane.showMessageDialog(null, "You have more than 21!!!\n" + 
             "Your hand is " + player1Hand  + 
            "\nThe computer has more than 21 as well: " + cpuHand + "\nTIE!! " ); 
         hitButton.setEnabled(false);
         stayButton.setEnabled(false);
      }
      
      if ( source == resetButton )
      {
         System.exit(0);
      }
      
   }  
   public static void main(String[] args)
   {
      BlackJack frame = new BlackJack();
      frame.setVisible(true);
   }
}      
      
      