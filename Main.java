//For loop

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
      System.out.println("Enter the total items: ");
      Scanner scanner = new Scanner(System.in);
      int quantity = scanner.nextInt();
    
      double total = 0;

      for(int i=0; i < quantity; i++){
        System.out.println("Enter the price of the item: ");
        double price = scanner.nextDouble();
        total = total + price;
      }
     scanner.close();
     System.out.println("Total price is: " + total);
  }
}