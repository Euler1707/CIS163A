import java.util.*;

public class Calculator
{
   int numerator;
      
   int denominator;
      
   double calculatedVal;
   public Calculator(int num, int den) throws ZeroInputError
   {
      numerator = num;
      denominator = den;
      
      if(denominator == 0){throw(new ZeroInputError());}
      calculatedVal = (double)num / den;
      System.out.println("Result : " + calculatedVal);
   }   
   public static void main(String[] args) 
   {       
     try
     {    
     
     int Anum, Aden;           
     Scanner input = new Scanner(System.in);
      //item = input.nextInt();
       
      
     System.out.print("Enter an integer for numerator >> ");
     Anum = input.nextInt();
     System.out.print("Enter an integer for denominator >> ");
     Aden = input.nextInt();

       Calculator ca = new Calculator(Anum,Aden);
          
     }
     catch(ZeroInputError e)
     {
       
       System.out.println(e.getMessage());
         
     }
  }
}  