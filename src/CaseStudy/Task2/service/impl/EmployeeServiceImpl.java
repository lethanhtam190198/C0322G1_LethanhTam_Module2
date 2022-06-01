package CaseStudy.Task2.service.impl;

import CaseStudy.Task2.data.ReadAndWrite;
import CaseStudy.Task2.models.person.Employee;
import CaseStudy.Task2.service.EmployeeService;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl extends Employee implements EmployeeService {
    List<String[]> list = new ArrayList<>();
    ArrayList<Employee> employeesList = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    @Override
    public void add() throws IOException {
        list = ReadAndWrite.readerFile("src/CaseStudy/Task2/data/dataemployee.csv");
        employeesList.clear();
        for (String[] item : list) {
            Employee employee = new
                    Employee(item[0], Integer.parseInt(item[1]), item[2], Integer.parseInt(item[3]),
                    Integer.parseInt(item[4]), item[5], Integer.parseInt(item[6]), item[7], item[8],
                    Double.parseDouble(item[9]));
            employeesList.add(employee);

        }

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

        System.out.println("nhập lương:");
        double salary = Double.parseDouble(scanner.nextLine());

        Employee employee = new Employee(firstNameAndLastName, dayOfBirth, gender, list.size(), phoneNumber, email, employeeCode, getLevel(), getLocation(), salary);
        employeesList.add(employee);

        String line = firstNameAndLastName + "," +
                dayOfBirth + "," +
                gender + "," +
                list.size() + "," + phoneNumber + "," +
                email + "," +
                employeeCode + "," +
                getLevel2() + "," +
                getLocation2() + "," +
                salary;
        ReadAndWrite.writeFile("src/CaseStudy/Task2/data/dataemployee.csv", line);
        System.out.println("Da them thanh cong");
    }

    @Override
    public void display() {
        list = ReadAndWrite.readerFile("src/CaseStudy/Task2/data/dataemployee.csv");
        employeesList.clear();
        for (String[] item : list) {
            Employee employee = new
                    Employee(item[0], Integer.parseInt(item[1]), item[2], Integer.parseInt(item[3]),
                    Integer.parseInt(item[4]), item[5], Integer.parseInt(item[6]), item[7],
                    item[8], Double.parseDouble(item[9]));
            employeesList.add(employee);
        }
        System.out.println("Danh sach nhan vien:");
        for (Employee employee : employeesList) {
            System.out.println(employee);
        }

    }

    @Override
    public void delete() {
    }

    @Override
    public void update() throws IOException {
        list = ReadAndWrite.readerFile("src/CaseStudy/Task2/data/dataemployee.csv");
        employeesList.clear();
        for (String[] item : list) {
            Employee employee = new Employee(
                    item[0],
                    Integer.parseInt(item[1]),
                    item[2],
                    Integer.parseInt(item[3]),
                    Integer.parseInt(item[4]),
                    item[5],
                    Integer.parseInt(item[6]),
                    item[7],
                    item[8],
                    Double.parseDouble(item[9]));
            employeesList.add(employee);
        }
        System.out.println("Nhập ID cần update");
        boolean check = false;
        int index = 0;
        int idUpdate;
        try {
            idUpdate = Integer.parseInt(scanner.nextLine());

            for (int i = 0; i < employeesList.size(); i++) {
                if (employeesList.get(i).getId() == idUpdate) {
                    check = true;
                    index = i;
                    break;
                }
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        if (check) {
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

            System.out.println("nhập lương:");
            double salary = Double.parseDouble(scanner.nextLine());

            employeesList.get(index).setFirstNameAndLastName(firstNameAndLastName);
            employeesList.get(index).setDayOfBirth(dayOfBirth);
            employeesList.get(index).setGender(gender);
            employeesList.get(index).setPhoneNumber(phoneNumber);
            employeesList.get(index).setEmail(email);
            employeesList.get(index).setEmployeeCode(employeeCode);
            employeesList.get(index).setLevel(getLevel());
            employeesList.get(index).setLocation(getLocation());
            employeesList.get(index).setSalary(salary);
            ReadAndWrite.clearFile("src/CaseStudy/Task2/data/dataemployee.csv");
            for(Employee item:employeesList){
                String line =
                        item.getFirstNameAndLastName() + "," +
                                item.getDayOfBirth() + "," +
                                item.getGender() + "," +
                                item.getId() + "," +
                                item.getPhoneNumber() + "," +
                                item.getEmail() + "," +
                                item.getEmployeeCode() + "," +
                                item.getLevel2() + "," +
                                item.getLocation2() + "," +
                                item.getSalary();
                ReadAndWrite.writeFile("src/CaseStudy/Task2/data/dataemployee.csv", line);
            }
            System.out.println("Da sửa thanh cong");
        }
        else {
            System.out.println("ID ko tồn tại");
        }
    }

    @Override
    public void search() {

    }
}
