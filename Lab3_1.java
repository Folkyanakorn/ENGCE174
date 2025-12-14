package Lab3_1;

import java.util.Scanner;

public class Lab3_1 { 

    public static class User {
        private String username; 
        
        public User(String username) {
            this.username = username;
        }

        public String getUsername() {
            return this.username;
        }
    }

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        String inputUsername = scanner.nextLine(); 
        
        User user = new User(inputUsername);
        
        System.out.println(user.getUsername());
        
        scanner.close();
    }
}