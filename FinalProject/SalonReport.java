// Writen by Edgar Colin EDG2140344
  // Sept 1th 2016
  // Class: CIS163 Java I
  // Prof: Michael Parmeley
  // Section 14887
  // HW 9 Problem 7 B
  // Filename: SalonReport.java
  
 import java.util.*;
 import java.util.ArrayList;
 import javax.swing.*;
import java.io.*; 
 public class SalonReport
 {
   public static void main(String[] args)
   {
      
      Service[] someMenu = new Service[6];
      String item, message, empty , sort;
      int t , pr , zero;
      zero = 1;
      message = "";
      Service temp = new Service();
      
      Scanner input = new Scanner(System.in);
          
      someMenu[0] = new Service();
      someMenu[1] = new Service();
      someMenu[2] = new Service();
      someMenu[3] = new Service();
      someMenu[4] = new Service();
      someMenu[5] = new Service();
            
      someMenu[0].setDescription("Cut"); 
      someMenu[1].setDescription("Shampoo");  
      someMenu[2].setDescription("Manicure");  
      someMenu[3].setDescription("Style");  
      someMenu[4].setDescription("Permanent");  
      someMenu[5].setDescription("Trim"); 
      
      someMenu[0].setPrice(8.00); 
      someMenu[1].setPrice(4.00);  
      someMenu[2].setPrice(18.00);  
      someMenu[3].setPrice(48);  
      someMenu[4].setPrice(18);  
      someMenu[5].setPrice(6); 
      
      someMenu[0].setTime(15); 
      someMenu[1].setTime(10);  
      someMenu[2].setTime(30);  
      someMenu[3].setTime(55);  
      someMenu[4].setTime(35);  
      someMenu[5].setTime(5);
      
      
      //for(int n = 0 ; n < 6; ++n)
      //{
      //   someMenu[n].display();  
      //}
      
      do{
            System.out.println("By which field do you want to sort?\n" +
               "(D)escription, (P)Price, or (T)ime");
            
            sort = JOptionPane.showInputDialog(null,
               "By which field do you want to sort?\n" +
               "(D)escription, (P)Price, or (T)ime, Enter 0 to Exit");
            //String sort = input.nextLine();
                     
            if(sort.equals("0")) 
            {
               zero = Integer.parseInt(sort);
               System.exit(0);
            }  
              
            if(sort.charAt(0) == 'D')
            {
                 bubbleSortDescription(someMenu);
            } 
            else
            {
               if(sort.charAt(0) == 'P')
               {            
                 bubbleSortPrice(someMenu); 
               }
               else
               {
                  bubbleSortTime(someMenu);  
               }
               
            }     
            for( int x = 0; x < someMenu.length; ++x)
            {
               message = message + "\nDescription:         " + 
               someMenu[x].getDescription() + "          Price: $" +
               someMenu[x].getPrice() + "          Time (min): " +
               someMenu[x].getTime();  
            }
            JOptionPane.showMessageDialog(null, message);
             message = " ";
         }while(zero != 0);
   }
   public static void bubbleSortDescription(Service[] array)
   {
      int a, b;
      String C,D;
      Service temp;
      int highSubscript = array.length - 1;
      for( a = 0; a < highSubscript; ++a)
      {
         for(b = 0; b < highSubscript; ++b)
         {
            C = array[b].getDescription();
            D = array[b+1].getDescription();
            if(C.compareTo(D)>0)
            {
               temp = array[b];
               array[b] = array[b+1];
               array[b+1] = temp;
            }
         }
      }
    }
   public static void bubbleSortPrice(Service[] array)
   {
      int a, b;
      Service temp;
      int highSubscript = array.length - 1;
      for( a = 0; a < highSubscript; ++a)
      {
         for(b = 0; b < highSubscript; ++b)
         {
            if(array[b].getPrice() > array[b+1].getPrice())
            {
               temp = array[b];
               array[b] = array[b+1];
               array[b+1] = temp;
            }
         }
      }
   }
   public static void bubbleSortTime(Service[] array)
   {
      int a, b;
      Service temp;
      int highSubscript = array.length - 1;
      for( a = 0; a < highSubscript; ++a)
      {
         for(b = 0; b < highSubscript; ++b)
         {
            if(array[b].getTime() > array[b+1].getTime())
            {
               temp = array[b];
               array[b] = array[b+1];
               array[b+1] = temp;
            }
         }
      }
   }
   
}           