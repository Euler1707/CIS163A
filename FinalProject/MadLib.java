// Chapter 2 
// Writen by Edgar Colin EDG2140344
// Sept 1th 2016
// Class: CIS163 Java I
// Prof: Michael Parmeley
// Section 14887
// Chapter 2 Game zone 1 pg. 115.
// Filename: Madlib.java


import java.util.*;
import javax.swing.*;

public class MadLib
{
   public static void main(String[] args)
   {
   
      String person, place, adjetive, pluralNoun, action
         , pluralNoun2;
      
      person = JOptionPane.showInputDialog(null,
         "Enter a person you know > ");
      place = JOptionPane.showInputDialog(null,
         "Enter a place > ");      
      adjetive = JOptionPane.showInputDialog(null,
         "Enter an adjetive > ");
      pluralNoun = JOptionPane.showInputDialog(null,
         "Enter a plural noun > ");
      action = JOptionPane.showInputDialog(null,
         "Enter an action verb > ");
      
      JOptionPane.showMessageDialog(null, "Last summmer,"
         + " my mom and dad took me and " + person + " on a trip to " + place + ".\n" 
         + "The weather there is very " + adjetive + "! Northern " + place 
         + " has many " + pluralNoun +".\nMany people also go there to " + action  
         + " or see the " + pluralNoun +".");
      
      int reply = JOptionPane.showConfirmDialog(null,
          "Play again?", "", JOptionPane.YES_NO_OPTION);
      while(reply == JOptionPane.YES_OPTION) 
      {
         person = JOptionPane.showInputDialog(null,
            "Enter a person you know > ");
         place = JOptionPane.showInputDialog(null,
            "Enter a place > ");      
         adjetive = JOptionPane.showInputDialog(null,
            "Enter an adjetive > ");
         pluralNoun = JOptionPane.showInputDialog(null,
            "Enter a plural noun > ");
         action = JOptionPane.showInputDialog(null,
            "Enter an action verb > ");
      
         JOptionPane.showMessageDialog(null, "Last summmer,"
            + " my mom and dad took me and " + person + " on a trip to " + place + ".\n" 
            + "The weather there is very " + adjetive + "! Northern " + place 
            + " has many " + pluralNoun +".\nMany people also go there to" + action  
            + " or see the " + pluralNoun +".\n");
            
         reply = JOptionPane.showConfirmDialog(null,
          "Play again?", "", JOptionPane.YES_NO_OPTION);            
      }       
      JOptionPane.showMessageDialog(null, "You have exited the game, GOOD BYE!!!");
      System.exit(0);
   }
           
   
}   