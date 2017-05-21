// Create a purchase
import java.util.Scanner;

public class CreatePurchase
{
   public static void main(String[] args)
   {
       int invoiceNumber;
      
       double Sale;
       double saleTax; 
       double saleTaxRate;
       
       Purchase firstPurchase = new Purchase();
       
       Scanner keyboard = new Scanner(System.in);
       System.out.println("Please enter an invoice number");
       invoiceNumber = keyboard.nextInt();
       keyboard.nextLine();
       
       while(invoiceNumber < 1000 || invoiceNumber > 8000)
       {
         System.out.println("Error: Enter an invoice number between 1000 and 8000");
         invoiceNumber = keyboard.nextInt();
         keyboard.nextLine();
       
       
       } 
         
       System.out.println("Please enter the sale amount in USD");
       Sale = keyboard.nextDouble();  
       
       while(Sale < 0)
       {
         System.out.println("ERROR: Please enter a positive dollar amount");
         Sale = keyboard.nextDouble();
         keyboard.nextLine(); 
       }
       
      firstPurchase.setInvoiceNumber(invoiceNumber);
      firstPurchase.setSale(Sale); 
      firstPurchase.display();
         
       
       
          
       
       //firstPurchase.setInvoiceNumber(1000);
       
       
       
            
   }
}   
