public class Sandwich
{
   //Private data fields common on every 
   //Iteration of Sandwich
   private String mainIngredient;
   private String breadType;
   
   private double price;
   
   
   public Sandwich()
   { // Define a custom constructor in order
     // to show constructor initialization
     // This answers the Modified 11a
      mainIngredient = "turkey";
      breadType = "rye";
      price = 5.99;
   }
   public void setMainIngredient(String mainIng)
   { // Sets the main ingredient
      mainIngredient = mainIng;
   }
   public void setBreadType(String bread)
   { // Sets bread type
      breadType = bread;
   }
   public void setPrice(double pr)
   {  // Sets price
      price = pr;
   }
   public String getMainIngredient()
   {  // Gets main ingredient
      return mainIngredient;
   }
   public String getBreadType()
   {  // Gets main bread type
      return breadType;
   }
   public double getPrice()
   {  // Gets price
      return price;
   }

}