import java.util.Scanner;
public class BabyNameComparison
{
   public static void main(String[] args)
   {
      String Babyname1;
      String Babyname2;
      String Babyname3;
      
      Scanner keyboard = new Scanner(System.in);
      
      System.out.println("Name Comparison Display Program: \n");
      System.out.println("The application prompts the user for three\n"+ 
      "first names and concatenates them in every possible\n" +
      "two-name combination so that new parents can easily\n" +
      "compare them to find the most pleasing baby name.\n");

      System.out.println("**NAME ENTRY**\n");      
      System.out.println("Enter the first name: ");
      Babyname1 = keyboard.nextLine();
      
      System.out.println("Enter the second name: ");
      Babyname2 = keyboard.nextLine();
      
      System.out.println("Enter the third name: ");
      Babyname3 = keyboard.nextLine();
      
      
      System.out.println("\n**NAME DISPLAY**\n");
      System.out.println(Babyname1 +" "+ Babyname2 + "\n");
      
      System.out.println(Babyname1 +" "+ Babyname3 + "\n");
      
      System.out.println(Babyname2 +" "+ Babyname1 + "\n");
      
      System.out.println(Babyname2 +" "+ Babyname3 + "\n");
      
      System.out.println(Babyname3 +" "+ Babyname1 + "\n");
      
      System.out.println(Babyname3 +" "+ Babyname2 + "\n");
     
      
   }
}   