 // Chapter 5
 // Writen by Edgar Colin EDG2140344
 // Aug 12th 2016
 // Class: CIS163 Java I
 // Prof: Michael Parmeley
 // Section 14887
 // Problem 6 MODIFIED
 // Filename: pay.java 



import java.util.Scanner;
import javax.swing.*;

public class pay
{
   public static void main(String[] args)
   {
   
      String skillSelection; 
      int IntskillSelection;
      int Benefit1;
      int Benefit2;
      int Benefit3;
      
      boolean isYes1;
      boolean isYes2;
      boolean isYes3;
      boolean isYes4;
      
      
      int savingSelection;
      int IntsavingSelection;
      double grossPay;
      double savingsRate; 
      double moneySaved;
      
      double benefitCost1;
      double benefitCost2;
      double benefitCost3;
      
      double pay;
      double payRate;
      String hoursWorked;
      int Inthoursworked;
      double overtimePay = 0;
      double overtimepayRate;
      double overtimeMult = 1.50;
      double overtimeHours = 0; // Number of overtime hours worked
      
      double afterdeductionPay;
      
      Scanner userInput = new Scanner(System.in);
      
     
      hoursWorked = JOptionPane.showInputDialog(null,
         "Please enter the Total number of hours worked this week.");
      Inthoursworked = Integer.parseInt(hoursWorked);     
        
      do
      {
       
         skillSelection =  JOptionPane.showInputDialog(null,
         "Please enter your skill level");
         IntskillSelection = Integer.parseInt(skillSelection);
      
      }while(IntskillSelection <= 0 || IntskillSelection >3); 
      
       
      
      JOptionPane.showMessageDialog(null,
         "The hours you worked this week: " + hoursWorked + "\n"
        +"Your skill level is: " + skillSelection);      
     
      System.out.println("The hours you worked this week: " + hoursWorked);
      
      System.out.println("Your skill level is: " + skillSelection);

     
      if(Inthoursworked > 40.00)
      {
         overtimeHours = Inthoursworked - 40;
         Inthoursworked = 40;  
      }
      
      System.out.println("The regular time worked this week: " + Inthoursworked + " hrs"); 
      System.out.println("The overtime worked this week: " + overtimeHours + " hrs");  
      
      
      switch(IntskillSelection)
      {
         case 3:
            payRate = 22.00;
            overtimepayRate = payRate*overtimeMult;
            grossPay = overtimepayRate*overtimeHours + payRate*Inthoursworked; 
            
            System.out.println("Pay rate : " + payRate + " $/hr");
            System.out.println("Overtime pay rate : " + overtimepayRate + " $/hr");
            System.out.println("Regular time pay : $" + payRate*Inthoursworked + " per week" );
            System.out.println("Overtime time pay : $" + overtimepayRate*overtimeHours + " per week" );
            System.out.println("Gross Pay : $" + grossPay + " per week");
            
            JOptionPane.showMessageDialog(null,
               "Gross Pay : $" + grossPay + " per week");  
            
            
            
            JOptionPane.showMessageDialog(null,
             "List of available benefits : "
            +"\n"
            +"Available Benefits\n" 
            +"-----------------------------\n"
            +"(1) Medical Insurance     $32.25     \n"
            +"(2) Dental Insurance      $20.00     \n"
            +"(3) Long term life        $10.00     \n"
            +"-----------------------------\n");
            
            
            // BENEFIT1
            Benefit1 = JOptionPane.showConfirmDialog(null,
                "Do you want benefit (1) Medical Insurance?");
            isYes1 = (Benefit1 == JOptionPane.YES_OPTION);    
                        
            // BENEFIT2
            Benefit2 = JOptionPane.showConfirmDialog(null,
                "Do you want benefit (2) Dental Insurance?");
            
            isYes2 = (Benefit2 == JOptionPane.YES_OPTION);
            
                    
            // BENEFIT3
            Benefit3 = JOptionPane.showConfirmDialog(null,
                "Do you want benefit (3) Long term life Insurance?");

            isYes3 = (Benefit2 == JOptionPane.YES_OPTION);
                     
            //System.out.print("Benefit Selections are: " + Benefit1 + ", "
            //    + Benefit2 + ", " + Benefit3  );
      
            if(isYes1 == true)
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
            
             if(isYes2 == true)
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
            
            if(isYes3 == true)
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
            
            
            
                       
            
            savingSelection = JOptionPane.showConfirmDialog(null,
                "Your skil level qualifies you to participate\n" +
            "in a retirement plan at 3% of their gross pay. \n" + 
            "Do you want to participate?");
            
            isYes4 = (savingSelection == JOptionPane.YES_OPTION);

            
         
            
            if(isYes4 == true)
            {  
               System.out.println("\n"); 
               System.out.println("You have elected to be in the savings plan"); 
               savingsRate = 0.03;
               moneySaved = Math.round(savingsRate*grossPay*100.0)/100.0;
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
            System.out.println("Regular time pay : $" + payRate*Inthoursworked + " per week" );
            System.out.println("Overtime time pay : $" + overtimepayRate*overtimeHours + " per week" );
            System.out.println("Gross Pay : $" + grossPay + " per week"); 
            System.out.println("Money Saved Deduction : $" + moneySaved + " per week");
            System.out.println("Benefit (1) Medical Insurance Cost = $" + benefitCost1 +" per week");
            System.out.println("Benefit (2) Dental Insurance Cost = $" + benefitCost2 +" per week");
            System.out.println("Benefit (3) Long term life Insurance Cost = " + benefitCost3 +" per week");  
            System.out.println("________________________________________________________________________");
            System.out.println("Pay After Deductions : $" + afterdeductionPay);
            System.out.println("________________________________________________________________________");
            
            
            JOptionPane.showMessageDialog(null,
               "\n"
               +"**************Pay Summary*****************\n"
               +"Regular time pay : $" + payRate*Inthoursworked + " per week\n" 
               +"Overtime time pay : $" + overtimepayRate*overtimeHours + " per week\n" 
               +"Gross Pay : $" + grossPay + " per week\n"
               +"Money Saved Deduction : $" + moneySaved + " per week\n"
               +"Benefit (1) Medical Insurance Cost = $" + benefitCost1 +" per week\n"
               +"Benefit (2) Dental Insurance Cost = $" + benefitCost2 +" per week\n"
               +"Benefit (3) Long term life Insurance Cost = " + benefitCost3 +" per week\n"  
               +"________________________________________________________________________\n"
               +"Pay After Deductions : $" + afterdeductionPay + "\n"
               +"________________________________________________________________________");
           
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
            grossPay = overtimepayRate*overtimeHours + payRate*Inthoursworked; 
            
            System.out.println("Pay rate : " + payRate + " $/hr");
            System.out.println("Overtime pay rate : " + overtimepayRate + " $/hr");
            System.out.println("Regular time pay : $" + payRate*Inthoursworked + " per week" );
            System.out.println("Overtime time pay : $" + overtimepayRate*overtimeHours + " per week" );
            System.out.println("Gross Pay : $" + grossPay + " per week");
            
            JOptionPane.showMessageDialog(null,
               "Gross Pay : $" + grossPay + " per week");
            
            JOptionPane.showMessageDialog(null,
             "List of available benefits : "
            +"\n"
            +"Available Benefits\n" 
            +"-----------------------------\n"
            +"(1) Medical Insurance     $32.25     \n"
            +"(2) Dental Insurance      $20.00     \n"
            +"(3) Long term life        $10.00     \n"
            +"-----------------------------\n");
            
            
            
            // BENEFIT1
            Benefit1 = JOptionPane.showConfirmDialog(null,
                "Do you want benefit (1) Medical Insurance?");
            isYes1 = (Benefit1 == JOptionPane.YES_OPTION);    
                        
            // BENEFIT2
            Benefit2 = JOptionPane.showConfirmDialog(null,
                "Do you want benefit (2) Dental Insurance?");
            
            isYes2 = (Benefit2 == JOptionPane.YES_OPTION);
            
                    
            // BENEFIT3
            Benefit3 = JOptionPane.showConfirmDialog(null,
                "Do you want benefit (3) Long term life Insurance?");

            isYes3 = (Benefit2 == JOptionPane.YES_OPTION);            
                
            if(isYes1 == true)
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
            
             if(isYes2 == true)
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
            
            if(isYes3 == true)
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
               
         
            afterdeductionPay = grossPay - (benefitCost1 + benefitCost2 + benefitCost3);
            
            if(afterdeductionPay > 0)
            {
            System.out.println("\n");
            System.out.println("**************Pay Summary*****************");
            System.out.println("Regular time pay : $" + payRate*Inthoursworked + " per week" );
            System.out.println("Overtime time pay : $" + overtimepayRate*overtimeHours + " per week" );
            System.out.println("Gross Pay : $" + grossPay + " per week"); 
            //System.out.println("Money Saved Deduction : $" + moneySaved + " per week");
            System.out.println("Benefit (1) Medical Insurance Cost = $" + benefitCost1 +" per week");
            System.out.println("Benefit (2) Dental Insurance Cost = $" + benefitCost2 +" per week");
            System.out.println("Benefit (3) Long term life Insurance Cost = " + benefitCost3 +" per week");  
            System.out.println("________________________________________________________________________");
            System.out.println("Pay After Deductions : $" + afterdeductionPay);
            System.out.println("________________________________________________________________________");
            
            JOptionPane.showMessageDialog(null,
               "\n"
               +"**************Pay Summary*****************\n"
               +"Regular time pay : $" + payRate*Inthoursworked + " per week\n" 
               +"Overtime time pay : $" + overtimepayRate*overtimeHours + " per week\n" 
               +"Gross Pay : $" + grossPay + " per week\n"
               //+"Money Saved Deduction : $" + moneySaved + " per week\n"
               +"Benefit (1) Medical Insurance Cost = $" + benefitCost1 +" per week\n"
               +"Benefit (2) Dental Insurance Cost = $" + benefitCost2 +" per week\n"
               +"Benefit (3) Long term life Insurance Cost = " + benefitCost3 +" per week\n"  
               +"________________________________________________________________________\n"
               +"Pay After Deductions : $" + afterdeductionPay + "\n"
               +"________________________________________________________________________");

            
            
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
            grossPay = overtimepayRate*overtimeHours + payRate*Inthoursworked; 
            
            System.out.println("Pay rate : " + payRate + " $/hr");
            System.out.println("Overtime pay rate : " + overtimepayRate + " $/hr");
            System.out.println("Regular time pay : $" + payRate*Inthoursworked + " per week" );
            System.out.println("Overtime time pay : $" + overtimepayRate*overtimeHours + " per week" );
            System.out.println("Gross Pay : $" + grossPay + " per week");
             
            JOptionPane.showMessageDialog(null,
              "Gross Pay : $" + grossPay + " per week");
            
            afterdeductionPay = grossPay - 0; //(benefitCost1 + benefitCost2 + benefitCost3);
            
            if(afterdeductionPay > 0)
            {
            System.out.println("\n");
            System.out.println("**************Pay Summary*****************");
            System.out.println("Regular time pay : $" + payRate*Inthoursworked + " per week" );
            System.out.println("Overtime time pay : $" + overtimepayRate*overtimeHours + " per week" );
            System.out.println("Gross Pay : $" + grossPay + " per week"); 
            //System.out.println("Money Saved Deduction : $" + moneySaved + " per week");
            //System.out.println("Benefit (1) Medical Insurance Cost = $" + benefitCost1 +" per week");
            //System.out.println("Benefit (2) Dental Insurance Cost = $" + benefitCost2 +" per week");
            //System.out.println("Benefit (3) Long term life Insurance Cost = " + benefitCost3 +" per week");  
            System.out.println("________________________________________________________________________");
            System.out.println("Weekly Pay : $" + afterdeductionPay);
            System.out.println("________________________________________________________________________");
            
            JOptionPane.showMessageDialog(null,
               "\n"
               +"**************Pay Summary*****************\n"
               +"Regular time pay : $" + payRate*Inthoursworked + " per week\n" 
               +"Overtime time pay : $" + overtimepayRate*overtimeHours + " per week\n" 
               +"Gross Pay : $" + grossPay + " per week\n"
               //+"Money Saved Deduction : $" + moneySaved + " per week\n"
               //+"Benefit (1) Medical Insurance Cost = $" + benefitCost1 +" per week\n"
               //+"Benefit (2) Dental Insurance Cost = $" + benefitCost2 +" per week\n"
               //+"Benefit (3) Long term life Insurance Cost = " + benefitCost3 +" per week\n"  
               +"________________________________________________________________________\n"
               +"Pay After Deductions : $" + afterdeductionPay + "\n"
               +"________________________________________________________________________");

            
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
     
      
      
      