// Programmer: Edgar Colin
// Student ID: EDG2140344
// Class: CIS263AA JAVA II Class # 12303
// Instructor: Michael Parmeley
// Chapter: 11 
// Problem: 2
// Part: b)
// Filename: TestPerson.java
public class TestPerson
{
   public static void main(String[] args)
   {
      Person myPerson[] = new Person[4];
      myPerson[0] = new Person("Edgar", "343-3234");  
      myPerson[1] = new Person("Carol", "434-4243");
      myPerson[2] = new Person("Guillermo", "454-1234");
      
      for(int x = 0; x < 3; ++x)
         System.out.println(myPerson[x]);   
  }
}  