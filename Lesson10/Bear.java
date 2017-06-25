// Programmer: Edgar Colin
// Student ID: EDG2140344
// Class: CIS263AA JAVA II Class # 12303
// Instructor: Michael Parmeley
// Chapter: 10
// Problem: 2
// Part: b)
// Filename: Bear.java

public class Bear extends Animal
{
   private String isHibernating;
      
   public void setAction(String Hibernating)
   {
      isHibernating = Hibernating;
   }
   public String getAction()
   {
      return isHibernating;
   }
}   