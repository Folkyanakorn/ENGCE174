package Lab1_10;
import java.util.Scanner;
public class Lab1_10 {

    public static double calculateArea(double width, double height) {
        return width * height;
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            double width = sc.nextDouble();
            double height = sc.nextDouble();
            double area = calculateArea(width, height);
            System.out.println(area);
        }
    }
}