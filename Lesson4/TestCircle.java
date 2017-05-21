
/*

 // Writen by Edgar Colin
 // Aug 12th 2016
 // Class: CIS163 Java I
 // Prof: Michael Parmeley
 // Section 14887
 // HW 4 Problem 6(b)
 // Filename: TestCircle.java 


TestCircle main() method declares several Circle objects.
CircleSmall, CircleBig using the constructor and 
the setRadius() method. 2 values are assigned 
one Circle a small radius value, and another a larger 
radius value. A third circle object called defaultCircle
retains the value assigned at construction. 
The Circles are displayed with all the values for all the 
Circle object paramemters. 
*/

import java.util.*;

public class TestCircle
{
   public static void  main(String[] args)
   {
   
   double radiusSmall = .25; // Small Radius 
   double radiusBig = 100;   // Big Radius
     
   Circle CircleSmall = new Circle(); // Small Circle Instantiation
   Circle CircleBig = new Circle(); // Big Circle Instantiation
   Circle CircleDefault = new Circle();// Default Circle Instantiation
      
   // Setting instance parameters using the
   // setMethod within the Circle Class
   CircleSmall.setRadius(radiusSmall); 
   CircleBig.setRadius(radiusBig);
   //The default Circle as its name suggests contains
   //the default values assigned to the constructor Circle()
      
   // The following section uses the display method
   // within the circle class set to display the 
   // contents of the circle method containing 
   // its parameters.
   System.out.println("**Small Circle Properties**");
   System.out.println(" ");
   CircleSmall.display();
   System.out.println(" ");
   System.out.println("**Big Circle Properties**");
   System.out.println(" ");
   CircleBig.display();
   System.out.println(" ");
   System.out.println("**Default Circle Properties**");
   System.out.println(" ");
   CircleDefault.display(); 
   System.out.println(" ");
   System.out.println(" ---End of Program--- ");
   
   }
}   