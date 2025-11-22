package Lab1_14;
import java.util.Scanner;
public class Lab1_14 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int R = sc.nextInt();
            int C = sc.nextInt();
            sc.nextLine();
            char[][] map = new char[R][C];
            for (int i = 0; i < R; i++) {
                String line = sc.nextLine();
                String[] tokens = line.split(" ");
                for (int j = 0; j < C; j++) {
                    map[i][j] = tokens[j].charAt(0);
                }
            }
            int targetR = sc.nextInt();
            int targetC = sc.nextInt();
            if (map[targetR][targetC] == '*') {
                System.out.println("Mine");
            } else {
                int count = 0;
                int[] dr = {-1, -1, -1, 0, 0, 1, 1, 1};
                int[] dc = {-1, 0, 1, -1, 1, -1, 0, 1};
                for (int k = 0; k < 8; k++) {
                    int nr = targetR + dr[k];
                    int nc = targetC + dc[k];

                    if (nr >= 0 && nr < R && nc >= 0 && nc < C) {
                        if (map[nr][nc] == '*') {
                            count++;
                        }
                    }
                }
                System.out.println(count);
            }
        }
    }
}