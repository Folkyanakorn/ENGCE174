package Lab1_12;
import java.util.Scanner;
public class Lab1_12 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt();
            int[] productIDs = new int[N];
            int[] stockQty = new int[N];
            for (int i = 0; i < N; i++) {
                productIDs[i] = sc.nextInt();
                stockQty[i] = sc.nextInt();
            }
            int searchID = sc.nextInt();
            boolean found = false;
            for (int i = 0; i < N; i++) {
                if (productIDs[i] == searchID) {
                    System.out.println(stockQty[i]);
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println("Product " + searchID + " not found");
            }
        }
    }
}