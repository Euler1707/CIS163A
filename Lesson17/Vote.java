// Programmer: Edgar Colin
// Student ID: EDG2140344
// Class: CIS263AA JAVA II Class # 12303
// Instructor: Michael Parmeley
// Chapter: 17 Applets
// Problem:2
// Part:
// Filename:Vote.java

//import java.applet.*;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Color;

public class Vote extends JApplet implements ActionListener
{
   
   
   int vote1, vote2;
   int numVoters = 300000; // Total number of elegible voters
   private String winner, yourVote; 
   boolean Flag;
   
   int Random;
   
   JButton candidateOne = new JButton("Vote for Candidate 1");
   JButton candidateTwo = new JButton("Vote for Candidate 2");
   JButton results = new JButton("See Results");
   
   
   JLabel Elections = new JLabel("Elections");
   JLabel Pick = new JLabel("\nPick Your Candidate!");
      
   
   Font font1 = new Font("Teen", Font.BOLD, 24);
   Font font2 = new Font("Arial", Font.BOLD, 18);
   
   JLabel userPick = new JLabel();
   JLabel resultsDisplay = new JLabel();
   JLabel messageDisplayVote = new JLabel();
   JLabel messageDisplayOne = new JLabel();
   JLabel messageDisplayTwo = new JLabel();
   JLabel messageDisplayTotal= new JLabel();
   Container con = getContentPane();
   
   
   public void init()
   {
      con.setLayout ( new FlowLayout());
      con.setBackground(Color.WHITE);

      Elections.setFont(font1);
      con.add(Elections);
      Pick.setFont(font2);
      con.add(Pick);
      

      userPick.setFont(font2);
      con.add(userPick);
       
      con.add(candidateOne);
      con.add(candidateTwo);
      
      con.add(results);
      messageDisplayVote.setFont(font1);
      con.add(messageDisplayVote);
      
      resultsDisplay.setFont(font1);
      con.add(resultsDisplay);
      
      con.add(messageDisplayOne);
      con.add(messageDisplayTwo);
      con.add(messageDisplayTotal);
      
      candidateOne.addActionListener(this);
      candidateTwo.addActionListener(this);
      results.addActionListener(this);
      results.setEnabled(false);
      
      //setSize(400,250);      
   } 
   public void start()
   {
      
   }
   public void stop()
   {
      
   }  
   public void display()
   {
      messageDisplayVote.setText("\nYou Voted For " + yourVote);
   }
   public static int randInt(int min, int max)
   {
      Random rand = new Random();
      int randomNum = rand.nextInt((max - min) + 1) + min;
      return randomNum;
   }
   public void display2()
   {
      int preVote = randInt(450000,550000);
      int votesExpected = 999999;
      int TotalCheck;
      messageDisplayOne.setText("The number of votes for candidate McCain: "
          + preVote + vote1 + vote2 + "\n");
      messageDisplayTwo.setText("The number of votes for candidate Obama: "
          + (votesExpected - preVote) + vote1 + vote2 + "\n");
          
      TotalCheck = (votesExpected - preVote) + vote1 + vote2 + preVote;
      messageDisplayTotal.setText("Total Vote: " + TotalCheck + "\n");       
      
      if ( (preVote + vote1 + vote2) > 500000 )
      {
         Flag = true;
         winner = "McCain";
      }
      else if ( (preVote + vote1 + vote2) < 500000 )
      {
         Flag = false;
         winner = "Obama";
      }
      
      resultsDisplay.setText("The winner is " + winner + "    \n");
      
   }
   public void actionPerformed(ActionEvent e)
   {
      
      Random = (int)(Math.random()*2);
      Object source = e.getSource();
      if ( source == candidateOne )
      {
         vote1++;
         yourVote = "McCain   ";
         display();
         candidateOne.setEnabled(false);
         candidateTwo.setEnabled(false);
         results.setEnabled(true);
         con.setBackground(Color.RED);
         
      }
      else if ( source == candidateTwo )
      {
         vote2++;
         yourVote = "Obama   ";
         display();
         candidateOne.setEnabled(false);
         candidateTwo.setEnabled(false);
         results.setEnabled(true);
         con.setBackground(Color.BLUE);
         
      }
      else
      {
         
         con.remove(Elections);
         con.remove(Pick);
         con.remove(messageDisplayVote);
         
        
         con.setBackground(Color.YELLOW);
         
         
         display2();
         System.out.println(Random);
         results.setEnabled(false);
                  
         
      }
      validate();
   
   }
}   
    
      
      