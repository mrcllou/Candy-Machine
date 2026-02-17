import java.util.Scanner;

public class candymachine {
   public static void main(String[] args) {
      intro(); 
      Scanner console = new Scanner(System.in);
      double money = collectMoney(console);
      double cost = candy(console);
      result(money, cost);
   }
   
   public static void intro(){
      System.out.println("Welcome to Shoreline's Computer Candy Machine!");
      System.out.println("All candy provided is virtual.");
      System.out.println();
   }
   
   public static double collectMoney(Scanner console) {
      System.out.print("How much money do ya got? > $");
      double money = console.nextDouble();
      System.out.println("$" + money + ", that's all?");
      System.out.println();
      return money;
             
   }
   
   public static double candy(Scanner console) {           
      System.out.println("Well, lemme tell ya what we got here.");
      System.out.println("A $0.65 Twix");
      System.out.println("B $0.50 Chips");
      System.out.println("C $0.75 Nutter Butter");
      System.out.println("D $0.65 Peanut Butter Cup");
      System.out.println("E $0.55 Juicy Fruit Gum");
      System.out.println();
      System.out.print("So, What'll ya have? > ");    
      
      String choice = console.next();
      System.out.println();

       if (choice.equalsIgnoreCase("A")) {
         return 0.65;
       } else if (choice.equalsIgnoreCase("B")) {
         return 0.50;
       } else if (choice.equalsIgnoreCase("C")) {
         return 0.75;
       } else if (choice.equalsIgnoreCase("D")) {
         return 0.65;
       } else {
         return 0.55;
       }
            
   }

   
   public static void result(double money, double cost) {
      if (money >= 0.50){
         double change = (money - cost);    
         System.out.println("Thanks for purchasing candy through us.");
         System.out.println("Please take your candy and your " + change + " change");
       } else {
         System.out.println("You're broke. Take your " + money + " and go elsewhere");
       }
       
    }
      
}  
   
   
  

