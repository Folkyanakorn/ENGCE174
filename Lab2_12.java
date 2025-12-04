package Lab2_12;

import java.util.Scanner;

public class Lab2_12 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String courseId = scanner.nextLine(); 
        String courseName = scanner.nextLine(); 
        String studentName = scanner.nextLine(); 
        
        scanner.close(); 
        Course enrolledCourse = new Course(courseId, courseName);
        Student student = new Student(studentName, enrolledCourse);
        student.displayEnrollment();
    }
}
class Course { 
    String courseId;
    String courseName;
    public Course(String courseId, String courseName) {
        this.courseId = courseId;
        this.courseName = courseName;
    }
    public String getCourseInfo() {
        return this.courseId + ": " + this.courseName;
    }
}
class Student { 
    String studentName;
    Course enrolledCourse; 

    public Student(String studentName, Course enrolledCourse) {
        this.studentName = studentName;
        this.enrolledCourse = enrolledCourse;
    }

    public void displayEnrollment() {
        System.out.println("Student: " + this.studentName);
        System.out.println("Enrolled in: " + this.enrolledCourse.getCourseInfo());
    }
}