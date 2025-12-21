package Lab4_2;

import java.util.Scanner;

class Product {
    private String name;
    private double price;

    public Product(String name) {
        this(name, 0.0); 
    }
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void displayInfo() {
        System.out.println("Product: " + name + ", Price: " + price);
    }
}

public class Lab4_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        if (sc.hasNextInt()) {
            int mode = sc.nextInt();
            sc.nextLine();

            if (mode == 1) {
                String name = sc.nextLine();
                Product p1 = new Product(name);
                p1.displayInfo();
            } 
            else if (mode == 2) {
                String name = sc.nextLine();
                if (sc.hasNextDouble()) {
                    double price = sc.nextDouble();
                    Product p2 = new Product(name, price);
                    p2.displayInfo();
                }
            }
        }
        
        sc.close();
    }
}