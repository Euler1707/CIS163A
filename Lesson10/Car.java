// Programmer: Edgar Colin
// Student ID: EDG2140344
// Class: CIS263AA JAVA II Class # 12303
// Instructor: Michael Parmeley
// Chapter: 10
// Problem: 3
// Part: a)
// Filename: Car.java

// Create a class Car.java that has the data fields make 
// and model. Create getters and setters for these fields

public class Car
{
   private String Make;
   private String Model;
   
   public Car(String make, String model)
   {
      Make = make;
      Model = model;
   }   
   public void setMake(String aMake)
   {
      Make = aMake;
   }
   public void setModel(String aModel)
   {
      Model = aModel;
   }
   public String getMake()
   {
      return Make;
   }
   public String getModel()
   {
      return Model;
   }
}   