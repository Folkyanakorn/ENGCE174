package Lab1_13;
import java.util.Scanner;
public class Lab1_13 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int R = sc.nextInt();
            int C = sc.nextInt();
            int[][] grid = new int[R][C];
            int onlineCount = 0;
            for (int i = 0; i < R; i++) {
                for (int j = 0; j < C; j++) {
                    grid[i][j] = sc.nextInt();
                    if (grid[i][j] == 1) {
                        onlineCount++;
                    }
                }
            }
            System.out.println(onlineCount);
        }
    }
}
