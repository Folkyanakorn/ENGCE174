package Lab2_10;

import java.util.Scanner;

public class Lab2_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt(); 
        scanner.nextLine(); 
        ShoppingCart cart = new ShoppingCart();
        for (int i = 0; i < N; i++) {
            String productName = scanner.nextLine(); 
            double productPrice = scanner.nextDouble(); 
            scanner.nextLine(); 
            Product product = new Product(productName, productPrice);
            cart.addProduct(product);
        }
        
        scanner.close(); 
        System.out.println(cart.calculateTotalPrice());
    }
}
class Product { 
    String name;
    double price;
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
}
class ShoppingCart { 
    Product[] items; 
    int itemCount; 
    public ShoppingCart() {
        this.items = new Product[10]; 
        this.itemCount = 0; 
    }
    public void addProduct(Product p) {
        this.items[this.itemCount] = p;
        this.itemCount++; 
    }
    public double calculateTotalPrice() {
        double totalPrice = 0.0;
        for (int i = 0; i < this.itemCount; i++) {
            totalPrice += this.items[i].price;
        }
        
        return totalPrice;
    }
}