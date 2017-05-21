// Writen by Edgar Colin
// Aug 14th 2016
// Class: CIS163 Java I
// Prof: Michael Parmeley
// Section 14887
// HW 4 Problem 3c
// Filename: BirdSighting.java

// Class Declaration Public
public class BirdSighting2 
{  
   //Class Fields 
   //Use privates because these 
   //Fields are part of a non-static class 
   private String birdSpecies;
   private int numberSeen;
   private int day;
   
   
   //Constructor CALLS the 3 parameter Method Below
      
   public BirdSighting2()
   {
     // Calling the three parameters from the
     // "MASTER" Constructor below.
     this("Robin",1,1);
   }
   public BirdSighting2(String Species, int seen, int theDay) // Overloaded Constructor 3(b)
   { // This constructor 
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