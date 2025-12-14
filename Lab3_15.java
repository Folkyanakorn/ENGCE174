package Lab3_15;

import java.util.Scanner;

public class Lab3_15 {

    public static class User {
        
        private String username;
        private int failedAttempts;
        private boolean isLocked;
        
        private static int maxAttempts = 3; 
        
        private static final String CORRECT_PASSWORD = "pass123";

        public User(String username) {
            this.username = username;
            this.failedAttempts = 0;
            this.isLocked = false;
        }
        public static void setPolicy(int max) {
            if (max > 0) { 
                maxAttempts = max;
                System.out.println("Policy updated.");
            } else { 
                System.out.println("Invalid policy.");
            }
        }

        public void login(String password) {
            if (this.isLocked) {
                System.out.println("Account is locked.");
                return;
            }

            if (password.equals(CORRECT_PASSWORD)) {
                this.failedAttempts = 0;
                this.isLocked = false;
                System.out.println("Login successful.");
            } 

            else {
                this.failedAttempts++;
                
                if (this.failedAttempts >= maxAttempts) {
                    this.isLocked = true;
                    System.out.println("Login failed. Account locked.");
                } else {
                    int attemptsLeft = maxAttempts - this.failedAttempts;
                    System.out.println("Login failed. " + attemptsLeft + " attempts left.");
                }
            }
        }

        public String getUsername() { return this.username; }
        public boolean isLocked() { return this.isLocked; }
        public int getFailedAttempts() { return this.failedAttempts; }
    }

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        String username = scanner.nextLine();
        User user1 = new User(username);

        int n = scanner.nextInt(); 
        scanner.nextLine(); 


        for (int i = 0; i < n; i++) {
            String command = scanner.nextLine(); 


            if (command.equalsIgnoreCase("SET_POLICY")) {
                int max = scanner.nextInt();
                User.setPolicy(max);
            } 

            else if (command.equalsIgnoreCase("LOGIN")) {
                String password = scanner.nextLine();
                user1.login(password);
            }
            
      
            if (command.equalsIgnoreCase("SET_POLICY") && scanner.hasNextLine()) {
                 scanner.nextLine();
            }
        }
        
        scanner.close();
    }
}