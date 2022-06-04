package Benhan.controller;

import Benhan.models.BenhAnVip;
import Benhan.service.BenhAnThuongImpl;
import Benhan.service.BenhAnVipImpl;

import java.io.IOException;
import java.util.Scanner;

public class Controller {
    public static Scanner scanner = new Scanner(System.in);
    public static BenhAnThuongImpl benhanthuong = new BenhAnThuongImpl();
    public static BenhAnVipImpl benhAnVip= new BenhAnVipImpl();

    public static void displayMainMenu() throws IOException {
        do {

            Scanner scanner = new Scanner(System.in);
            System.out.println("-----------------Menu--------------------\n" +
                    "1.DisPlay\n" +
                    "2.Add\n" +
                    "3.Delete \n" +
                    "4.Exit");
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
                                "1.Display BenhAnThuong\n" +
                                "2.Display BenhAnVip\n"+
                                "3.Returm menu");
                        choose = 0;
                        try {
                            choose = Integer.parseInt(scanner.nextLine());
                        } catch (NumberFormatException e) {
                            System.out.println("Nhap lai!!!!");
                        }
                        switch (choose) {
                            case 1:
                                benhanthuong.display();
                                break;
                            case 2:
                                benhAnVip.display();
                                break;
                            case 3:
                                displayMainMenu();
                        }
                    } while (true);
                case 2:
                    do{
                        System.out.println("--------Addd-------\n" +
                                "1.Add BenhAnThuong\n" +
                                "2.Add BenhAnVip\n"+
                                "3.Return menu");
                        choose = 0;
                        try {
                            choose = Integer.parseInt(scanner.nextLine());
                        } catch (NumberFormatException e) {
                            System.out.println("Nhap lai!!!!");
                        }
                        switch (choose) {
                            case 1:
                                benhanthuong.add();
                                break;
                            case 2:
                                benhAnVip.add();
                                break;
                            case 3:
                                displayMainMenu();
                        }

                    }while (true);
                case 3:
                    do{
                        System.out.println("--------Delete-------\n" +
                                "1.Delete BenhAnThuong\n" +
                                "2.Delete BenhAnVip\n"+
                                "3.Return menu");
                        choose = 0;
                        try {
                            choose = Integer.parseInt(scanner.nextLine());
                        } catch (NumberFormatException e) {
                            System.out.println("Nhap lai!!!!");
                        }
                        switch (choose) {
                            case 1:
                                benhanthuong.delete();
                                break;
                            case 2:
                                benhAnVip.delete();
                                break;
                            case 3:
                                displayMainMenu();
                        }

                    }while (true);
            }
        } while (true);
    }

}
