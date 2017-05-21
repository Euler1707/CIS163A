 // Writen by Edgar Colin
 // Aug 22th 2016
 // Class: CIS163 Java I
 // Prof: Michael Parmeley
 // Section 14887
 // HW 6 Problem 15(a) Modified
 // Filename: BabysittingJob.java 



public class BabysittingJob
{
  
   String job;
   int code;
   int numKids;
   int hours;
   double rate;
   double pay;
   
   boolean diap;
   
   String Worker;
   
   

   public BabysittingJob(String jobNum, int codeNum, int numChild, int time, boolean Diaper)
   {
      job = jobNum;
      code = codeNum;
      hours = time;
      numKids = numChild;
      diap = Diaper;
      
      switch(code)
      {
         case 1:
         
        
         Worker = "Cindy";
         rate = 7;
         pay = rate*hours*numKids;
         
         break;
         
         case 2:
         
        
         Worker = "Greg";
         rate = 9;
         pay = rate*hours + 4*(numKids - 1)*hours;
         break;
         
         case 3:
                
         Worker = "Maria";
         rate = 9;
         pay = rate*hours + 4*(numKids - 1)*hours;
         break;
               
      }
      
      if(diap == true)
      {
         pay = pay + 20;
      }
      else if(diap ==false)
      {
         pay = pay;
      }
      
   }   
   public void display()
   {
      System.out.println("PRINTING RESULTS\n");
    
      System.out.println("Job Number: " + job);
      System.out.println("Code: " + code);
      System.out.println("Babysitter name: " + Worker);
      System.out.println("Number of Children: " + numKids);
      System.out.println("Time in Hours: " + hours);
      System.out.println("Diaper change included?: " + diap);
      System.out.println("Fee: $" + pay);
   }
}   
   
   
     
   