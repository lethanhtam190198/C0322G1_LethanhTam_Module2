package CaseStudy.Task2.models.person;

import CaseStudy.Task2.service.EmployeeService;

import java.io.IOException;
import java.util.Scanner;

public class Employee extends Person {
    public static Scanner scanner = new Scanner(System.in);
    private int employeeCode;
    private String level;
    private String location;
    private double salary;


    public Employee() {
    }

    public Employee(int employeeCode, String level, String location, double salary) {
        this.employeeCode = employeeCode;
        this.level = level;
        this.location = location;
        this.salary = salary;
    }

    public Employee(String firstNameAndLastName, int dayOfBirth, String gender, int id, int phoneNumber, String email, int employeeCode, String level, String location, double salary) {
        super(firstNameAndLastName, dayOfBirth, gender, id, phoneNumber, email);
        this.employeeCode = employeeCode;
        this.level = level;
        this.location = location;
        this.salary = salary;
    }

    public int getEmployeeCode() {
        return employeeCode;
    }

    public void setEmployeeCode(int employeeCode) {
        this.employeeCode = employeeCode;
    }

    public String getLevel() {
        System.out.println("----------Chọn Trình Độ------------" +
                "\n1.Trung cấp " +
                "\n2.Cao đẳng" +
                "\n3.Đại học " +
                "\n4.sau đại học");
        boolean isValid;
        do {
            int choose = Integer.parseInt(scanner.nextLine());
            isValid = choose >= 1 && choose <= 4;
            if (isValid) {
                switch (choose) {
                    case 1:
                        level = "Trung cấp";
                        return level;
                    case 2:
                        level = "Cao đẳng";
                        return level;
                    case 3:
                        level = "Đại học";
                        return level;
                    case 4:
                        level = "Sau Đại học";
                        return level;
                }
                break;
            } else {
                System.out.println("Mời bạn cọn đúng theo yêu cầu: ");
            }
        } while (true);
        return "";
    }

    public String getLevel2() {
        return level;

    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getLocation() {
        System.out.println("------------Chọn Vị Trí-----------" +
                "\n1.Lễ tân " +
                "\n2.Phục vụ" +
                "\n3.Chuyên viên" +
                "\n4.Giám sát " +
                "\n5.Quản lí " +
                "\n6.Giám đốc ");
        boolean isValid;
        do {
            int choose = Integer.parseInt(scanner.nextLine());
            isValid = choose >= 1 && choose <= 6;
            if (isValid) {
                switch (choose) {
                    case 1:
                        location = "Lễ tân";
                        return location;
                    case 2:
                        location = "Phục vụ";
                        return location;
                    case 3:
                        location = "Chuyên viên";
                        return location;
                    case 4:
                        location = "Giám sát";
                        return location;
                    case 5:
                        location = "Quản lí";
                        return location;
                    case 6:
                        location = "Giám đốc";
                        return location;
                }
                break;
            } else {
                System.out.println("Mời bạn chọn đúng theo yêu cầu: ");
            }
        } while (true);
        return "";
    }
    public String getLocation2(){
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee=[" +
                super.toString() +
                ",employeeCode=" + employeeCode +
                ", level=" + level +
                ", location='" + location +
                ", salary=" + salary + "]";
    }

}
