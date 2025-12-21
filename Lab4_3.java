package Lab4_3;

import java.util.Scanner;

// คลาส Player สำหรับจำลองตัวละครในเกม
class Player {
    private String username;
    private int level;

    // 1. Default Constructor: กำหนดค่าเริ่มต้นเป็น Guest และ Level 1
    public Player() {
        this.username = "Guest";
        this.level = 1;
    }

    // 2. Constructor แบบรับค่า: กำหนดค่าตามที่ส่งมา
    public Player(String username, int level) {
        this.username = username;
        this.level = level;
    }

    // เมธอดแสดงผลในรูปแบบ User: [username], Level: [level]
    public void displayProfile() {
        System.out.println("User: " + username + ", Level: " + level);
    }
}

// คลาสหลัก Lab4_3
public class Lab4_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // รับค่า "โหมด" (1 หรือ 2)
        if (sc.hasNextInt()) {
            int mode = sc.nextInt();
            sc.nextLine(); // ล้าง buffer

            if (mode == 1) {
                // โหมด 1: ใช้ Default Constructor (ไม่รับค่าเพิ่ม)
                Player p1 = new Player();
                p1.displayProfile();
            } 
            else if (mode == 2) {
                // โหมด 2: รับค่า username และ level
                String username = sc.nextLine();
                if (sc.hasNextInt()) {
                    int level = sc.nextInt();
                    Player p2 = new Player(username, level);
                    p2.displayProfile();
                }
            }
        }
        
        sc.close();
    }
}