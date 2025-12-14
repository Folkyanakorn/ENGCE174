package Lab3_10;

import java.util.Scanner;

public class Lab3_10 {

    public static class SystemLogger {
        private static int currentLogLevel = 1; 

        private static String getLevelName(int level) {
            switch (level) {
                case 1: 
                    return "INFO"; 
                case 2: 
                    return "DEBUG";
                case 3: 
                    return "ERROR"; 
                default:
                    return "UNKNOWN"; 
            }
        }
        
  
        public static void setLogLevel(int newLevel) {

            if (newLevel >= 1 && newLevel <= 3) {
                currentLogLevel = newLevel;
                String levelName = getLevelName(newLevel);
    
                System.out.println("Log level set to " + levelName);
            } else {

                System.out.println("Invalid log level.");
            }
        }

        public static void log(int messageLevel, String message) {

            if (messageLevel >= currentLogLevel) {
                String levelName = getLevelName(messageLevel);

                System.out.println("[" + levelName + "]: " + message);
            }

        }
    }

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt(); 
        scanner.nextLine(); 


        for (int i = 0; i < n; i++) {

            String command = scanner.nextLine(); 

            if (command.equalsIgnoreCase("SET")) {
   
                int newLevel = scanner.nextInt();
                SystemLogger.setLogLevel(newLevel);
            } else if (command.equalsIgnoreCase("LOG")) {
      
                int messageLevel = scanner.nextInt();
                scanner.nextLine();
                String message = scanner.nextLine(); 
                SystemLogger.log(messageLevel, message);
            }
            
            if (scanner.hasNextLine() && i < n - 1) {
                scanner.nextLine();
            }
        }

        scanner.close();
    }
}