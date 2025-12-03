package Lab2_1;
import java.util.Scanner;
public class Lab2_1_1 {
    public static void main(String[] args) {      
        Scanner scanner = new Scanner(System.in);
        String inputId = scanner.nextLine();
        String inputName = scanner.nextLine();
        Lab2_1_2 student1 = new Lab2_1_2(inputId, inputName); 
        System.out.println(student1.studentId);
        System.out.println(student1.name);

        scanner.close(); 

    }

}
class Lab2_1_2 {

    String studentId;

    String name;
    public Lab2_1_2(String id, String studentName) {
        this.studentId = id;
        this.name = studentName;

    }

}