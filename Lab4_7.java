package Lab4_7;

import java.util.Scanner;

class Counter {
    private static int count = 0;

    public Counter() {
        count++;
    }

    public static int getCount() {
        return count;
    }
}

public class Lab4_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            
            for (int i = 0; i < n; i++) {
                new Counter();
            }
            
            System.out.println("Total Objects: " + Counter.getCount());
        }
        
        sc.close();
    }
}