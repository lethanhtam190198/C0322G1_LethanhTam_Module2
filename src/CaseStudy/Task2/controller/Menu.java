package CaseStudy.Task2.controller;

import java.util.Scanner;

public class Menu {

    public static void displayMainMenu(){
        Scanner scanner= new Scanner(System.in);
        System.out.println("-----------------Menu--------------------\n"+
                "1.Employee Management\n" +
                "2.Customer Management\n" +
                "3.Facility Management \n" +
                "4.Booking Management\n" +
                "5.Promotion Management\n" +
                "6.Exit");
        System.out.println("Plase Choose:");
        int choose=Integer.parseInt(scanner.nextLine());
        switch (choose){
            case 1:
                do {
                    System.out.println("" +
                            "1.Display list employees\n" +
                            "2.Add new employee\n" +
                            "3.Edit employee\n" +
                            "4.Return main menu");
                    int choose1=Integer.parseInt(scanner.nextLine());
                    switch (choose1){
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                            displayMainMenu();
                    }
                    break;
                }
                while (true);

            case 2:
                do {
                    System.out.println("1.Display list customers\n" +
                            "2.Add new customer\n" +
                            "3.Edit customer\n" +
                            "4.Return main menu");
                    int choose2 = Integer.parseInt(scanner.nextLine());
                    switch (choose2) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                            displayMainMenu();
                    }
                    break;
                }while (true);
            case 3:
                System.out.println("1.Display list facility\n" +
                        "2.Add new facility\n" +
                        "3.Display list facility maintenance\n" +
                        "4.Return main menu");
                int choose3=Integer.parseInt(scanner.nextLine());
                switch (choose3) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                        displayMainMenu();
                }
                while (true);
            case 4:
                System.out.println("1.Add new booking\n" +
                        "2.Display list booking\n" +
                        "3.Create new constracts\n" +
                        "4.Display list contracts\n" +
                        "5.Edit contracts\n" +
                        "6.Return main menu");
                int choose4=Integer.parseInt(scanner.nextLine());
                switch (choose4) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        displayMainMenu();
                }break;
            case 5:
                System.out.println("1.Display list customers use service\n" +
                        "2.Display list customers get voucher\n" +
                        "3.Return main menu\n");
                int choose5=Integer.parseInt(scanner.nextLine());
                switch (choose5) {
                    case 1:
                    case 2:
                    case 3:
                        displayMainMenu();
                }
                break;
            case 6:
                System.exit(0);
        }
    }

    public static void main(String[] args) {
        displayMainMenu();
    }
}

