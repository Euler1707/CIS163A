public class DemoNumbers
{
   public static void main(String[] args)
   {
      int first = 3;
      int second = 7;
      
      // this method receives both numbers
      // and adds them together, dispaying
      // the result!
      add(first,second);
      
   }
   
   public static void add(int fir, int sec)
   {// This method receives two arguments
      int total = fir + sec;
      System.out.println(fir + " plus " 
         + sec + " equals " + total);  
   }   
}                                        