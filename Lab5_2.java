package Lab5_2;

import java.util.Scanner;

class Animal {
    protected String name;
    protected int age;

    public void makeSound() {
        System.out.println("I am an animal.");
    }

    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow!");
    }
}

public class Lab5_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String inputName = sc.nextLine();
        int inputAge = sc.nextInt();

        Cat myCat = new Cat();
        myCat.name = inputName;
        myCat.age = inputAge;

        myCat.displayInfo();
        myCat.makeSound();
        
        sc.close();
    }
}