package Lab3_13;

import java.util.Scanner;

public class Lab3_13 {
    public static class LicenseManager {
        private static int maxLicenses = 10;
        private static int usedLicenses = 0;

        public static void setMax(int max) {
            if (max < 1) { 
                System.out.println("Invalid max value.");
            } else if (max < usedLicenses) { 
                System.out.println("Cannot set max lower than current usage.");
            } else {
                maxLicenses = max;
                System.out.println("Max licenses set to " + max);
            }
        }
        public static boolean checkOut() {

            if (usedLicenses < maxLicenses) { 
                usedLicenses++;
                System.out.println("Checkout successful.");
                return true;
            } else { 
                System.out.println("Checkout failed: No licenses available.");
                return false;
            }
        }
        public static void checkIn() {

            if (usedLicenses > 0) { 
                usedLicenses--;
                System.out.println("Check-in successful.");
            } else { 
                System.out.println("Nothing to check-in.");
            }
        }
        public static void displayStatus() {
            System.out.println("Used: " + usedLicenses);
            System.out.println("Available: " + (maxLicenses - usedLicenses));
        }
    }
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt(); 
        scanner.nextLine(); 
        for (int i = 0; i < n; i++) {
            String command = scanner.nextLine(); 

            if (command.equalsIgnoreCase("SET")) {

                int max = scanner.nextInt();
                LicenseManager.setMax(max);
            } else if (command.equalsIgnoreCase("CHECKOUT")) {

                LicenseManager.checkOut(); 
            } else if (command.equalsIgnoreCase("CHECKIN")) {
 
                LicenseManager.checkIn();
            } else if (command.equalsIgnoreCase("STATUS")) {

                LicenseManager.displayStatus();
            }
            
            if (command.equalsIgnoreCase("SET") && scanner.hasNextLine()) {
                 scanner.nextLine();
            }
        }
        
        scanner.close();
    }
}