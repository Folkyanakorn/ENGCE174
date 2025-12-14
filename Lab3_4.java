package Lab3_4;

import java.util.Scanner;

public class Lab3_4 {
    public static class Product {
        private String name; 
        private static int productCount = 0; 
        public Product(String name) {
            this.name = name;
            Product.productCount++; 
        }
        public String getName() {
            return this.name;
        }
        public static int getProductCount() {
            return productCount;
        }
    }
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine(); 
        for (int i = 0; i < n; i++) {
            String productName = scanner.nextLine(); 
            Product product = new Product(productName);
        }
        System.out.println(Product.getProductCount()); 
        
        scanner.close();
    }
}