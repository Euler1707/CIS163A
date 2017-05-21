// Writen by Edgar Colin
// Aug 14th 2016
// Class: CIS163 Java I
// Prof: Michael Parmeley
// Section 14887
// HW 4 Problem 3a
// Filename: BirdSighting.java

// Class Declaration Public
public class BirdSighting 
{  
   //Class Fields 
   //Use privates because these 
   //Fields are part of a non-static class 
   private String birdSpecies;
   private int numberSeen;
   private int day;
   
   //Constructor with Initiated Values 3(a)
   public BirdSighting()
   {
     birdSpecies = "robin";
     numberSeen = 1;
     day = 1;
   }
   public BirdSighting(String Species, int seen, int theDay) // Overloaded Constructor 3(b)
   { // This constructor is overloaded. The Name is the same
     // As the constructor but number of inputs varies.
     // Cannot try new values because ints cannot be promoted
     birdSpecies = Species;
     numberSeen = seen;
     day = theDay;
   }
   public void setBirdSpecies(String bSpecies)
   {  //Sets the Bird Species
      birdSpecies = bSpecies;
   }
   public void setNumberSeen(int numSeen)
   {  //Sets the number of birds seen.
      numberSeen = numSeen;
   }
   public void setDay(int currentDay)
   {  //Sets the day.
      day = currentDay;
   }
   public String getBirdSpecies()
   {  //Get the bird Species
      return birdSpecies;
   }
   public int getNumberSeen()
   {  //Get the number seen
      return numberSeen;
   }
   public int getDay()
   {  //Get the day
      return day;
   }
   public void display()  
   {  // Display method outputs all the BirdSighting data.
      System.out.print("Bird Species name : " + birdSpecies +"\n"); 
      System.out.print("Number of Birds Seen : " + numberSeen+"\n");  
      System.out.print("Day the bird is Seen : " + day+"\n");     
   }
   
   
}