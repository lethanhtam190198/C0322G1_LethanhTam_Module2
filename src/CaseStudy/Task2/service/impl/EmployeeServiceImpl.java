package CaseStudy.Task2.service.impl;

import CaseStudy.Task2.Exception.FullNameEx;
import CaseStudy.Task2.data.ReadAndWrite;
import CaseStudy.Task2.models.person.Employee;
import CaseStudy.Task2.service.EmployeeService;
import CaseStudy.Task2.service.Regex;

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
        int id;
        list = ReadAndWrite.readerFile("src/CaseStudy/Task2/data/dataemployee.csv");
        employeesList.clear();
        for (String[] item : list) {
            Employee employee = new Employee
                            (item[0],
                            item[1],
                            item[2],
                            Integer.parseInt(item[3]),
                            item[4],
                            item[5],
                            item[6],
                            item[7],
                            item[8],
                            Double.parseDouble(item[9]));
            employeesList.add(employee);

        }

        String fullName;
        do {
            try {
                System.err.println("nhập tên:\nEx:Jason Statham");
                fullName = scanner.nextLine();
                if (Regex.formatName(fullName)) {
                    break;
                } else {
                    throw new FullNameEx("Wrong Fomat Input");
                }
            } catch (FullNameEx e) {
                System.out.println(e.getMessage());;
            }

        }while (true);

        String dayOfBirth;
        do {
            System.err.println("nhập ngày tháng năm sinh:\n Ex:dd/MM/YYYY ");
            dayOfBirth = scanner.nextLine();
            if(Regex.dateFormat(dayOfBirth)){
                break;
            }else {
                System.out.println("Wrong Format Input");
            }
        }while (true);

        String gender;
        do {
            System.err.println("nhập giới tính:\nEx:Male|Female|Other");
            gender = scanner.nextLine();
            if(Regex.formatGender(gender)){
                break;
            }else {
                System.out.println("Wrong Format Input");
            }
        }while (true);

        String phoneNumber;
        do {
            System.err.println("nhập sđt:\n+8409019999999");
            phoneNumber = scanner.nextLine();
            if(Regex.formatPhone(phoneNumber)){
                break;
            } else {
                System.out.println("Wrong Format Input");
            }
        }while (true);


        String email;
        do {
            System.err.println("nhập Email:\nEx:abcd@gmail.com");
            email = scanner.nextLine();
            if(Regex.formatEmail(email)){
                break;
            }else {
                System.out.println("Wrong Format Input");
            }
        }while (true);

        String employeeCode;
        do {
            System.err.println("nhập mã Nv:\nEx:EMID|CMID|BKID|CID-XXXX");
            employeeCode = scanner.nextLine();
            if(Regex.code(employeeCode)){
                break;
            }else {
                System.out.println("Wrong Format Input");
            }
        }while (true);


        System.err.println("nhập lương:");
        double salary = Double.parseDouble(scanner.nextLine());

        int max =0;
        if (employeesList.isEmpty()) {
            id = 1;
        } else {
            for (Employee item:employeesList) {
                if (item.getId()>max){
                    max=item.getId();
                }
            }
            id= max+1;
        }

        Employee employee = new Employee(fullName, dayOfBirth, gender, id, phoneNumber, email, employeeCode, getLevel(), getLocation(), salary);
        employeesList.add(employee);

        String line = employee.getInfo();

        ReadAndWrite.writeFile("src/CaseStudy/Task2/data/dataemployee.csv", line);
        System.out.println("Da them thanh cong");
    }

    @Override
    public void display() {
        list = ReadAndWrite.readerFile("src/CaseStudy/Task2/data/dataemployee.csv");
        employeesList.clear();
        for (String[] item : list) {
            Employee employee = new
                    Employee(item[0],
                    item[1],
                    item[2],
                    Integer.parseInt(item[3]),
                    item[4],
                    item[5],
                    item[6],
                    item[7],
                    item[8],
                    Double.parseDouble(item[9]));
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
                    item[1],
                    item[2],
                    Integer.parseInt(item[3]),
                    item[4],
                    item[5],
                    item[6],
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
            String dayOfBirth = scanner.nextLine();

            System.out.println("nhập giới tính");
            String gender = scanner.nextLine();

            System.out.println("nhập sđt:");
            String phoneNumber = scanner.nextLine();

            System.out.println("nhập Email:");
            String email = scanner.nextLine();

            System.out.println("nhập mã Nv:");
            String employeeCode = scanner.nextLine();

            System.out.println("nhập lương:");
            double salary = Double.parseDouble(scanner.nextLine());

            employeesList.get(index).setFullName(firstNameAndLastName);
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
                        item.getFullName() + "," +
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
