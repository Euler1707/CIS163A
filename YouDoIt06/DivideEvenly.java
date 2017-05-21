public class DivideEvenly
{
   public static void main(String[] args)
   {
      final int LIMIT = 100;
      int var;
      int number;
      
      for(number = 1 ; number <= LIMIT;++number)  
      {  System.out.print(LIMIT + " is evenly divided by ");
      
         for(var = 1; var <= LIMIT; ++var)
         {
             if(LIMIT % var == 0){
           
               System.out.print(var + " ");
               System.out.print("");            
                
             }
             
         }      
      
      }
   }
}           