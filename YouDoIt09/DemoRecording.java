  // Writen by Edgar Colin
  // Sept 1th 2016
  // Class: CIS163 Java I
  // Prof: Michael Parmeley
  // Section 14887
  // HW 9 Problem 9
  // Filename: DemoRecording.java 


import java.util.*;
import java.util.ArrayList;
import javax.swing.*;
public class DemoRecording
{
   public static void main(String[] args)
   {
      
      
      Recording[] someRecording = new Recording[2];
      String song, artist, timeString, order, message ="";
      int time;
   
      
      for(int x = 0 ; x < someRecording.length; ++x)
      {
         song = JOptionPane.showInputDialog(null, 
            "Enter the title " + (x+1) + " > ");
         
         artist = JOptionPane.showInputDialog(null, 
            "Enter the artist " + (x+1) + " > ");
                         
         timeString = JOptionPane.showInputDialog(null, 
            "Enter the time of the song " + (x+1) + " in seconds ");
         time = Integer.parseInt(timeString);
         
         Recording temp = new Recording();
         temp.setArtist(artist);
         temp.setTitle(song); 
         temp.setPlayTime(time);
         someRecording[x] = temp;
      }       
      
      order = JOptionPane.showInputDialog(null,
         "By which field do you want to sort?\n" +
         "(S)ong, (A)rtist, or (T)ime");
      if(order.charAt(0) == 'S')
      {
           bubbleSortTitle(someRecording);
      } 
      else
      {
         if(order.charAt(0) == 'A')
         {
            
           bubbleSortArtist(someRecording);
         }
         else
         {
            bubbleSortPlayTime(someRecording); 
         }
      }
      
      for( int x = 0; x < someRecording.length; ++x)
      {
         message = message + "\nartist: " + 
            someRecording[x].getArtist() + "    song: " +
            someRecording[x].getTitle() + "     time: " +
            someRecording[x].getPlayTime();  
      }
      JOptionPane.showMessageDialog(null, message); 
   }
   public static void bubbleSortPlayTime(Recording[] array)
   {
      int a, b;
      Recording temp;
      int highSubscript = array.length - 1;
      for( a = 0; a < highSubscript; ++a)
      {
         for(b = 0; b < highSubscript; ++b)
         {
            if(array[b].getPlayTime() > array[b+1].getPlayTime())
            {
               temp = array[b];
               array[b] = array[b+1];
               array[b+1] = temp;
            }
         }
      }
   }
   
   public static void bubbleSortTitle(Recording[] array)
   {
      int a, b;
      String C,D;
      Recording temp;
      int highSubscript = array.length - 1;
      for( a = 0; a < highSubscript; ++a)
      {
         for(b = 0; b < highSubscript; ++b)
         {
            C = array[b].getTitle();
            D = array[b+1].getTitle();
            if(C.compareTo(D)>0)
            {
               temp = array[b];
               array[b] = array[b+1];
               array[b+1] = temp;
            }
         }
      }
    }  
    
    public static void bubbleSortArtist(Recording[] array)
    {
      int a, b;
      String C,D;
      Recording temp;
      int highSubscript = array.length - 1;
      for( a = 0; a < highSubscript; ++a)
      {
         for(b = 0; b < highSubscript; ++b)
         {
            C = array[b].getArtist();
            D = array[b+1].getArtist();
            if(C.compareTo(D)>0)
            {
               temp = array[b];
               array[b] = array[b+1];
               array[b+1] = temp;
            }
         }
      }
    }              
      
}   