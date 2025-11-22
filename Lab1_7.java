package Lab1_7;

import java.util.Scanner;

public class Lab1_7 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt();
            int sum = 0;
            for (int i = 0; i < N; i++) {
                int num = sc.nextInt();
                sum += num;
            }
            System.out.println(sum);
        }
    }
}
