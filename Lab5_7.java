package Lab5_7;

import java.util.Scanner;

class Employee {
    protected String name;
    protected double baseSalary;

    public Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public double calculatePay() {
        return baseSalary;
    }
}

class SalesEmployee extends Employee {
    protected double commissionRate;

    public SalesEmployee(String name, double baseSalary, double commissionRate) {
        super(name, baseSalary);
        this.commissionRate = commissionRate;
    }

    @Override
    public double calculatePay() {
        return baseSalary + (baseSalary * commissionRate);
    }
}

class Manager extends Employee {
    protected double fixedBonus;

    public Manager(String name, double baseSalary, double fixedBonus) {
        super(name, baseSalary);
        this.fixedBonus = fixedBonus;
    }

    @Override
    public double calculatePay() {
        return baseSalary + fixedBonus;
    }
}

class PayrollProcessor {
    public static void process(Employee e) {
        System.out.println(e.name + " total pay: " + e.calculatePay());
    }
}

public class Lab5_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String sName = sc.nextLine();
        double sSalary = sc.nextDouble();
        double sRate = sc.nextDouble();
        sc.nextLine();

        String mName = sc.nextLine();
        double mSalary = sc.nextDouble();
        double mBonus = sc.nextDouble();

        SalesEmployee sales = new SalesEmployee(sName, sSalary, sRate);
        Manager manager = new Manager(mName, mSalary, mBonus);

        PayrollProcessor.process(sales);
        PayrollProcessor.process(manager);

        sc.close();
    }
}