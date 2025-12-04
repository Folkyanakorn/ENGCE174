package Lab2_2;
import java.util.Scanner;
public class Lab2_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputId = scanner.nextLine();
        String inputName = scanner.nextLine(); 
        Student newStudent = new Student();
        newStudent.studentId = inputId;
        newStudent.name = inputName;
        scanner.close();
        newStudent.displayInfo();
    }
}

class Student {
    String studentId;
    String name;

    public void displayInfo() {
        System.out.println(studentId);
        System.out.println(name);
    }
}