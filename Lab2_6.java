package Lab2_6;

import java.util.Scanner;

public class Lab2_6 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String ownerName = scanner.nextLine();
        double initialBalance = scanner.nextDouble();
        double depositAmount = scanner.nextDouble();
        scanner.nextLine(); 
        scanner.close(); 
        BankAccount account = new BankAccount(ownerName, initialBalance);
        account.deposit(depositAmount);
        account.displaySummary();
    }
}
class BankAccount {
    String ownerName;
    double balance;
    public BankAccount(String ownerName, double initialBalance) {
        this.ownerName = ownerName;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        this.balance = this.balance + amount;
    }
    public void displaySummary() {
        System.out.println("Owner: " + this.ownerName);
        System.out.println("Balance: " + this.balance);
    }
}