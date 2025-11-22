package Lab1_2;
import java.util.Scanner;
public class Lab1_2 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            double width = sc.nextDouble();
            double height = sc.nextDouble();
            double area = width * height; 
            System.out.println(area);     
        }
    }
}
