import java.util.Scanner;

public class CreateBabysittingJob
{
   public static void main(String[] args)
   {
      int year;
      int yearending;
      
      int jobNum;
      String jobString;
      String combinedJobNum;
      
      int codeNum;
      int numChild;
      int time;
      
      boolean diap;
      
      Scanner keyboard = new Scanner(System.in);
      
      System.out.println("Please enter a year between 2013 and 2025: "); 
      year = keyboard.nextInt();
      keyboard.nextLine();
      
      while(year < 2013 || year > 2025)
      {
         System.out.println("ERROR: Please enter a year between 2013 and 2025: ");
         year = keyboard.nextInt();
         keyboard.nextLine();
      }
      
      System.out.println("Please enter a 4 digit job number between 1 and 9999: "); 
      jobNum = keyboard.nextInt();
      keyboard.nextLine();
      
      while(jobNum < 1 || jobNum > 9999)
      {
      System.out.println("ERROR: Please enter a job number between 1 and 9999: "); 
      jobNum = keyboard.nextInt();
      keyboard.nextLine();
      }
      
      System.out.println("Please enter a code between 1 and 3: "); 
      codeNum = keyboard.nextInt();
      keyboard.nextLine();
 
      while(codeNum < 1 || codeNum >3)
      {
      System.out.println("ERROR: Please enter a code between 1 and 3: "); 
      codeNum = keyboard.nextInt();
      keyboard.nextLine();
      }
      
      System.out.println("Enter the Number of Children: "); 
      numChild = keyboard.nextInt();
      keyboard.nextLine();
      
      System.out.println("Enter the Number of Amount of Hours: "); 
      time = keyboard.nextInt();
      keyboard.nextLine();
      
      System.out.println("Would you like to include dipper change for an additional $20\n" + 
      "If YES, enter 'true', for NO, enter 'false' :"); 
      diap = keyboard.nextBoolean();
      keyboard.nextLine();
     
      
      
      // Constructing a Job Number  
      
      yearending = (year - 2000); // save the last two digits of the year.
      String yearend = " " + yearending; // convert to a string.
      
      
      if(jobNum >= 1 && jobNum < 9)
      {
        jobString = "000" + jobNum; 
      }
      else if(jobNum >= 10 && jobNum < 100)
      {
        jobString = "00" + jobNum;      
      }
      else if(jobNum >= 100 && jobNum < 1000)
      {
        jobString = "0" + jobNum;       
      }
      else
      {
         jobString = "" + jobNum;
      }          
      
      
      combinedJobNum = yearend + jobString; 
      
   
      BabysittingJob newBabysittingJob = new BabysittingJob(combinedJobNum,codeNum,numChild,time,diap);
      
     
      newBabysittingJob.display();
         
   }   
   
}   