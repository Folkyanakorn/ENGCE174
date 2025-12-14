package Lab3_11;

import java.util.Scanner;

public class Lab3_11 {

    public static class SystemConfig {
        
        private static SystemConfig instance; 

        private String serverUrl;
        private int maxConnections;

        private SystemConfig() {

            this.serverUrl = "default_server.com";
            this.maxConnections = 10;
        }

        public static SystemConfig getInstance() {

            if (instance == null) {
                instance = new SystemConfig(); 
            }
            return instance; 
        }

        public String getServerUrl() {
            return serverUrl;
        }

        public void setServerUrl(String url) {
            this.serverUrl = url;
        }

        public int getMaxConnections() {
            return maxConnections;
        }

        public void setMaxConnections(int count) {

            if (count > 0) { 
                this.maxConnections = count;
                System.out.println("Max connections set."); 
            } else {

                System.out.println("Invalid count.");
            }
        }
    }

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
 
        int n = scanner.nextInt(); 
        scanner.nextLine();

        for (int i = 0; i < n; i++) {
            String command = scanner.nextLine(); 

            if (command.equalsIgnoreCase("SET_URL")) {
                String url = scanner.nextLine();

                SystemConfig config = SystemConfig.getInstance(); 
                config.setServerUrl(url); 
            } 

            else if (command.equalsIgnoreCase("SET_MAX")) {
                int count = scanner.nextInt();

                SystemConfig config = SystemConfig.getInstance();
                config.setMaxConnections(count);
            } 

            else if (command.equalsIgnoreCase("SHOW")) {

                SystemConfig config = SystemConfig.getInstance();

                System.out.println("URL: " + config.getServerUrl());
                System.out.println("MAX: " + config.getMaxConnections());
            }
            if (command.equalsIgnoreCase("SET_MAX") && scanner.hasNextLine()) {
                 scanner.nextLine();
            }
        }
        
        scanner.close();
    }
}