package Lab3_7;

import java.util.Scanner;

public class Lab3_7 {

    public static class Employee {
       
        private String employeeId; 
        private String department; 

        public Employee(String employeeId, String department) {
            this.employeeId = employeeId;
            this.department = department;
        }
        public String getEmployeeId() {
            return this.employeeId;
        }
        public String getDepartment() {
            return this.department;
        }
        public void setDepartment(String newDepartment) {
            this.department = newDepartment;
        }
    }
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        String employeeId = scanner.nextLine();
        String initialDepartment = scanner.nextLine();
        String newDepartment = scanner.nextLine(); 
        
        Employee employee = new Employee(employeeId, initialDepartment);

        employee.setDepartment(newDepartment);

        System.out.println(employee.getEmployeeId());
        System.out.println(employee.getDepartment()); 
        
        scanner.close();
    }
}