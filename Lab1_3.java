package Lab1_3;

import java.util.Scanner;

public class Lab1_3 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            int num = sc.nextInt();   // รับค่าจำนวนเต็ม 1 จำนวน

            if (num % 2 == 0) {
                System.out.println("Even");  // ถ้าหาร 2 ลงตัว → เลขคู่
            } else {
                System.out.println("Odd");   // ถ้าไม่ลงตัว → เลขคี่
            }
        }
    }
}
