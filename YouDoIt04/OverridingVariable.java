public class OverridingVariable
{ // This class and methods show how to override variables using
   // Different Methods.
   public static void main(String args[])
   {
    
      int aNumber = 10;
    
      System.out.print("In main(), a aNumber is " + aNumber);
      firstMethod();
      System.out.println("Back in main(), aNumber is " + aNumber);
      secondMethod(aNumber);
      System.out.println("Back in main(), aNumber is " + aNumber);   
   }
   public static void firstMethod()
   {
      int aNumber = 77;
      System.out.println("\nIn firstMethod(), aNumber is "
         + aNumber);         
   }
   public static void secondMethod(int aNumber)
   {
      System.out.println("In second Method(), at first " +
         "aNumber is " + aNumber);
      aNumber = 862;
      System.out.println("In secondMethod(), after an assigment " +
         "aNumber is " + aNumber);
   }       
   }