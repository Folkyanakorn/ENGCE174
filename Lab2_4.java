package Lab2_4;
import java.util.Scanner;
public class Lab2_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int midtermScore = scanner.nextInt();
        int finalScore = scanner.nextInt();
        scanner.nextLine(); 
        scanner.close();
        Student student = new Student(name, midtermScore, finalScore);
        student.displaySummary();
    }
}
class Student {
    String name;
    int midtermScore;
    int finalScore;
    public Student(String name, int midtermScore, int finalScore) {
        this.name = name;
        this.midtermScore = midtermScore;
        this.finalScore = finalScore;
    }
    public double calculateAverage() {
        return (midtermScore + finalScore) / 2.0;
    }
    public void displaySummary() {
        double averageScore = calculateAverage();
        String status;
        if (averageScore >= 50.0) {
            status = "Pass";
        } else {
            status = "Fail";
        }
        System.out.println("Name: " + this.name);
        System.out.println("Average Score: " + averageScore); 
        System.out.println("Status: " + status);
    }
}