package Lab1_9;
import java.util.Scanner;
public class Lab1_9 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt();
            int[] arr = new int[N];
            double sum = 0;
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
                sum += arr[i];
            }
            double average = sum / N;
            System.out.println(average);
        }
    }
}