// Programmer: Edgar Colin
// Student ID: EDG2140344
// Class: CIS263AA JAVA II Class # 12303
// Instructor: Michael Parmeley
// Chapter: Final Project
// Problem:3
// Part:
// Filename:JRockPaperScissors.java


import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Color;

public class JRockPaperScissors extends JApplet implements ActionListener
{

   private int random;
   private int userVal;
   private String winner;
   private String p1String;
   private String cpuString;
   
   private int tie = 0;
   private int p1W = 0;
   private int cpuW = 0;
   
   JButton rockButton = new JButton("ROCK");
   JButton paperButton = new JButton("PAPER");
   JButton scissorsButton = new JButton("SCISSORS");
   
   
   JLabel headerLabel = new JLabel("THE ROCK PAPER SCISSORS GAME!! PLAY!!\n");
   JLabel pickLabel = new JLabel("PICK ONE!");
   
   Font font1 = new Font("Teen", Font.BOLD, 18);
   Font font2 = new Font("Arial", Font.BOLD, 16);
   Font font3 = new Font("Arial", Font.BOLD, 18);
   
   JLabel roundDisplay = new JLabel();
   JLabel winnerDisplay = new JLabel();
   JLabel tallyDisplay = new JLabel();
   
   String studentInfo = "Edgar Colin\n" +
                        "CIS263AA JAVA\n" +
                        "# 12303\n" +
                        "EDG2140344\n";
   
   Container con = getContentPane();
   

   public void init()
   {
   
      con.setLayout(new FlowLayout());
      con.setBackground(Color.WHITE);
      con.add(headerLabel);
      con.add(pickLabel);
      con.add(rockButton);
      con.add(paperButton);
      con.add(scissorsButton);
      con.add(roundDisplay);
      con.add(winnerDisplay);
      con.add(tallyDisplay);
      
      headerLabel.setFont(font1);
      
      roundDisplay.setFont(font2);
      winnerDisplay.setFont(font3);
      
      
      rockButton.addActionListener(this);
      paperButton.addActionListener(this);
      scissorsButton.addActionListener(this);
      
      setSize(400,250);

      
   }
   public void display()
   {
      roundDisplay.setText("Player1: " + p1String + "  vs. " + 
                              " \nComputer: " + cpuString);
      winnerDisplay.setText("\nThe winner is??? " + winner );
      
      tallyDisplay.setText("\n tie: " + tie + "|  p1 : " + p1W + "| cpu: " + cpuW );
   }
   public void round( int p1 , int cpu )
   {
      if ( p1 == 1 && cpu == 1 )
      {
         tie++;
         winner = "Neither, a tie.";
         p1String = "Rock";
         cpuString = "Rock";
      }
      else if ( p1 == 1 && cpu == 2 )
      {
         cpuW++;
         winner = "The computer!";
         p1String = "Rock";
         cpuString = "Paper";
      }
      else if ( p1 == 1 && cpu == 3 )
      {
         p1W++;
         winner = "Player 1 wins!";
         p1String = "Rock";
         cpuString = "Scissors";
      }
      else if ( p1 == 2 && cpu == 1 ) //
      {
         p1W++;
         winner = "Player 1 wins!";
         p1String = "Paper";
         cpuString = "Rock";
      }
      else if ( p1 == 2 && cpu == 2 )
      {
         tie++;
         winner = "Neither, a tie.";
         p1String = "Paper";
         cpuString = "Paper";
      }
      else if ( p1 == 2 && cpu == 3 )
      {
         cpuW++;
         winner = "The computer!";
         p1String = "Paper";
         cpuString = "Scissors";

      }
      else if ( p1 == 3 && cpu == 1 ) //
      {
         cpuW++;
         winner = "The computer!";
         p1String = "Scissors";
         cpuString = "Rock";

      }
      else if ( p1 == 3 && cpu == 2 )
      {
         p1W++;
         winner = "Player 1 wins!";
         p1String = "Scissors";
         cpuString = "Paper";
      }
      else if ( p1 == 3 && cpu == 3 )
      {
         tie++;
         winner = "Neither, a tie.";
         p1String = "Scissors";
         cpuString = "Scissors";

      }      
   }
   public void paint(Graphics gr)
   {
      super.paint(gr);
      gr.drawString(studentInfo,75,240);
   }
   public void actionPerformed(ActionEvent e)
   {
      random = (int)(Math.random()*3+1);
      
      System.out.println(random);
      Object source = e.getSource();
      if ( source == rockButton )
      {
         userVal = 1;
         System.out.print("Rock\n"); 
      }
      else if ( source == paperButton )
      {
         userVal = 2;
         System.out.print("Paper\n");
      }
      else if ( source == scissorsButton )
      {
         userVal = 3;
         System.out.print("Scissors\n");
      }
      else { /* do nothing */ } 
      
      round(userVal,random);
      
      display();
      
      
      System.out.println( "tie: " + tie + " p1 : " + p1W + " cpu: " + cpuW);  
      
   }  
}    
