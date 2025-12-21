package Lab4_1;

import java.util.Scanner;

// คลาส Book สำหรับจำลองข้อมูลหนังสือ
class Book {
    private String title;
    private String author;

    // 1. Constructor แบบรับเฉพาะ "ชื่อเรื่อง" และกำหนดผู้แต่งเป็น "Unknown"
    public Book(String title) {
        this.title = title;
        this.author = "Unknown";
    }

    // 2. Constructor แบบรับทั้ง "ชื่อเรื่อง" และ "ผู้แต่ง"
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // เมธอดสำหรับแสดงผลข้อมูลในรูปแบบ Title: [title], Author: [author]
    public void displayInfo() {
        System.out.println("Title: " + title + ", Author: " + author);
    }
}

// คลาสหลักสำหรับรันโปรแกรม
public class Lab4_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // รับค่า "โหมด" (1 หรือ 2)
        if (sc.hasNextInt()) {
            int mode = sc.nextInt();
            sc.nextLine(); // ล้าง buffer หลังจากรับค่าตัวเลข

            if (mode == 1) {
                // โหมด 1: รับเฉพาะชื่อเรื่อง
                String title = sc.nextLine();
                Book book1 = new Book(title);
                book1.displayInfo();
            } 
            else if (mode == 2) {
                // โหมด 2: รับทั้งชื่อเรื่องและผู้แต่ง
                String title = sc.nextLine();
                String author = sc.nextLine();
                Book book2 = new Book(title, author);
                book2.displayInfo();
            }
        }
        
        sc.close();
    }
}