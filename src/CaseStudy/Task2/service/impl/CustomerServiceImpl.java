package CaseStudy.Task2.service.impl;

import CaseStudy.Task2.models.person.Customer;
import CaseStudy.Task2.service.CustomerService;

import java.util.LinkedList;
import java.util.Scanner;

public class CustomerServiceImpl extends Customer implements CustomerService {
    public static Scanner scanner = new Scanner(System.in);
    public static LinkedList<Customer> customers = new LinkedList<Customer>();
    public static int count;

    static {
        customers.add(new Customer("tam", 1998, "nam", 1, 12, "aaaaa", 1212, "Diamond"));
        customers.add(new Customer("hai", 1990, "nam", 2, 901111, "aaaaa", 1213, "Platinium"));
        customers.add(new Customer("duc", 1991, "nữ", 3, 901111, "aaaaa", 1214, "Gold"));
        customers.add(new Customer("tuan", 1992, "nam", 4, 901111, "aaaaa", 1215, "Silver"));
        customers.add(new Customer("dat", 1993, "nữ", 5, 901111, "aaaaa", 1216, "Member"));
        count = 6;
    }

    @Override
    public void add() {
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
        int customerCode = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập lương:");
        double salary = Double.parseDouble(scanner.nextLine());
        customers.add(new Customer(firstNameAndLastName, dayOfBirth, gender, count, phoneNumber, email, customerCode, getTypeOfCustomer()));
        count++;
        //String firstNameAndLastName, int dayOfBirth, String gender,
        // int id, int phoneNumber, String email, int customerCode,
        // String typeOfCustomer)
    }


    @Override
    public void display() {
        for (Customer item : customers) {
            System.out.println(item);
        }

    }

    @Override
    public void delete() {

    }

    @Override
    public void update() {
        System.out.println("nhập id muốn update:");
        int update = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < customers.size(); i++) {
            if (update == customers.get(i).getId()) {
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
                customers.get(i).setFirstNameAndLastName(firstNameAndLastName);
                customers.get(i).setDayOfBirth(dayOfBirth);
                customers.get(i).setGender(gender);
                customers.get(i).setPhoneNumber(phoneNumber);
                customers.get(i).setEmail(email);
                customers.get(i).setTypeOfCustomer(getTypeOfCustomer());
            }
        }

    }

    //String firstNameAndLastName, int dayOfBirth, String gender,
    // int id, int phoneNumber, String email, int customerCode,
    // String typeOfCustomer)

    @Override
    public void search() {

    }
}
