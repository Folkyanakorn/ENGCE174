package Lab2_1;

import java.util.Scanner;

public class Lab2_1_1 {
    
    public static void main(String[] args) {
        
        // 1. สร้าง Object Scanner 
        Scanner scanner = new Scanner(System.in);
        
        // 2. อ่านรหัสนักศึกษา (บรรทัดแรก) โดยไม่มี Prompt
        String inputId = scanner.nextLine();
        
        // 3. อ่านชื่อ-นามสกุล (บรรทัดที่สอง) โดยไม่มี Prompt
        String inputName = scanner.nextLine();
        
        // 4. สร้าง Object จากคลาส Lab2_1_2 
        Lab2_1_2 student1 = new Lab2_1_2(inputId, inputName);
        
        // 5. แสดงผลลัพธ์ (รหัสและชื่อ) โดยไม่มีข้อความนำหน้า
        System.out.println(student1.studentId);
        System.out.println(student1.name);
        
        // 6. ปิด Scanner
        scanner.close(); 
    }
}