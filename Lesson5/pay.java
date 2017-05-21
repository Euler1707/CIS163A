 // Writen by Edgar Colin
 // Aug 12th 2016
 // Class: CIS163 Java I
 // Prof: Michael Parmeley
 // Section 14887
 // HW 5 Problem 6 MODIFIED
 // Filename: pay.java 



import java.util.Scanner;

public class pay
{
   public static void main(String[] args)
   {
   
      
      int skillSelection;
      int benefitSelection1;
      int benefitSelection2;
      int benefitSelection3;
      
      int savingSelection;
      double grossPay;
      double savingsRate; 
      double moneySaved;
      
      double benefitCost1;
      double benefitCost2;
      double benefitCost3;
      
      double pay;
      double payRate;
      double hoursWorked;
      double overtimePay = 0;
      double overtimepayRate;
      double overtimeMult = 1.50;
      double overtimeHours = 0; // Number of overtime hours worked
      
      double afterdeductionPay;
      
      Scanner userInput = new Scanner(System.in);
      
      
      
      System.out.println("Please enter the Total number of hours worked this week.");
      hoursWorked = userInput.nextDouble();
      userInput.nextLine();
      
      System.out.println("Please enter your skill level");
      skillSelection = userInput.nextInt();
      userInput.nextLine();
      
            
      System.out.println("The hours you worked this week: " + hoursWorked);
      
      System.out.println("Your skill level is: " + skillSelection);

     
      if(hoursWorked > 40.00)
      {
         overtimeHours = hoursWorked - 40;
         hoursWorked = 40;  
      }
      
      System.out.println("The regular time worked this week: " + hoursWorked + " hrs"); 
      System.out.println("The overtime worked this week: " + overtimeHours + " hrs");  
      
      
      switch(skillSelection)
      {
         case 3:
            payRate = 22.00;
            overtimepayRate = payRate*overtimeMult;
            grossPay = overtimepayRate*overtimeHours + payRate*hoursWorked; 
            
            System.out.println("Pay rate : " + payRate + " $/hr");
            System.out.println("Overtime pay rate : " + overtimepayRate + " $/hr");
            System.out.println("Regular time pay : $" + payRate*hoursWorked + " per week" );
            System.out.println("Overtime time pay : $" + overtimepayRate*overtimeHours + " per week" );
            System.out.println("Gross Pay : $" + grossPay + " per week");
            
            System.out.println(
             "Enter an optional available benefit from below: "
            +"\n"
            +"Available Benefits\n" 
            +"-----------------------------\n"
            +"(1) Medical Insurance     $32.25     \n"
            +"(2) Dental Insurance      $20.00     \n"
            +"(3) Long term life        $10.00     \n"
            +"-----------------------------\n"
            +">> ");
            
            System.out.println("If you want benefit (1) Medical Insurance, Enter 1, To skip benefit, press 0: ");
            benefitSelection1 = userInput.nextInt();
            userInput.nextLine();
            
            System.out.println("If you want benefit (2) Dental Insurance, Enter 2, To skip benefit, press 0: ");
            benefitSelection2 = userInput.nextInt();
            userInput.nextLine();
            
            System.out.println("If you want benefit (3) Long term life Insurance, Enter 3 , To skip benefit, press 0: ");
            benefitSelection3 = userInput.nextInt();
            userInput.nextLine();
          
            System.out.print("Benefit Selections are: " + benefitSelection1 + ", "
                + benefitSelection2 + ", " + benefitSelection3  );
      
            if(benefitSelection1 == 1)
            {  
               System.out.println("\n"); 
               System.out.println("You have acquired benefit 1!!!"); 
               benefitCost1 = 32.25;
               System.out.println("Benefit (1) Medical Insurance Cost = " + benefitCost1 +" per week");
            }
            else
            {
               System.out.println("\n");
               System.out.println("You skipped out of Benefit 1");
               benefitCost1 = 0;
               System.out.println("Benefit (1) Medical Insurance Cost = " + benefitCost1 +" per week");
            }
            
             if(benefitSelection2 == 2)
            {  
               System.out.println("\n"); 
               System.out.println("You have acquired benefit 2!!!");
               benefitCost2 = 20.00; 
               System.out.println("Benefit (2) Dental Insurance Cost = " + benefitCost2 +" per week"); 
            }
            else
            {
               System.out.println("\n");
               System.out.println("You skipped out of benefit 2");
               benefitCost2 = 0;
               System.out.println("Benefit (2) Dental Insurance Cost = " + benefitCost2 +" per week");
            }
            
            if(benefitSelection3 == 3)
            {  
               System.out.println("\n"); 
               System.out.println("You have acquired benefit 3!!!"); 
               benefitCost3 = 10.00;
               System.out.println("Benefit (3) Long term life Insurance Cost = " + benefitCost3 +" per week");
 
            }
            else
            {
               System.out.println("\n");
               System.out.println("You skipped out of benefit 3");
               benefitCost3 = 0;
               System.out.println("Benefit (3) Long term life Insurance Cost = " + benefitCost3 +" per week");
            }
               
            System.out.println("\n");
            System.out.println("Your skil level qualifies you to participate\n" +
            "in a retirement plan at 3% of their gross pay. \n" + 
            "If you want to participate, Press (1). If not Press (2). ");
               
            savingSelection = userInput.nextInt();
            
            if(savingSelection == 1)
            {  
               System.out.println("\n"); 
               System.out.println("You have elected to be in the savings plan"); 
               savingsRate = 0.03;
               moneySaved = savingsRate*grossPay;
               System.out.println("Money Saved: " + moneySaved);
 
            }
            else
            {
               System.out.println("\n"); 
               System.out.println("You have declined to be in the savings plan"); 
               savingsRate = 0.0;
               moneySaved = savingsRate*grossPay;
               System.out.println("Money Saved: " + moneySaved);
            }
            
            afterdeductionPay = grossPay - (benefitCost1 + benefitCost2 + benefitCost3 + moneySaved);
            
            if(afterdeductionPay > 0)
            {
            System.out.println("\n");
            System.out.println("**************Pay Summary*****************");
            System.out.println("Regular time pay : $" + payRate*hoursWorked + " per week" );
            System.out.println("Overtime time pay : $" + overtimepayRate*overtimeHours + " per week" );
            System.out.println("Gross Pay : $" + grossPay + " per week"); 
            System.out.println("Money Saved Deduction : $" + moneySaved + " per week");
            System.out.println("Benefit (1) Medical Insurance Cost = $" + benefitCost1 +" per week");
            System.out.println("Benefit (2) Dental Insurance Cost = $" + benefitCost2 +" per week");
            System.out.println("Benefit (3) Long term life Insurance Cost = " + benefitCost3 +" per week");  
            System.out.println("________________________________________________________________________");
            System.out.println("Pay After Deductions : $" + afterdeductionPay);
            System.out.println("________________________________________________________________________");
            }
            else
            {
               System.out.println("");
               System.out.println("Error*** Gross Pay amount < Deductions, Balance $" + afterdeductionPay); 
               System.out.println("TRY AGAIN!!!!!!");
            }   
            
            break;
         
         case 2:
            payRate = 20.00;
            overtimepayRate = payRate*overtimeMult;
            grossPay = overtimepayRate*overtimeHours + payRate*hoursWorked; 
            
            System.out.println("Pay rate : " + payRate + " $/hr");
            System.out.println("Overtime pay rate : " + overtimepayRate + " $/hr");
            System.out.println("Regular time pay : $" + payRate*hoursWorked + " per week" );
            System.out.println("Overtime time pay : $" + overtimepayRate*overtimeHours + " per week" );
            System.out.println("Gross Pay : $" + grossPay + " per week");
            
            System.out.println(
             "Enter an optional available benefit from below: "
            +"\n"
            +"Available Benefits\n" 
            +"-----------------------------\n"
            +"(1) Medical Insurance     $32.25     \n"
            +"(2) Dental Insurance      $20.00     \n"
            +"(3) Long term life        $10.00     \n"
            +"-----------------------------\n"
            +">> ");
            
            System.out.println("If you want benefit (1) Medical Insurance, Enter 1, To skip benefit, press 0: ");
            benefitSelection1 = userInput.nextInt();
            userInput.nextLine();
            
            System.out.println("If you want benefit (2) Dental Insurance, Enter 2, To skip benefit, press 0: ");
            benefitSelection2 = userInput.nextInt();
            userInput.nextLine();
            
            System.out.println("If you want benefit (3) Long term life Insurance, Enter 3 , To skip benefit, press 0: ");
            benefitSelection3 = userInput.nextInt();
            userInput.nextLine();
          
            System.out.print("Benefit Selections are: " + benefitSelection1 + ", "
                + benefitSelection2 + ", " + benefitSelection3  );
      
            if(benefitSelection1 == 1)
            {  
               System.out.println("\n"); 
               System.out.println("You have acquired benefit 1!!!"); 
               benefitCost1 = 32.25;
               System.out.println("Benefit (1) Medical Insurance Cost = " + benefitCost1 +" per week");
            }
            else
            {
               System.out.println("\n");
               System.out.println("You skipped out of Benefit 1");
               benefitCost1 = 0;
               System.out.println("Benefit (1) Medical Insurance Cost = " + benefitCost1 +" per week");
            }
            
             if(benefitSelection2 == 2)
            {  
               System.out.println("\n"); 
               System.out.println("You have acquired benefit 2!!!");
               benefitCost2 = 20.00; 
               System.out.println("Benefit (2) Dental Insurance Cost = " + benefitCost2 +" per week"); 
            }
            else
            {
               System.out.println("\n");
               System.out.println("You skipped out of benefit 2");
               benefitCost2 = 0;
               System.out.println("Benefit (2) Dental Insurance Cost = " + benefitCost2 +" per week");
            }
            
            if(benefitSelection3 == 3)
            {  
               System.out.println("\n"); 
               System.out.println("You have acquired benefit 3!!!"); 
               benefitCost3 = 10.00;
               System.out.println("Benefit (3) Long term life Insurance Cost = " + benefitCost3 +" per week");
 
            }
            else
            {
               System.out.println("\n");
               System.out.println("You skipped out of benefit 3");
               benefitCost3 = 0;
               System.out.println("Benefit (3) Long term life Insurance Cost = " + benefitCost3 +" per week");
            }
               
            /*System.out.println("\n");
            System.out.println("Your skil level qualifies you to participate\n" +
            "in a retirement plan at 3% of their gross pay. \n" + 
            "If you want to participate, Press (1). If not Press (2). ");
               
            savingSelection = userInput.nextInt();
            
            if(savingSelection == 1)
            {  
               System.out.println("\n"); 
               System.out.println("You have elected to be in the savings plan"); 
               savingsRate = 0.03;
               moneySaved = savingsRate*grossPay;
               System.out.println("Money Saved: " + moneySaved);
 
            }
            else
            {
               System.out.println("\n"); 
               System.out.println("You have declined to be in the savings plan"); 
               savingsRate = 0.0;
               moneySaved = savingsRate*grossPay;
               System.out.println("Money Saved: " + moneySaved);
            }
            */
            
            afterdeductionPay = grossPay - (benefitCost1 + benefitCost2 + benefitCost3);
            
            if(afterdeductionPay > 0)
            {
            System.out.println("\n");
            System.out.println("**************Pay Summary*****************");
            System.out.println("Regular time pay : $" + payRate*hoursWorked + " per week" );
            System.out.println("Overtime time pay : $" + overtimepayRate*overtimeHours + " per week" );
            System.out.println("Gross Pay : $" + grossPay + " per week"); 
            //System.out.println("Money Saved Deduction : $" + moneySaved + " per week");
            System.out.println("Benefit (1) Medical Insurance Cost = $" + benefitCost1 +" per week");
            System.out.println("Benefit (2) Dental Insurance Cost = $" + benefitCost2 +" per week");
            System.out.println("Benefit (3) Long term life Insurance Cost = " + benefitCost3 +" per week");  
            System.out.println("________________________________________________________________________");
            System.out.println("Pay After Deductions : $" + afterdeductionPay);
            System.out.println("________________________________________________________________________");
            }
            else
            {  
               System.out.println("");
               System.out.println("Error*** Gross Pay amount < Deductions, Balance $" + afterdeductionPay); 
               System.out.println("TRY AGAIN!!!!!!");
            }  
            break;
         
         case 1:
            payRate = 17.00;
            overtimepayRate = payRate*overtimeMult;
            grossPay = overtimepayRate*overtimeHours + payRate*hoursWorked; 
            
            System.out.println("Pay rate : " + payRate + " $/hr");
            System.out.println("Overtime pay rate : " + overtimepayRate + " $/hr");
            System.out.println("Regular time pay : $" + payRate*hoursWorked + " per week" );
            System.out.println("Overtime time pay : $" + overtimepayRate*overtimeHours + " per week" );
            System.out.println("Gross Pay : $" + grossPay + " per week");
            /*
            System.out.println(
             "Enter an optional available benefit from below: "
            +"\n"
            +"Available Benefits\n" 
            +"-----------------------------\n"
            +"(1) Medical Insurance     $32.25     \n"
            +"(2) Dental Insurance      $20.00     \n"
            +"(3) Long term life        $10.00     \n"
            +"-----------------------------\n"
            +">> ");
            
            System.out.println("If you want benefit (1) Medical Insurance, Enter 1, To skip benefit, press 0: ");
            benefitSelection1 = userInput.nextInt();
            userInput.nextLine();
            
            System.out.println("If you want benefit (2) Dental Insurance, Enter 2, To skip benefit, press 0: ");
            benefitSelection2 = userInput.nextInt();
            userInput.nextLine();
            
            System.out.println("If you want benefit (3) Long term life Insurance, Enter 3 , To skip benefit, press 0: ");
            benefitSelection3 = userInput.nextInt();
            userInput.nextLine();
          
            System.out.print("Benefit Selections are: " + benefitSelection1 + ", "
                + benefitSelection2 + ", " + benefitSelection3  );
      
            if(benefitSelection1 == 1)
            {  
               System.out.println("\n"); 
               System.out.println("You have acquired benefit 1!!!"); 
               benefitCost1 = 32.25;
               System.out.println("Benefit (1) Medical Insurance Cost = " + benefitCost1 +" per week");
            }
            else
            {
               System.out.println("\n");
               System.out.println("You skipped out of Benefit 1");
               benefitCost1 = 0;
               System.out.println("Benefit (1) Medical Insurance Cost = " + benefitCost1 +" per week");
            }
            
             if(benefitSelection2 == 2)
            {  
               System.out.println("\n"); 
               System.out.println("You have acquired benefit 2!!!");
               benefitCost2 = 20.00; 
               System.out.println("Benefit (2) Dental Insurance Cost = " + benefitCost2 +" per week"); 
            }
            else
            {
               System.out.println("\n");
               System.out.println("You skipped out of benefit 2");
               benefitCost2 = 0;
               System.out.println("Benefit (2) Dental Insurance Cost = " + benefitCost2 +" per week");
            }
            
            if(benefitSelection3 == 3)
            {  
               System.out.println("\n"); 
               System.out.println("You have acquired benefit 3!!!"); 
               benefitCost3 = 10.00;
               System.out.println("Benefit (3) Long term life Insurance Cost = " + benefitCost3 +" per week");
 
            }
            else
            {
               System.out.println("\n");
               System.out.println("You skipped out of benefit 3");
               benefitCost3 = 0;
               System.out.println("Benefit (3) Long term life Insurance Cost = " + benefitCost3 +" per week");
            }
               
            /*System.out.println("\n");
            System.out.println("Your skil level qualifies you to participate\n" +
            "in a retirement plan at 3% of their gross pay. \n" + 
            "If you want to participate, Press (1). If not Press (2). ");
               
            savingSelection = userInput.nextInt();
            
            if(savingSelection == 1)
            {  
               System.out.println("\n"); 
               System.out.println("You have elected to be in the savings plan"); 
               savingsRate = 0.03;
               moneySaved = savingsRate*grossPay;
               System.out.println("Money Saved: " + moneySaved);
 
            }
            else
            {
               System.out.println("\n"); 
               System.out.println("You have declined to be in the savings plan"); 
               savingsRate = 0.0;
               moneySaved = savingsRate*grossPay;
               System.out.println("Money Saved: " + moneySaved);
            }
            */
            
            afterdeductionPay = grossPay - 0; //(benefitCost1 + benefitCost2 + benefitCost3);
            
            if(afterdeductionPay > 0)
            {
            System.out.println("\n");
            System.out.println("**************Pay Summary*****************");
            System.out.println("Regular time pay : $" + payRate*hoursWorked + " per week" );
            System.out.println("Overtime time pay : $" + overtimepayRate*overtimeHours + " per week" );
            System.out.println("Gross Pay : $" + grossPay + " per week"); 
            //System.out.println("Money Saved Deduction : $" + moneySaved + " per week");
            //System.out.println("Benefit (1) Medical Insurance Cost = $" + benefitCost1 +" per week");
            //System.out.println("Benefit (2) Dental Insurance Cost = $" + benefitCost2 +" per week");
            //System.out.println("Benefit (3) Long term life Insurance Cost = " + benefitCost3 +" per week");  
            System.out.println("________________________________________________________________________");
            System.out.println("Weekly Pay : $" + afterdeductionPay);
            System.out.println("________________________________________________________________________");
            }
            else
            {  
               System.out.println("");
               System.out.println("Error*** Gross Pay amount < Deductions, Balance $" + afterdeductionPay); 
               System.out.println("TRY AGAIN!!!!!!");
            }              
               break;
            
            default: System.out.print("\n");
                     System.out.print("*****************************************************************************\n");
                     System.out.print("***ERROR SKILL LEVEL SELECTED IS INVALID: SELECT VALUE 1,2 or 3 TRY AGAIN****\n");
                     System.out.print("*****************************************************************************\n");
                     break;   
      }
   }   
}
     
      
      
      