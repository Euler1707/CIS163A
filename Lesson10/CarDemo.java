// Programmer: Edgar Colin
// Student ID: EDG2140344
// Class: CIS263AA JAVA II Class # 12303
// Instructor: Michael Parmeley
// Chapter: 10
// Problem: 3
// Part: d)
// Filename: CarDemo.java

import java.util.*;

public class CarDemo
{
   public static void main(String[] args)
   {
      
      // Grand Parent Class
      Car Ford = new Car("Ford","Focus");
      // Parent Class 
      Camaro ChevyCamaro = new Camaro("Chevy", "Camaro", 155.3);
      // Grand Child Class 
      SmartCar SmartElectric = new SmartCar("Smart", "Electric", 100, "Car Charging");
      
      
      System.out.println("Car 1 Grand Parent Class:");
      System.out.println("Make: " +Ford.getModel()); // Original Method
      System.out.println("Model: " + Ford.getMake()); // Original Method
      System.out.println("");     
      System.out.println("Car 2 Parent Class:");
      System.out.println("Make: " + ChevyCamaro.getMake()); // Inhereted from Grand Parent 
      System.out.println("Model: " + ChevyCamaro.getModel()); // Inhereted from Grand Parent  
      System.out.println("Top Speed (mph): " + ChevyCamaro.getSpeed()); // New Method 
      System.out.println("");
      System.out.println("Car 3 Grandchild Class");
      System.out.println("Make: " +SmartElectric.getMake()); // Inhereted from Grand Parent
      System.out.println("Model: " + SmartElectric.getModel()); // Inhereted from Grand Parent 
      System.out.println("Top Speed (mph): " + SmartElectric.getSpeed()); // Inhereted from Parent
      System.out.println("Status: " + SmartElectric.getCharging()); // New Method 
   }
}   