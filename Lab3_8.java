package Lab3_8;

import java.util.Scanner;

public class Lab3_8 {

    public static class InventoryItem {
        
        private String productName;
        private int stock; 
        public InventoryItem(String productName, int initialStock) {
            this.productName = productName;
            if (initialStock >= 0) {
                this.stock = initialStock;
            } else {
                this.stock = 0;
            }
        }

        public String getProductName() {
            return this.productName;
        }

        public int getStock() {
            return this.stock;
        }
        
        public void addStock(int amount) {
            if (amount > 0) {
                this.stock += amount;
                System.out.println("Stock added.");
            } else {
                System.out.println("Invalid amount.");
            }
        }
        
        public void sellStock(int amount) {
            if (amount > 0 && amount <= this.stock) {
                this.stock -= amount;
                System.out.println("Sale successful.");
            } else if (amount > this.stock) {
                System.out.println("Not enough stock.");
            } else { // amount <= 0
                System.out.println("Invalid amount.");
            }
        }
    }

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        String productName = scanner.nextLine();
        int initialStock = scanner.nextInt();
        
        int n = scanner.nextInt(); 
        scanner.nextLine(); 
        InventoryItem item = new InventoryItem(productName, initialStock);
        for (int i = 0; i < n; i++) {
            String command = scanner.nextLine(); 
            int amount = scanner.nextInt();  
            
            if (scanner.hasNextLine()) {
                scanner.nextLine();
            }
            
            if (command.equalsIgnoreCase("ADD")) {
                item.addStock(amount);
            } else if (command.equalsIgnoreCase("SELL")) {
                item.sellStock(amount);
            }
        }
        System.out.println("Final Stock: " + item.getStock());
        
        scanner.close();
    }
}