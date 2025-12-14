package Lab3_14;

import java.util.Scanner;

public class Lab3_14 {
    public static class BankAccount {
        private double balance;
        private static int totalTransactionCount = 0; 
        public BankAccount(double initialDeposit) {
            if (initialDeposit > 0) {
                this.balance = initialDeposit;
            } else {
                this.balance = 0; 
            }
            System.out.println("Account created."); 
        }
        public void deposit(double amount) {
            if (amount > 0) {
                this.balance += amount;
                totalTransactionCount++; 
                System.out.println("Deposit successful.");
            } else {
                System.out.println("Invalid amount."); 
            }
        }
        public void withdraw(double amount) {
            if (amount <= 0) {
                System.out.println("Invalid amount."); 
            } else if (amount > this.balance) {
                System.out.println("Insufficient funds."); 
            } else {
                this.balance -= amount;
                totalTransactionCount++; 
                System.out.println("Withdrawal successful.");
            }
        }

        public double getBalance() {
            return this.balance; 
        }

        public static int getTotalTransactionCount() {
            return totalTransactionCount; 
        }
    }
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        BankAccount myAccount = null; 
        int n = scanner.nextInt(); 
        scanner.nextLine(); 

        for (int i = 0; i < n; i++) {
            String command = scanner.nextLine(); 
            if (command.equalsIgnoreCase("CREATE")) {
                double initialDeposit = scanner.nextDouble();
                myAccount = new BankAccount(initialDeposit); 
            } 
            else if (command.equalsIgnoreCase("DEPOSIT") || command.equalsIgnoreCase("WITHDRAW")) {
                double amount = scanner.nextDouble();
                
                if (myAccount == null) { 
                    System.out.println("No account exists.");
                } else if (command.equalsIgnoreCase("DEPOSIT")) {
                    myAccount.deposit(amount);
                } else { 
                    myAccount.withdraw(amount);
                }
            }
            else if (command.equalsIgnoreCase("STATUS")) {
                if (myAccount == null) {
                    System.out.println("No account exists."); 
                } else {
                    System.out.println("Balance: " + myAccount.getBalance());
                }
            }
            else if (command.equalsIgnoreCase("GLOBAL_STATUS")) {
                System.out.println("Total Transactions: " + BankAccount.getTotalTransactionCount());
            }

            if (command.equalsIgnoreCase("CREATE") || command.equalsIgnoreCase("DEPOSIT") || command.equalsIgnoreCase("WITHDRAW")) {
                if (scanner.hasNextLine()) {
                    scanner.nextLine(); 
                }
            }
        }
        
        scanner.close();
    }
}