// Programmer: Edgar Colin
// Student ID: EDG2140344
// Class: CIS263AA JAVA II Class # 12303
// Instructor: Michael Parmeley
// Chapter: 10
// Problem: 2
// Part: c)
// Filename: Bear.java

public class Shark extends Animal
{
   private String isInWater;
      
   public void setLocation(String InWater)
   {
      isInWater = InWater;
   }
   public String getLocation()
   {
      return isInWater;
   }
}   