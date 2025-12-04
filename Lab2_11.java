package Lab2_11;

import java.util.Scanner;

public class Lab2_11 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String model = scanner.nextLine(); 
        int initialYear = scanner.nextInt(); 
        int newYear = scanner.nextInt();
        scanner.nextLine();
        scanner.close(); 
        Car car = new Car(model, initialYear);
        car.setYear(newYear);
        System.out.println("Model: " + car.getModel());
        System.out.println("Year: " + car.getYear());
    }
}
class Car { 
    private String model;
    private int year;
    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }
    public String getModel() {
        return this.model;
    }
    public int getYear() {
        return this.year;
    }
    public void setYear(int newYear) {
        this.year = newYear;
    }
}