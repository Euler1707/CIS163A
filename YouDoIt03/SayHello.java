public class SayHello
{
   public static void main(String[] args)
   {
   sayHi("David");
   sayHi("Janice");
   }

   // The sayHi() method receives the user's name
   // and then tells them hello! :-)
   
   public static void sayHi(String name)// input must be specified
   { // the type it gets, in this case String.
      System.out.println("Hi there, " + name);
   }
}