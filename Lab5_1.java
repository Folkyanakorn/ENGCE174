package Lab5_1;

import java.util.Scanner;

class Animal {
    protected String name;
    protected int age;

    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

class Dog extends Animal {
    public void makeSound() {
        System.out.println("Woof! Woof!");
    }
}

public class Lab5_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String inputName = sc.nextLine();
        int inputAge = sc.nextInt();

        Dog myDog = new Dog();

        myDog.name = inputName;
        myDog.age = inputAge;

        myDog.makeSound();

        myDog.displayInfo();
        
        sc.close();
    }
}