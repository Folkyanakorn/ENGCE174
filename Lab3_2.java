package Lab3_2;

import java.util.Scanner;

public class Lab3_2 { 

    public static class Player {
        private int score; 
        public Player(int initialScore) {
            this.score = initialScore; 
        }
        public int getScore() {
            return this.score;
        }
        public void setScore(int newScore) {
            this.score = newScore; 
        }
    }
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int initialScore = scanner.nextInt();
        int newScore = scanner.nextInt(); 
        Player player = new Player(initialScore);
        player.setScore(newScore);
        System.out.println(player.getScore()); 
        
        scanner.close();
    }
}