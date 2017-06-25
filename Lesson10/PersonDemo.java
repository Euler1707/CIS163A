// Programmer: Edgar Colin
// Student ID: EDG2140344
// Class: CIS263AA JAVA II Class # 12303
// Instructor: Michael Parmeley
// Chapter: 10 
// Problem: 1
// Part: c) 
// Filename: PersonDemo.java
 
 
// This program will demonstrate the use of inheretance
// by using parent class Person and child class Student
 
import java.util.*;
public class PersonDemo
{
   public static void main(String[] args)
   {
      String aName;
      int aAge;
      String aID;
      Person aPerson = new Person();
      Student aStudent = new Student();
      
      Scanner keyboard = new Scanner(System.in);
      
      System.out.println("Enter the students full name, First and Last Name: ");
      aName = keyboard.nextLine();
      
      System.out.println("Enter the student's age: ");
      aAge = keyboard.nextInt();
      keyboard.nextLine();
      
      aPerson.setName(aName);
      aPerson.setAge(aAge);
      
      System.out.println("Enter the student's ID Number: ");
      aID = keyboard.nextLine();
      
      
      
      aStudent.setName(aName);
      aStudent.setAge(aAge);
      aStudent.setStudentId(aID);
      
      System.out.println("");
      System.out.println("Parent Class Implementation:");
      System.out.println("Student Name: " + aPerson.getName());
      System.out.println("Student's Age: " + aPerson.getAge());
      System.out.println("");
      System.out.println("Child Class Implementation w/ ID:");
      System.out.println("Student Name: " + aStudent.getName());
      System.out.println("Student's Age: " + aStudent.getAge());
      System.out.println("Student's ID#: " +aStudent.getStudentId());
   }


}