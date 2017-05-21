// Writen by Edgar Colin
 // Aug 22th 2016
 // Class: CIS163 Java I
 // Prof: Michael Parmeley
 // Section 14887
 // HW 6 Problem 14(a) Modified
 // Filename: Purchase.java 

public class Purchase
{
   int invoiceNumber;
      
   double Sale;
   double saleTax; 
   double saleTaxRate;
   
   public Purchase()
   {
      invoiceNumber = 1 ;
      Sale = 1;
      saleTaxRate = 0.05;      
   }
   public void setInvoiceNumber(int invoice)
   {
      invoiceNumber = invoice;
   }
   public void setSale(double amount)
   {
      Sale = amount;
      saleTax = saleTaxRate*Sale;
   }
   public void display()
   {
    // Display method outputs all the purchase information data.
      System.out.print("Invoice Number : " + invoiceNumber +"\n"); 
      System.out.print("Sale  $" + Sale +"\n");  
      System.out.print("Sale Tax Rate $"+ saleTax +" \n"); 
      System.out.print("Grand Total : $" + (Sale + saleTax));    
   }
}   