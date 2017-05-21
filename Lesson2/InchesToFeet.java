public class InchesToFeet
{   
   public static void main(String[] args)
   {
   final int FeetToInch = 12; // 12 inches in
   int inches = 86;
   System.out.println( inches + "inches converted to  feet ="); 
  
   System.out.println( inches/12 + " feet " 
      + inches%FeetToInch + " inches "); 
   }
} 

/* Integer division rounds toward 0. That is,
 the quotient produced for operands n and d that 
 are integers after binary numeric promotion (§5.6.2) 
 is an integer value q whose magnitude is as large as 
 possible while satisfying |d · q| ≤ |n|. Moreover, q is
 positive when |n| ≥ |d| and n and d have the same sign, 
 but q is negative when |n| ≥ |d| and n and d have 
 opposite signs. */