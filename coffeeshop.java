import java.util.*;
public class Coffeeshop {
  public static void main(String[] args) {
    System.out.println("Welcome to the Coffee Shop");

    System.out.println("Hey what is your name?");
    Scanner inp = new Scanner(System.in);
    String name = inp.next();

    System.out.println("What would you like to order?" + "\n1. Mocha \n2. Iced Coffee \n3. Frappuccino ");
    Scanner inp2 = new Scanner(System.in);
    String order = inp2.next();

    if (order.equals("3")){
      order = "Frappuccino";
}
  if (order.equals("2")){
    order = "Iced Coffee";
}
    if (order.equals("1")){
      order = "Mocha";
    }
    System.out.println("Hey, " + name + ", you ordered a " + order );
  }
}
