package Lab2_3;
import java.util.Scanner;
public class Lab2_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt(); 
        scanner.nextLine();
        for (int i = 0; i < N; i++) {
            String inputId = scanner.nextLine(); 
            String inputName = scanner.nextLine();
            Student newStudent = new Student(inputId, inputName); 
        }
        scanner.close(); 
        System.out.println(Student.studentCount); 
    }
}

class Student {
    String studentId;
    String name;
    public static int studentCount = 0; 
    public Student(String studentId, String name) {
        this.studentId = studentId;
        this.name = name;
        studentCount++; 
    }
}