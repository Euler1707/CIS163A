// Programmer: Edgar Colin
// Student ID: EDG2140344
// Class: CIS263AA JAVA II Class # 12303
// Instructor: Michael Parmeley
// Chapter: 11 
// Problem: 1
// Part: c)
// Filename: Samsung.java

public class Samsung implements Phone
{
   public void Call(Person aPerson)
   {
      System.out.println("Call Samsung ");// problem 1
      System.out.println("SAMSUNG\n");
      System.out.println(aPerson);;
   }
   
   public void End()
   {   
      System.out.println("End Samsung");
   }
   public void Text(){}
//   Implementation of Problem 1
//   public static void main(String[] args)
//   {
//      Phone Galaxy = new Samsung();
//      Galaxy.Call();
//      Galaxy.End();
//   }
}      