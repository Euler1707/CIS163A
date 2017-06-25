// Programmer: Edgar Colin
// Student ID: EDG2140344
// Class: CIS263AA JAVA II Class # 12303
// Instructor: Michael Parmeley
// Chapter: 10
// Problem: 3
// Part: b)
// Filename: Camaro.java

// Create a subclass Camaro.java. Create an additional
// field for speed. Create a getter and setter for the 
// new field. 


public class Camaro extends Car
{
   private double Speed;
   
   public Camaro(String make, String model, double speed)
   {
      super(make, model);
      Speed = speed;
   } 
   public void setSpeed(int aspeed)
   {
      Speed = aspeed;
   }
   public double getSpeed()
   {
      return Speed;
   }
}