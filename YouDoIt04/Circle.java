/*
 // Writen by Edgar Colin
 // Aug 12th 2016
 // Class: CIS163 Java I
 // Prof: Michael Parmeley
 // Section 14887
 // HW 4 Problem 6(a)
 // Filename: TestCircle.java 
 
Create a class named Circle with fields named radius,
diameter, and area. Include a constructor that sets 
the radius to 1 and calculates the other two values.
Also include methods named setRadius()and getRadius()
The setRadius() method not only sets the radius 
but also calculates the other two values. (The 
diameter of a circle is twice the radius,
and the area of a circle is pi multiplied by the
square of the radius. Use the Math class PI 
constant for this calculation.) Save the class as
Circle.java.
*/

import java.util.*;
import static java.lang.Math.*;
public class Circle
{
   private double radius;
   private double diameter;
   private double area;
   
   public Circle()
   {
      radius = 1;
      diameter = 2*radius;
      area = Math.PI*radius*radius;
   }
   public void setRadius(double rad)
   {
      radius = rad;
      diameter = 2*radius;
      area = Math.PI*radius*radius;
   }
   public double getRadius()
   {
      return radius; 
   }
   public void display()
   {  
      System.out.println("Radius :" + radius);
      System.out.println("Diameter :" + diameter);
      System.out.println("Area :" + area);        
   }
   
}   