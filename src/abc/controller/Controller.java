package abc.controller;

import abc.service.IAbc;
import abc.service.ManagenmentStaffImpl;
import abc.service.ProductStaffImpl;

import java.io.IOException;
import java.util.Scanner;

public class Controller {
    public static Scanner scanner = new Scanner(System.in);
    public  static ManagenmentStaffImpl managenmentStaff= new ManagenmentStaffImpl();
    public  static ProductStaffImpl productStaff= new ProductStaffImpl();


    public static void displayMainMenu() throws IOException {
        do {

            Scanner scanner = new Scanner(System.in);
            System.out.println("-----------------Menu--------------------\n" +
                    "1.DisPlay\n" +
                    "2.Add\n" +
                    "3.Delete \n" +
                    "4.Search \n" +
                    "5.Exit");
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
                        System.out.println("--------Display-------\n" +
                                "1.Display NV quan li\n" +
                                "2.Display NV san xuat\n"+
                                "3.Returm menu");
                        choose = 0;
                        try {
                            choose = Integer.parseInt(scanner.nextLine());
                        } catch (NumberFormatException e) {
                            System.out.println("Nhap lai!!!!");
                        }
                        switch (choose) {
                            case 1:
                                managenmentStaff.display();
                                break;
                            case 2:
                                productStaff.display();
                                break;
                            case 3:
                                displayMainMenu();
                        }
                    } while (true);
                case 2:
                    do{
                        System.out.println("--------Addd-------\n" +
                                "1.Add NV quan li\n" +
                                "2.Add Nv San xuat\n"+
                                "3.Return menu");
                        choose = 0;
                        try {
                            choose = Integer.parseInt(scanner.nextLine());
                        } catch (NumberFormatException e) {
                            System.out.println("Nhap lai!!!!");
                        }
                        switch (choose) {
                            case 1:
                                managenmentStaff.add();
                                break;
                            case 2:
                                productStaff.add();
                                break;
                            case 3:
                                displayMainMenu();
                        }

                    }while (true);
                case 3:
                    do{
                        System.out.println("--------Delete-------\n" +
                                "1.Delete NV quan li\n" +
                                "2.Delete NV san xuat\n"+
                                "3.Return menu");
                        choose = 0;
                        try {
                            choose = Integer.parseInt(scanner.nextLine());
                        } catch (NumberFormatException e) {
                            System.out.println("Nhap lai!!!!");
                        }
                        switch (choose) {
                            case 1:
                                managenmentStaff.delete();
                                break;
                            case 2:
                                productStaff.delete();
                                break;
                            case 3:
                                displayMainMenu();
                        }

                    }while (true);
                case 4:
                    do{
                        System.out.println("--------Search-------\n" +
                                "1.Search NV quan li\n" +
                                "2.Search NV san xuat\n"+
                                "3.Return menu");
                        choose = 0;
                        try {
                            choose = Integer.parseInt(scanner.nextLine());
                        } catch (NumberFormatException e) {
                            System.out.println("Nhap lai!!!!");
                        }
                        switch (choose) {
                            case 1:
                                managenmentStaff.search();
                                break;
                            case 2:
                                productStaff.search();
                                break;
                            case 3:
                                displayMainMenu();
                        }

                    }while (true);

            }
        } while (true);
    }

}
