package Lab2_5;
import java.util.Scanner;
public class Lab2_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double width = scanner.nextDouble();
        double height = scanner.nextDouble();
        scanner.nextLine(); 
        scanner.close();
        Rectangle rect = new Rectangle(width, height);
        System.out.println(rect.getArea());
        System.out.println(rect.getPerimeter());
    }
}
class Rectangle {
    double width;
    double height;
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    public double getArea() {
        return width * height;
    }
    public double getPerimeter() {
        return 2 * (width + height);
    }
}