// Programmer: Edgar Colin
// Student ID: EDG2140344
// Class: CIS263AA JAVA II Class # 12303
// Instructor: Michael Parmeley
// Chapter: 10
// Problem: 2
// Part: a)
// Filename: Animal.java

public class Animal
{
   private String Name;
   private int Age;
   private int Size;
   private String Food;
   
   public void setName(String aName)
   {
      Name = aName;
   }
   public void setAge(int aAge)
   {
      Age = aAge;
   }
   public void setSize(int aSize)
   {
      Size = aSize;
   }
   public void setFood(String aFood)
   {
      Food = aFood;
   }
   public String getName()
   {
      return Name;
   }
   public int getAge()
   {
      return Age;
   }
   public int getSize()
   {
      return Size;
   }
   public String getFood()
   {
      return Food;
   }
}   