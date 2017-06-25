// Programmer: Edgar Colin
// Student ID: EDG2140344
// Class: CIS263AA JAVA II Class # 12303
// Instructor: Michael Parmeley
// Chapter: 11 
// Problem: 2
// Part: a)
// Filename: Person.java

public class Person
{
   String name;
   String phoneNumber;
   
   public Person(String aName, String aPhoneNumber)
   {
      name = aName;
      phoneNumber = aPhoneNumber;
   }
   public String getName()
   {
      return name;
   }
   public String getPhoneNumber()
   {
      return phoneNumber;
   }
   public String toString()
   {
      String info = "Calling " + name + 
         " ...\nPhone number: " + phoneNumber;
      return info;  
   }      
   
}         
      