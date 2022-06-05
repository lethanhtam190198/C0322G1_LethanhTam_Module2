package Benhan.service;

import Benhan.models.BenhAnVip;
import Benhan.regex.Regex;
import CaseStudy.Task2.Exception.FullNameEx;
import CaseStudy.Task2.data.ReadAndWrite;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BenhAnVipImpl extends BenhAnVip implements IBenhAn {
    List<String[]> list = new ArrayList<>();
    ArrayList<BenhAnVip> benhAnVipList = new ArrayList<BenhAnVip>();
    static Scanner scanner = new Scanner(System.in);

    public  String getLoaiVip(){
        Scanner scanner = new Scanner(System.in);
        do {
            try {
                System.out.println("-----loai Vip------\n" +
                        "1. Vip 1\n" +
                        "2. Vip 2\n" +
                        "3. Vip 3\n" +
                        "Your choose  ");
                int choose = Integer.parseInt(scanner.nextLine());
                if (choose >= 1 && choose <= 3) {
                    switch (choose) {
                        case 1:
                            return "Vip 1";
                        case 2:
                            return "Vip 2";
                        case 3:
                            return "Vip 3";
                        default:
                            System.out.println("Vui lòng nhập lại trong khoảng từ 1->3");
                    }
                    break;
                } else {
                    System.out.println("Please Retype");
                }
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        } while (true);
        return " ";
    }

    @Override
    public void display() {
        list = ReadAndWrite.readerFile("src/Benhan/data/benhanvip.csv");
        benhAnVipList.clear();
        for (String[] item : list) {
            BenhAnVip benhAnVip = new BenhAnVip(
                    Integer.parseInt(item[0]),
                    item[1],
                    item[2],
                    item[3],
                    item[4],
                    item[5],
                    item[6],
                    item[7]);
            benhAnVipList.add(benhAnVip);
        }
        System.out.println("Danh sach benh an vip:");
        for (BenhAnVip benhAnThuong : benhAnVipList) {
            System.out.println(benhAnThuong);
        }

    }

    @Override
    public void add() throws IOException {
        list = ReadAndWrite.readerFile("src/Benhan/data/benhanvip.csv");
        benhAnVipList.clear();
        for (String[] item : list) {
            BenhAnVip benhAnVip = new BenhAnVip(
                    Integer.parseInt(item[0]),
                    item[1],
                    item[2],
                    item[3],
                    item[4],
                    item[5],
                    item[6],
                    item[7]);
            benhAnVipList.add(benhAnVip);
        }
        int id = 0;
        int max = 0;
        if (benhAnVipList.isEmpty()) {
            id = 1;
        } else {
            for (BenhAnVip item : benhAnVipList) {
                if (item.getSttBenhAn() > max) {
                    max = item.getSttBenhAn();
                }
            }
            id = max + 1;
        }

        String maBenhAn;
        do {
            try {
                System.out.println("Nhap ma benh an");
                maBenhAn = scanner.nextLine();
                if (Regex.formatMaBenhAn(maBenhAn)) {
                    break;
                } else {
                    throw new FullNameEx("Wrong Fomat Input");
                }
            } catch (FullNameEx fullNameEx) {
                fullNameEx.printStackTrace();
            }

        } while (true);

        String tenBenhNhan;
        do {
            try {
                System.out.println("Nhap ten benh nhan");
                tenBenhNhan = scanner.nextLine();
                if (Regex.formatName(tenBenhNhan)) {
                    break;
                } else {
                    throw new FullNameEx("Wrong Fomat Input");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } while (true);

        String ngayNhapvien;
        do {
            try {
                System.out.println("nhap ngay nhap vien");
                ngayNhapvien = scanner.nextLine();
                if(Regex.dateFormat(ngayNhapvien)){
                    break;
                }else
                    System.out.println("Wrong Format Input");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }while (true);

        String ngayRavien;
        do {
            try {
                System.out.println("nhap ra nhap vien");
                ngayRavien = scanner.nextLine();
                if(Regex.dateFormat(ngayRavien)){
                    break;
                }else
                    System.out.println("Wrong Format Input");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }while (true);

        System.out.println("nhap li do nhap vien");
        String lyDoNhapVien = scanner.nextLine();


        System.out.println("nhap thoi gian vip");
        String timeVip=scanner.nextLine();

        BenhAnVip benhAnVip = new BenhAnVip(id, maBenhAn
                , tenBenhNhan, ngayNhapvien, ngayRavien, lyDoNhapVien, getLoaiVip(),timeVip);

        benhAnVipList.add(benhAnVip);

        String line = benhAnVip.getInfo();

        ReadAndWrite.writeFile("src/Benhan/data/benhanvip.csv", line);
        System.out.println("da them thanh cong");
    }


    @Override
    public void delete() throws IOException {
        list = ReadAndWrite.readerFile("src/Benhan/data/benhanvip.csv");
        benhAnVipList.clear();
        for (String[] item : list) {
            BenhAnVip benhAnVip = new BenhAnVip(
                    Integer.parseInt(item[0]),
                    item[1],
                    item[2],
                    item[3],
                    item[4],
                    item[5],
                    item[6],
                    item[7]);
            benhAnVipList.add(benhAnVip);

        }
        System.out.println("Nhap ma benh nhan muon xoa:");
        String delete = scanner.nextLine();
        boolean check = false;
        for (int i = 0; i < benhAnVipList.size(); i++) {
            if (benhAnVipList.get(i).getMaBenhAn().equals(delete)) {
                benhAnVipList.remove(i);
                System.out.println("da xoa thanh cong");
            } else {
                check = true;
            }
        }
        if (check) {
            System.out.println("ID not Exist");
        }
        ReadAndWrite.clearFile("src/Benhan/data/benhanvip.csv");
        for (BenhAnVip item : benhAnVipList) {
            String line = item.getSttBenhAn() + "," +
                    item.getMaBenhAn() + "," +
                    item.getTenBenhNhan() + "," +
                    item.getNgayNhapvVien() + "," +
                    item.getNgayRaVien() + "," +
                    item.getLyDoNhapVien() + "," +
                    item.getLoaiVip()+ "," +
                    item.getTimeVip();
            ReadAndWrite.writeFile("src/Benhan/data/benhanvip.csv", line);
        }
    }
}
