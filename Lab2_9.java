package Lab2_9;

import java.util.Scanner;

public class Lab2_9 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine(); 
        String street = scanner.nextLine(); 
        String city = scanner.nextLine(); 
        String zipCode = scanner.nextLine(); 
        
        scanner.close(); 
        Address addressObj = new Address(street, city, zipCode);
        Student student = new Student(name, addressObj);
        student.displayProfile();
    }
}
class Address {
    String street;
    String city;
    String zipCode;
    public Address(String street, String city, String zipCode) {
        this.street = street;
        this.city = city;
        this.zipCode = zipCode;
    }
    public String getFullAddress() {
        return this.street + ", " + this.city + ", " + this.zipCode;
    }
}
class Student {
    String name;
    Address address;
    public Student(String name, Address address) {
        this.name = name;
        this.address = address;
    }
    public void displayProfile() {
        System.out.println("Name: " + this.name);
        System.out.println("Address: " + this.address.getFullAddress());
    }
}