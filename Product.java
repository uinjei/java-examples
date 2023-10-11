import java.util.Scanner;

public class Product {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
System.out.print("Enter Product name: ");
String productName = scanner.nextLine();
System.out.print("Enter product price ");
double productPrice = scanner.nextDouble();
System.out.print("Enter quantity ");
double quantity = scanner.nextDouble();
System.out.print("Enter discount %");
double discountPercent = scanner.nextDouble();

double subTotal = productPrice * quantity;
double discountDecimal = discountPercent / 100;
double discountAmount = subTotal * discountDecimal;
double total = subTotal - discountAmount; 
    
    scanner.close();
    System.out.println("Subtotal: " + subTotal);
    System.out.println("Discount: " + (int)discountPercent);

    System.out.println("Your product: " + productName +", total: " + total);
  }
}
  