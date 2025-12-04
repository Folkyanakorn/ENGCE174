package Lab2_7;

import java.util.Scanner;

public class Lab2_7 {   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String ownerName = scanner.nextLine(); 
        double initialBalance = scanner.nextDouble(); 
        double withdrawalAmount1 = scanner.nextDouble(); 
        double withdrawalAmount2 = scanner.nextDouble(); 
        scanner.nextLine(); 
        scanner.close(); 
        BankAccount account = new BankAccount(ownerName, initialBalance);
        account.withdraw(withdrawalAmount1);
        account.withdraw(withdrawalAmount2);
        account.displayBalance();
    }
}
class BankAccount {
    // Attributes
    String ownerName;
    double balance;
    public BankAccount(String ownerName, double initialBalance) {
        this.ownerName = ownerName;
        this.balance = initialBalance;
    }
    public void withdraw(double amount) {
        if (amount <= this.balance) {
            this.balance -= amount;
            System.out.println("Withdrawal successful.");
        } else {
            System.out.println("Insufficient funds.");
        }
    }
    public void displayBalance() {
        System.out.println("Balance: " + this.balance);
    }
}