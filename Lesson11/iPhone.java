// Programmer: Edgar Colin
// Student ID: EDG2140344
// Class: CIS263AA JAVA II Class # 12303
// Instructor: Michael Parmeley
// Chapter: 11 
// Problem: 1
// Part: b)
// Filename: iPhone.java

public class iPhone implements Phone
{
   public void Call(Person aPerson)
   {
      System.out.println("Call iPhone ");// problem 1
      System.out.println("IPHONE\n");
      System.out.println(aPerson);
   }
   
   public void End()
   {   
      System.out.println("End Iphone");
   }
   public void Text(){}
//   Implementation of Problem 1
//   public static void main(String[] args)
//   {
//      Phone Apple = new iPhone();
//      Apple.Call();
//      Apple.End();
//   }
}      