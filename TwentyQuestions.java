import java.util.*;

public class TwentyQuestions {
  public static void main(String[] args) {

    System.out.println("\nWelcome to The 20 Questions Game");
    System.out.println("\nChoose something from the list");
    System.out.println("\nBear\n" +
    "Cat\n" +
    "Car\n" +
    "Train\n" +
    "Donut\n" +

    System.out.println("\nCan it be found in nature?");
   Scanner s = new Scanner(System.in);
   String r = s.next();
   if (r.equals("yes")) {
     System.out.println("Is it smaller than a child?");
   }
   else {
     System.out.println("Is it edible?");
   }
 }
}
