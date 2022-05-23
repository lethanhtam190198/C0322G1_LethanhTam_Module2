package baitaptonghop.controller;


import baitaptonghop.service.PersonImpl;

import java.util.Scanner;

public class Controller {
    public static Scanner scanner = new Scanner(System.in);

    public static void displayMainMenu() {
        PersonImpl person = new PersonImpl();
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("-----------------Menu--------------------\n" +
                    "1.Nv Quản lí\n" +
                    "2.Nv Công nhật\n" +
                    "3.Nhân viên san xuất \n" +
                    "4.Tất cả nhân viên\n" +
                    "5.Sắp xếp\n" +
                    "6.Exit");
            System.out.println("Plase Choose:");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    PersonImpl.displayNvQuanli();
                    break;
                case 2:
                    PersonImpl.displayNvCongnhat();
                    break;
                case 3:
                    PersonImpl.displayNvSanXuat();
                    break;
                case 4:
                    PersonImpl.displayNV();
                    break;
                case 5:
                    do {
                        System.out.println("1.Sắp xếp tăng dần theo lương\n" +
                                "2.Sắp xếp tăng dần theo tên\n" +
                                "3.Về menu chính");
                        System.out.println("nhập lựa chọn:");
                        int input = Integer.parseInt(scanner.nextLine());
                        switch (input) {
                            case 1:
                                person.sapXepTangTheoLuong();
                                break;
                            case 2:
                                person.sapXepTheoTen();
                                break;
                            case 3:
                                displayMainMenu();
                                break;
                            default:
                                System.out.println("nhập saii!!!");
                        }

                    } while (true);
                case 6:
                    System.exit(0);
                default:
                    System.out.println("nhap sai!!");

            }
        } while (true);
    }

    public static void main(String[] args) {
        displayMainMenu();
    }
}