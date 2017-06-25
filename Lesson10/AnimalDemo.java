// Programmer: Edgar Colin
// Student ID: EDG2140344
// Class: CIS263AA JAVA II Class # 12303
// Instructor: Michael Parmeley
// Chapter: 10
// Problem: 2
// Part: d)
// Filename: AnimalDemo.java

import java.util.*;
public class AnimalDemo
{
   public static void main(String[] args)
   {
      String name;
      int age;
      int size;
      String food;
      
      Animal aAnimal = new Animal();
      Bear aBear = new Bear();
      Shark aShark = new Shark();
      
           
      System.out.println("Bear Subclass Demo: \n");
      
      //Bear Set
      aBear.setName("Bear"); // Inhereted Method
      aBear.setAge(5); // Inhereted Method
      aBear.setSize(25); // Inhereted Method
      aBear.setFood("Fish"); // Inhereted Method
      aBear.setAction("The Bear is hibernating"); //Subclass Bear method 
      
      //Bear Get
      
      System.out.println("Animal: " + aBear.getName());
      System.out.println("Age y/o: "+ aBear.getAge());
      System.out.println("Size (ft): " + aBear.getSize());
      System.out.println("Main Diet: " + aBear.getFood());
      System.out.println("Currently: "+ aBear.getAction() +"\n");
      
      System.out.println("Shark Subclass Demo: \n");

      //Shark Set
      aShark.setName("Shark"); // Inhereted Method
      aShark.setAge(20); // Inhereted Method
      aShark.setSize(4); // Inhereted Method
      aShark.setFood("Tuna"); // Inhereted Method
      aShark.setLocation("The Shark is in the water"); //Subclass Shark method 
      
      //Shark Get
      
      System.out.println("Animal: " + aShark.getName());
      System.out.println("Age y/o: "+ aShark.getAge());
      System.out.println("Size (ft): " + aShark.getSize());
      System.out.println("Main Diet: " + aShark.getFood());
      System.out.println("Currently: "+ aShark.getLocation());
   }
}  