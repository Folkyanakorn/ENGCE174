package Lab3_12;

import java.util.Scanner;

public class Lab3_12 {

    public static class Employee {

        private String name;
        private double monthlySalary;

        public Employee(String name, double monthlySalary) {
            this.name = name;

            if (monthlySalary > 0) {
                this.monthlySalary = monthlySalary;
            } else {
                this.monthlySalary = 0;
            }
        }


        public String getName() {
            return this.name;
        }

 
        public void giveRaise(double amount) {
            if (amount > 0) {
                this.monthlySalary += amount;
                System.out.println("Raise applied."); 
            } else {
                System.out.println("Invalid amount."); 
            }
        }
        
   
        private double getAnnualSalary() {
            return this.monthlySalary * 12; 
        }

        public double calculateTax(double taxRate) {

            return getAnnualSalary() * taxRate;
        }
    }

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        double monthlySalary = scanner.nextDouble();
        double taxRate = scanner.nextDouble();
        double raiseAmount = scanner.nextDouble();
        
        scanner.close();

        Employee employee = new Employee(name, monthlySalary);

        double taxBefore = employee.calculateTax(taxRate);
        System.out.println("Tax (Before): " + taxBefore);


        employee.giveRaise(raiseAmount);

        double taxAfter = employee.calculateTax(taxRate);
        System.out.println("Tax (After): " + taxAfter);
    }
}