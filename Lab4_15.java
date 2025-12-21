package Lab4_15;

import java.util.Arrays;
import java.util.Scanner;

class AuditRecord {
    private final String user;
    private final String[] logMessages;
    private static int maxMessages = 3;

    public AuditRecord(String user) {
        this(user, new String[0]); 
    }
    public AuditRecord(String user, String[] logs) {
        this.user = user;
        if (logs.length > maxMessages) {
            this.logMessages = Arrays.copyOfRange(logs, logs.length - maxMessages, logs.length);
        } else {
            this.logMessages = Arrays.copyOf(logs, logs.length);
        }
    }

    public static void setMaxMessages(int max) {
        if (max > 0) {
            maxMessages = max;
            System.out.println("Policy set to " + maxMessages);
        } else {
            System.out.println("Invalid policy.");
        }
    }

    public AuditRecord addMessage(String message) {
        if (logMessages.length < maxMessages) {
            String[] newLogs = Arrays.copyOf(logMessages, logMessages.length + 1);
            newLogs[newLogs.length - 1] = message;
            System.out.println(message + " added.");
            return new AuditRecord(this.user, newLogs); 
        } else {
            System.out.println("Log is full.");
            return this; 
        }
    }

    public void displayLog() {
        System.out.print("User: " + user + ", Logs: " + logMessages.length + " [");
        for (int i = 0; i < logMessages.length; i++) {
            System.out.print(logMessages[i] + (i == logMessages.length - 1 ? "" : ", "));
        }
        System.out.println("]");
    }
}

public class Lab4_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        if (sc.hasNextInt()) {
            int initialMax = sc.nextInt();
            AuditRecord.setMaxMessages(initialMax);
        }
        
        sc.nextLine(); 
        String userName = sc.nextLine();
        
        AuditRecord record = new AuditRecord(userName);

        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            sc.nextLine(); 

            for (int i = 0; i < n; i++) {
                String input = sc.nextLine();
                
                if (input.equals("SET_POLICY")) {
                    int newPolicy = sc.nextInt();
                    sc.nextLine(); 
                    AuditRecord.setMaxMessages(newPolicy);
                } else {
                    record = record.addMessage(input);
                }
            }
        }

        // แสดงผลสุดท้าย
        record.displayLog();
        sc.close();
    }
}