// Programmer: Edgar Colin
// Student ID: EDG2140344
// Class: CIS263AA JAVA II Class # 12303
// Instructor: Michael Parmeley
// Chapter: 10
// Problem: 3
// Part: c)
// Filename: SmartCar.java

//SmartCar.java, that has an additional field isCharging. 
//Implement a getter and setter for the new field.  


public class SmartCar extends Camaro
{
   private String isCharging;
   
   public SmartCar(String make, String model, double speed, String charging)
   {
      super(make, model, speed);
      isCharging = charging;
   } 
   public void setCharging(String charging)
   {
      isCharging = charging;
   }
   public String getCharging()
   {
      return isCharging;
   }
}