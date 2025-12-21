package Lab4_10; // บรรทัดนี้ต้องมีและสะกดให้ถูก

import java.util.Scanner;

class TimePeriod {
    private int startHour;
    private int endHour;

    // Default Constructor: เรียกใช้ Main Constructor ด้วยค่า 9 และ 17
    public TimePeriod() {
        this(9, 17);
    }

    // Main Constructor: ตรวจสอบค่า (Validation) และสลับค่า (Swap)
    public TimePeriod(int startHour, int endHour) {
        // Validation 1: ตรวจสอบให้อยู่ในช่วง 0-23
        this.startHour = validate(startHour);
        this.endHour = validate(endHour);

        // Validation 2: ถ้าเริ่มมากกว่าจบ ให้สลับค่ากัน (Swap)
        if (this.startHour > this.endHour) {
            int temp = this.startHour;
            this.startHour = this.endHour;
            this.endHour = temp;
        }
    }

    private int validate(int hour) {
        if (hour < 0) return 0;
        if (hour > 23) return 23;
        return hour;
    }

    public void displayPeriod() {
        // รูปแบบการแสดงผลตามโจทย์: [start]:00 - [end]:00
        System.out.println(this.startHour + ":00 - " + this.endHour + ":00");
    }
}

public class Lab4_10 { // ชื่อคลาสต้องตรงกับชื่อไฟล์และชื่อใน Package
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (!sc.hasNextInt()) return;
        int mode = sc.nextInt();

        if (mode == 1) {
            TimePeriod tp = new TimePeriod();
            tp.displayPeriod();
        } else if (mode == 2) {
            if (sc.hasNextInt()) {
                int start = sc.nextInt();
                if (sc.hasNextInt()) {
                    int end = sc.nextInt();
                    TimePeriod tp = new TimePeriod(start, end);
                    tp.displayPeriod();
                }
            }
        }
        sc.close();
    }
}