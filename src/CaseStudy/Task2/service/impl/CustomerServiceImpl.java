package CaseStudy.Task2.service.impl;

import CaseStudy.Task2.data.ReadAndWrite;
import CaseStudy.Task2.models.person.Customer;
import CaseStudy.Task2.service.CustomerService;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceImpl extends Customer implements CustomerService {
    List<String[]> list = new ArrayList<>();
    public static Scanner scanner = new Scanner(System.in);
    public static LinkedList<Customer> customersList = new LinkedList<Customer>();


    @Override
    public void add() throws IOException {
        int id = 0;
        list = ReadAndWrite.readerFile("src/CaseStudy/Task2/data/datacustomer.csv");
        customersList.clear();
        for (String[] item : list) {
            Customer customer = new Customer
                    (item[0],
                            item[1],
                            item[2],
                            Integer.parseInt(item[3]),
                            item[4],
                            item[5],
                            Integer.parseInt(item[6]),
                            item[7]);
            customersList.add(customer);
        }
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
        int customerCode = Integer.parseInt(scanner.nextLine());

        System.out.println("nhập lương:");
        double salary = Double.parseDouble(scanner.nextLine());

        if (customersList.isEmpty()) {
            id = 1;
        } else {
            id = customersList.get(customersList.size() - 1).getId() + 1;
        }

        Customer customer = new Customer(firstNameAndLastName, dayOfBirth, gender, id, phoneNumber, email, customerCode, getTypeOfCustomer());
        customersList.add(customer);

        String line = customer.getInfo();

        ReadAndWrite.writeFile("src/CaseStudy/Task2/data/datacustomer.csv", line);

        System.out.println("Da them thanh cong");

    }

    @Override
    public void display() {
        list = ReadAndWrite.readerFile("src/CaseStudy/Task2/data/datacustomer.csv");
        customersList.clear();
        for (String[] item : list) {
            Customer customer = new Customer
                    (item[0],
                            item[1],
                            item[2],
                            Integer.parseInt(item[3]),
                            item[4],
                            item[5],
                            Integer.parseInt(item[6]),
                            item[7]);
            customersList.add(customer);
        }
        System.out.println("Danh sach nhan vien:");
        for (Customer customer : customersList) {
            System.out.println(customer);
        }

    }

    @Override
    public void delete() {

    }

    @Override
    public void update() throws IOException {
        list = ReadAndWrite.readerFile("src/CaseStudy/Task2/data/datacustomer.csv");
        customersList.clear();
        for (String[] item : list) {
            Customer customer = new Customer
                    (item[0],
                            item[1],
                            item[2],
                            Integer.parseInt(item[3]),
                            item[4],
                            item[5],
                            Integer.parseInt(item[6]),
                            item[7]);
            customersList.add(customer);
        }
        System.out.println("Nhập ID cần update");
        boolean check = false;
        int index = 0;
        int idUpdate;
        try {
            idUpdate = Integer.parseInt(scanner.nextLine());

            for (int i = 0; i < customersList.size(); i++) {
                if (customersList.get(i).getId() == idUpdate) {
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

            System.out.println("nhap customercode");
            int customerCode = Integer.parseInt(scanner.nextLine());


            customersList.get(index).setFullName(firstNameAndLastName);
            customersList.get(index).setDayOfBirth(dayOfBirth);
            customersList.get(index).setGender(gender);
            customersList.get(index).setPhoneNumber(phoneNumber);
            customersList.get(index).setEmail(email);
            customersList.get(index).setCustomerCode(customerCode);
            customersList.get(index).setTypeOfCustomer(getTypeOfCustomer());

            ReadAndWrite.clearFile("src/CaseStudy/Task2/data/datacustomer.csv");

            for (Customer item : customersList) {
                String line = item.getInfo();

                ReadAndWrite.writeFile("src/CaseStudy/Task2/data/datacustomer.csv", line);
            }
            System.out.println("Da sửa thanh cong");
        } else {
            System.out.println("ID ko tồn tại");
        }
    }

}
