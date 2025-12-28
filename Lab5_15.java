package Lab5_15;

import java.util.Scanner;

class Rentalvehicle {
    protected String model;
    protected double rentalRate;

    public Rentalvehicle(String model, double rentalRate) {
        this.model = model;
        this.rentalRate = rentalRate;
    }

    public double calculateFee() {
        return rentalRate;
    }
}

class Car extends Rentalvehicle {
    public Car(String model, double rentalRate) {
        super(model, rentalRate);
    }

    @Override
    public double calculateFee() {
        return rentalRate + 100.0;
    }
}

class Motorcycle extends Rentalvehicle {
    public Motorcycle(String model, double rentalRate) {
        super(model, rentalRate);
    }

    @Override
    public double calculateFee() {
        return rentalRate * 1.10;
    }
}

public class Lab5_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String carModel = sc.next();
        double carRate = sc.nextDouble();

        String motoModel = sc.next();
        double motoRate = sc.nextDouble();

        Rentalvehicle car = new Car(carModel, carRate);
        Rentalvehicle moto = new Motorcycle(motoModel, motoRate);

        Rentalvehicle[] vehicles = new Rentalvehicle[2];
        vehicles[0] = car;
        vehicles[1] = moto;

        double totalRentalFee = 0;
        for (Rentalvehicle v : vehicles) {
            totalRentalFee += v.calculateFee();
        }

        System.out.println(totalRentalFee);

        sc.close();
    }
}