package Lab3_6;

import java.util.Scanner;

public class Lab3_6 {

    /**
     * คลาส BankAccount: จัดการยอดเงินฝาก-ถอน และการตรวจสอบเงื่อนไข
     */
    public static class BankAccount {
        
        private double balance; 

        /**
         * Constructor: กำหนดค่าเริ่มต้น พร้อมตรวจสอบ initialBalance
         */
        public BankAccount(double initialBalance) {
            // ถ้า initialBalance มากกว่าหรือเท่ากับ 0 ให้กำหนดค่าตามนั้น
            if (initialBalance >= 0) {
                this.balance = initialBalance;
            } else {
                // ถ้า initialBalance ติดลบ กำหนดให้ยอดคงเหลือเป็น 0.0
                this.balance = 0.0;
            }
        }

        public double getBalance() {
            return this.balance;
        }
        
        /**
         * Deposit Method: ฝากเงิน พร้อมตรวจสอบเงื่อนไข
         */
        public void deposit(double amount) {
            if (amount > 0) {
                this.balance += amount; 
                System.out.println("Deposit successful.");
            } else {
                System.out.println("Invalid deposit amount.");
            }
        }
        
        /**
         * Withdrawal Method: ถอนเงิน พร้อมตรวจสอบเงื่อนไข
         */
        public void withdraw(double amount) {
            // เงื่อนไข 1: ถอนได้เมื่อ amount > 0 และ amount ไม่เกินยอดคงเหลือ
            if (amount > 0 && amount <= this.balance) {
                this.balance -= amount; 
                System.out.println("Withdrawal successful.");
            } 
            // เงื่อนไข 2: เงินไม่พอ
            else if (amount > this.balance) {
                System.out.println("Insufficient funds.");
            } 
            // เงื่อนไข 3: amount <= 0
            else { 
                System.out.println("Invalid withdrawal amount.");
            }
        }
    }

    /**
     * Main Method: รับ Input 3 ค่าให้ครบก่อนดำเนินการทุกอย่าง
     */
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        // 1. รับค่า Input ทั้ง 3 ค่าก่อน:
        double initialBalance = scanner.nextDouble();
        double depositAmount = scanner.nextDouble();
        double withdrawAmount = scanner.nextDouble();
        
        // ******* เพิ่มบรรทัดนี้เพื่อเคลียร์ buffer ก่อนเริ่มแสดงผล *******
        scanner.nextLine(); 
        
        // 2. สร้าง Object BankAccount
        BankAccount account = new BankAccount(initialBalance);

        // 3. เริ่มดำเนินการและแสดง Output
        account.deposit(depositAmount);
        account.withdraw(withdrawAmount);

        // 4. แสดงผลลัพธ์สุดท้าย
        System.out.println("Final Balance: " + account.getBalance());
        
        scanner.close();
    }
}