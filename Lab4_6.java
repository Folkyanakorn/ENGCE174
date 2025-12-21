package Lab4_6;

import java.util.Scanner;

class Point {
    private final int x;
    private final int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Point move(int dx, int dy) {
        return new Point(this.x + dx, this.y + dy);
    }

    public void displayInfo() {
        System.out.println("(" + x + ", " + y + ")");
    }
}

public class Lab4_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (sc.hasNextInt()) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int dx = sc.nextInt();
            int dy = sc.nextInt();

            Point p1 = new Point(x, y);
            Point p2 = p1.move(dx, dy);
            Point p3 = p2.move(dx, dy);

            p1.displayInfo();
            p2.displayInfo();
            p3.displayInfo();
        }
        
        sc.close();
    }
}