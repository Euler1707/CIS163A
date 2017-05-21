
// I do not understand why this is not working...
//Please revisit this method.
public class methodWithNestedBlocks()
{


public static void methodWithNestedBlocks()
{
   int aNumber = 10;
   
   System.out.println( aNumber);
   {
   
      int anotherNumber = 512;
      System.out.println("In inner block,aNumber  is " + aNumber +
        " and anotherNumber is " + anotherNumber);
   }
   
   System.out.println(aNumber);
}
}
      