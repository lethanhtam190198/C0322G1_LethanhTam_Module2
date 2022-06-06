package Benhan.service;

import Benhan.models.BenhAnThuong;
import Benhan.regex.Regex;
import CaseStudy.Task2.Exception.FullNameEx;
import CaseStudy.Task2.data.ReadAndWrite;
import CaseStudy.Task2.models.person.Employee;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BenhAnThuongImpl implements IBenhAn {
    List<String[]> list = new ArrayList<>();
    ArrayList<BenhAnThuong> benhAnThuongList = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    @Override
    public void display() {
        list = ReadAndWrite.readerFile("src/Benhan/data/benhanthuong.csv");
        benhAnThuongList.clear();
        for (String[] item : list) {
            BenhAnThuong benhAnThuong = new BenhAnThuong(
                    Integer.parseInt(item[0]),
                    item[1],
                    item[2],
                    item[3],
                    item[4],
                    item[5],
                    Double.parseDouble(item[6]));

            benhAnThuongList.add(benhAnThuong);
        }
        System.out.println("Danh sach benh an thuong:");
        for (BenhAnThuong benhAnThuong : benhAnThuongList) {
            System.out.println(benhAnThuong);
        }
    }

    @Override
    public void add() throws IOException {
        list = ReadAndWrite.readerFile("src/Benhan/data/benhanthuong.csv");
        benhAnThuongList.clear();
        for (String[] item : list) {
            BenhAnThuong benhAnThuong = new BenhAnThuong(
                    Integer.parseInt(item[0]),
                    item[1],
                    item[2],
                    item[3],
                    item[4],
                    item[5],
                    Double.parseDouble(item[6]));
            benhAnThuongList.add(benhAnThuong);
        }
        int id=0;
        int max =0;
        if (benhAnThuongList.isEmpty()) {
            id = 1;
        } else {
            for (BenhAnThuong item:benhAnThuongList) {
                if (item.getSttBenhAn()>max){
                    max=item.getSttBenhAn();
                }
            }
            id= max+1;
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
                System.out.println("nhap ngay nhap vien");
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

        System.out.println("nhap phi");
        double phi = Double.parseDouble(scanner.nextLine());

        BenhAnThuong benhAnThuong = new BenhAnThuong(id, maBenhAn
                , tenBenhNhan, ngayNhapvien, ngayRavien, lyDoNhapVien, phi);

        benhAnThuongList.add(benhAnThuong);

        String line = benhAnThuong.getInfo();

        ReadAndWrite.writeFile("src/Benhan/data/benhanthuong.csv", line);
        System.out.println("da them thanh cong");
    }


    @Override
    public void delete() throws IOException {
        list = ReadAndWrite.readerFile("src/Benhan/data/benhanthuong.csv");
        benhAnThuongList.clear();
        for (String[] item : list) {
            BenhAnThuong benhAnThuong = new BenhAnThuong(
                    Integer.parseInt(item[0]),
                    item[1],
                    item[2],
                    item[3],
                    item[4],
                    item[5],
                    Double.parseDouble(item[6]));

            benhAnThuongList.add(benhAnThuong);
        }
        System.out.println("Nhap ma benh nhan muon xoa:");
        String delete = scanner.nextLine();
        boolean check = false;
        for (int i = 0; i < benhAnThuongList.size(); i++) {
            if (benhAnThuongList.get(i).getMaBenhAn().equals(delete)) {
                benhAnThuongList.remove(i);
                System.out.println("da xoa thanh cong");
            } else {
                check = true;
            }
        }
        if (check) {
            System.out.println("ID not Exist");
        }
        ReadAndWrite.clearFile("src/Benhan/data/benhanthuong.csv");
        for(BenhAnThuong item:benhAnThuongList){
            String line= item.getSttBenhAn()+","+
                    item.getMaBenhAn()+","+
                    item.getTenBenhNhan()+","+
                    item.getNgayNhapvVien()+","+
                    item.getNgayRaVien()+","+
                    item.getLyDoNhapVien()+","+
                    item.getPhi();
            ReadAndWrite.writeFile("src/Benhan/data/benhanthuong.csv",line);
        }
    }
}


