public class ShortCircuitTestOr
{
   public static void main(String[] args)
   {
      if (trueMethod() && falseMethod()){
         System.out.println("Both are true");
      }
      else{
         System.out.println("Both are not true");
      }   
   
   }
   public static boolean trueMethod()
   {
      System.out.println("True method");
      return true;
   }
   public static boolean falseMethod()
   {
      System.out.println("False method");
      return false;
   }
   
}

// Chicken 1 tray
// Fish idk how much
// Juices 3
// Drinkable Yogurt 
// Cereal
// Bread
