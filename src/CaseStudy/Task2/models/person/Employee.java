package CaseStudy.Task2.models.person;

import CaseStudy.Task2.service.EmployeeService;

import java.util.Scanner;

public class Employee extends Person implements EmployeeService {
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
        System.out.println("----------Chọn Trình Độ------------"+
                "\n1.Trung cấp " +
                "\n2.Cao đẳng" +
                "\n3.Đại học " +
                "\n4.sau đại học");
        do {
            int choose = Integer.parseInt(scanner.nextLine());
            if (choose >= 1 && choose <= 4) {
                switch (choose) {
                    case 1:
                        return "Trung cấp";
                    case 2:
                        return "Cao đẳng";
                    case 3:
                        return "Đại học";
                    case 4:
                        return "Sau Đại học";
                }
                break;
            } else {
                System.out.println("Mời bạn cọn đúng theo yêu cầu: ");
            }
        } while (true);
        return " ";
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getLocation() {
        System.out.println("------------Chọn Vị Trí-----------"+
                "\n1.Lễ tân " +
                "\n2.Phục vụ" +
                "\n3.Chuyên viên" +
                "\n4.Giám sát "+
                "\n5.Quản lí "+
                "\n6.Giám đốc ");
        do {
            int choose = Integer.parseInt(scanner.nextLine());
            if (choose >= 1 && choose <= 6) {
                switch (choose) {
                    case 1:
                        return "Lễ tân";
                    case 2:
                        return "Phục vụ";
                    case 3:
                        return "Chuyên viên";
                    case 4:
                        return "Giám sát";
                    case 5:
                        return "Quản lí";
                    case 6:
                        return "Giám đốc";
                }
                break;
            } else {
                System.out.println("Mời bạn chọn đúng theo yêu cầu: ");
            }
        } while (true);
        return " ";
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

    @Override
    public void add() {

    }

    @Override
    public void display() {

    }

    @Override
    public void delete() {

    }

    @Override
    public void update() {

    }

    @Override
    public void search() {

    }
}
