package CaseStudy.Task2.controller;

import CaseStudy.Task2.models.facility.Facility;
import CaseStudy.Task2.models.facility.Villa;
import CaseStudy.Task2.service.impl.CustomerServiceImpl;
import CaseStudy.Task2.service.impl.EmployeeServiceImpl;
import CaseStudy.Task2.service.impl.FacilityServiceImpl;

import java.util.Scanner;

public class FuramaController {


    public static void displayMainMenu() {
        EmployeeServiceImpl employeeServiceImpl = new EmployeeServiceImpl();
        CustomerServiceImpl customerServiceImpl = new CustomerServiceImpl();
        FacilityServiceImpl facilityService= new FacilityServiceImpl();
        do {

            Scanner scanner = new Scanner(System.in);
            System.out.println("-----------------Menu--------------------\n" +
                    "1.Employee Management\n" +
                    "2.Customer Management\n" +
                    "3.Facility Management \n" +
                    "4.Booking Management\n" +
                    "5.Promotion Management\n" +
                    "6.Exit");
            System.out.println("Plase Choose:");
            int choose = 0;
            try {
                choose = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Nhap lai!!!!");
            }
            switch (choose) {
                case 1:
                    do {
                        System.out.println("-------------Employee Management-------------\n" +
                                "1.Display list employees\n" +
                                "2.Add new employee\n" +
                                "3.Delete employee\n" +
                                "4.Edit employee\n" +
                                "5.Return main menu");
                        int choose1 = Integer.parseInt(scanner.nextLine());
                        switch (choose1) {
                            case 1:
                                employeeServiceImpl.display();
                                break;
                            case 2:
                                employeeServiceImpl.add();
                                employeeServiceImpl.display();
                                break;
                            case 3:
                                employeeServiceImpl.delete();
                                employeeServiceImpl.display();
                                break;
                            case 4:
                                employeeServiceImpl.update();
                                employeeServiceImpl.display();
                                break;
                            case 5:
                                displayMainMenu();
                                break;
                        }
                    }
                    while (true);
                case 2:
                    do {
                        System.out.println("----------------Customer Management----------------\n" +
                                "1.Display list customers\n" +
                                "2.Add new customer\n" +
                                "3.Edit customer\n" +
                                "4.Return main menu");
                        int choose2 = Integer.parseInt(scanner.nextLine());
                        switch (choose2) {
                            case 1:
                                customerServiceImpl.display();
                                break;
                            case 2:
                                customerServiceImpl.add();
                                customerServiceImpl.display();
                                break;
                            case 3:
                                customerServiceImpl.update();
                                customerServiceImpl.display();
                                break;
                            case 4:
                                displayMainMenu();
                                break;
                        }

                    } while (true);
                case 3:
                    do {
                        System.out.println("---------Facility Management---------\n"+
                                "1.Display list facility\n" +
                                "2.Add new facility\n" +
                                "3.Display list facility maintenance\n" +
                                "4.Return main menu");
                        int choose3 = Integer.parseInt(scanner.nextLine());
                        switch (choose3) {
                            case 1:
                                facilityService.display();
                                break;
                            case 2:
                                facilityService.add();
                                break;
                            case 3:
                            case 4:
                                displayMainMenu();
                                break;
                        }
                    }
                    while (true) ;
                case 4:
                    System.out.println("1.Add new booking\n" +
                            "2.Display list booking\n" +
                            "3.Create new constracts\n" +
                            "4.Display list contracts\n" +
                            "5.Edit contracts\n" +
                            "6.Return main menu");
                    int choose4 = Integer.parseInt(scanner.nextLine());
                    switch (choose4) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                            displayMainMenu();
                            break;
                    }
                    break;
                case 5:
                    System.out.println("1.Display list customers use service\n" +
                            "2.Display list customers get voucher\n" +
                            "3.Return main menu\n");
                    int choose5 = Integer.parseInt(scanner.nextLine());
                    switch (choose5) {
                        case 1:
                        case 2:
                        case 3:
                            displayMainMenu();
                            break;
                    }
                    break;
                case 6:
                    System.exit(0);
            }

        } while (true);

    }

    public static void main(String[] args) {
        displayMainMenu();
    }
}

