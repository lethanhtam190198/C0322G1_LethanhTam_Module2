package CaseStudy.Task2.service.impl;

import CaseStudy.Task2.models.person.Employee;
import CaseStudy.Task2.service.EmployeeService;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeServiceImpl extends Employee implements EmployeeService {
    public static ArrayList<Employee> employees = new ArrayList<>();
    public static int count;

    static {
        employees.add(new Employee("tâm", 1998, "nam", 1, 191919191, "tam@gmail.com", 1, "ĐH", "lễ tân", 1500000));
        employees.add(new Employee("hải", 1988, "nam", 2, 12121212, "hai@gmail.com", 2, "ĐH", "giám đốc", 1000000000));
        employees.add(new Employee("đức", 1997, "nam", 3, 333333, "duc@gmail.com", 2, "cd", "bảo vệ", 222222));
        employees.add(new Employee("abc", 1988, "nam", 4, 144444, "abc@gmail.com", 2, "cd", "ảo vệ", 333333));
        count = 5;
    }

    static Scanner scanner = new Scanner(System.in);

    @Override
    public void add() {
        System.out.println("nhập tên:");
        String firstNameAndLastName = scanner.nextLine();
        System.out.println("nhập ngày tháng năm sinh:");
        int dayOfBirth = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập giới tính");
        String gender = scanner.nextLine();
        //System.out.println("nhập ID:");
        System.out.println("nhập sđt:");
        int phoneNumber = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập Email:");
        String email = scanner.nextLine();
        System.out.println("nhập mã Nv:");
        int employeeCode = Integer.parseInt(scanner.nextLine());
//        System.out.println("nhập trình độ:");
//        String level = scanner.nextLine();
//        System.out.println("nhập vị trí:");
//        String location = scanner.nextLine();
        System.out.println("nhập lương:");
        double salary = Double.parseDouble(scanner.nextLine());
        employees.add(new Employee(firstNameAndLastName, dayOfBirth, gender, count, phoneNumber, email, employeeCode, getLevel(), getLocation(), salary));
        count++;
    }

    @Override
    public void display() {
        for (Employee item : employees) {
            System.out.println(item);
        }
    }

    @Override
    public void delete() {
        System.out.println("nhập id muốn xoá:");
        int id = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < employees.size(); i++) {
            if (id == employees.get(i).getId()) {
                employees.remove(employees.get(i));
            }
        }
    }

    @Override
    public void update() {
        System.out.println("nhập id muốn update:");
        int update = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < employees.size(); i++) {
            if (update == employees.get(i).getId()) {
                System.out.println("nhập tên:");
                String firstNameAndLastName = scanner.nextLine();
                System.out.println("nhập ngày tháng năm sinh:");
                int dayOfBirth = Integer.parseInt(scanner.nextLine());
                System.out.println("nhập giới tính");
                String gender = scanner.nextLine();
                System.out.println("nhập sđt:");
                int phoneNumber = Integer.parseInt(scanner.nextLine());
                System.out.println("nhập Email:");
                String email = scanner.nextLine();
                System.out.println("nhập mã Nv:");
                int employeeCode = Integer.parseInt(scanner.nextLine());
//                System.out.println("nhập trình độ:");
//                String level = scanner.nextLine();
//                System.out.println("nhập vị trí:");
//                String location = scanner.nextLine();
                System.out.println("nhập lương:");
                double salary = Double.parseDouble(scanner.nextLine());
                employees.get(i).setFirstNameAndLastName(firstNameAndLastName);
                employees.get(i).setDayOfBirth(dayOfBirth);
                employees.get(i).setGender(gender);
                employees.get(i).setPhoneNumber(phoneNumber);
                employees.get(i).setEmail(email);
                employees.get(i).setEmployeeCode(employeeCode);
                employees.get(i).setLevel(getLevel());
                employees.get(i).setLocation(getLocation());
                employees.get(i).setSalary(salary);
            }

        }
    }

    @Override
    public void search() {

    }
}
