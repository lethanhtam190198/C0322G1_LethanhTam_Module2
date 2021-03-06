package abc.service;

import CaseStudy.Task2.Exception.FullNameEx;
import CaseStudy.Task2.data.ReadAndWrite;
import abc.models.ManagenmentStaff;
import abc.regex.Regex;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ManagenmentStaffImpl implements IStaff {
    List<String[]> list = new ArrayList<>();
    ArrayList<ManagenmentStaff> managenmentStaffs = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);
    @Override
    public void add() throws IOException {
        list = ReadAndWrite.readerFile("src/abc/data/Management.csv");
        managenmentStaffs.clear();
        for (String[] item : list) {
            ManagenmentStaff managenmentStaff = new ManagenmentStaff(
                    Integer.parseInt(item[0]),
                    item[1],
                    item[2],
                    item[3],
                    item[4],
                    Double.parseDouble(item[5]),
                    Double.parseDouble(item[6]));
            managenmentStaffs.add(managenmentStaff);
        }
        int id=0;
        int max =0;
        if (managenmentStaffs.isEmpty()) {
            id = 1;
        } else {
            for (ManagenmentStaff item:managenmentStaffs) {
                if (item.getId()>max){
                    max=item.getId();
                }
            }
            id= max+1;
        }

        String employeeCode;
        do {
            try {
                System.out.println("Nhập mã nhân viên:    NV-XXXX");
                employeeCode = scanner.nextLine();
                if (Regex.formatMaNV(employeeCode)) {
                    break;
                } else {
                    System.out.println("Wrong Format Input!!");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }while (true);

        String fullName;
        do {
            try {
                System.out.println("Nhap ten NV");
                fullName = scanner.nextLine();
                if (Regex.formatName(fullName)) {
                    break;
                } else {
                    throw new FullNameEx("Wrong Format Input");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } while (true);

        String dayOfBirth;
        do {
            try {
                System.out.println("nhap ngày sinh");
                dayOfBirth = scanner.nextLine();
                if(Regex.dateFormat(dayOfBirth)){
                    break;
                }else
                    System.out.println("Wrong Format Input");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }while (true);

        System.out.println("Nhập địa chỉ");
        String address= scanner.nextLine();

        double salary = 0;
        boolean flag2 = false;
        do {
            try {
                System.out.print("Input Salary:");
                salary = Double.parseDouble(scanner.nextLine());
                if (salary > 0) {
                    flag2 = false;
                } else {
                    System.out.println("Retype ");
                    flag2 = true;
                }

            } catch (NumberFormatException e) {
                e.printStackTrace();
                flag2 = true;
            }
        } while (flag2);

        double coefficientsSalary = 0;
        boolean flag3 = false;
        do {
            try {
                System.out.print("Input he so luong:");
                coefficientsSalary = Double.parseDouble(scanner.nextLine());
                if (coefficientsSalary > 0) {
                    flag3 = false;
                } else {
                    System.out.println("Retype ");
                    flag3 = true;
                }

            } catch (NumberFormatException e) {
                e.printStackTrace();
                flag3 = true;
            }
        } while (flag3);

        ManagenmentStaff managenmentStaff= new ManagenmentStaff(
                id,employeeCode,fullName,dayOfBirth,address,salary,
                coefficientsSalary);

        managenmentStaffs.add(managenmentStaff);

        String line= managenmentStaff.getInfo();

        ReadAndWrite.writeFile("src/abc/data/Management.csv",line);
        System.out.println("đã thêm thành công");
    }


    @Override
    public void display() {
        list = ReadAndWrite.readerFile("src/abc/data/Management.csv");
        managenmentStaffs.clear();
        for (String[] item : list) {
            ManagenmentStaff managenmentStaff = new ManagenmentStaff(
                    Integer.parseInt(item[0]),
                    item[1],
                    item[2],
                    item[3],
                    item[4],
                    Double.parseDouble(item[5]),
                    Double.parseDouble(item[6]));
            managenmentStaffs.add(managenmentStaff);
        }
        System.out.println("Danh sach benh an thuong:");
        for (ManagenmentStaff managenmentStaff : managenmentStaffs) {
            System.out.println(managenmentStaff);
        }
    }

    @Override
    public void delete() throws IOException {
        list = ReadAndWrite.readerFile("src/abc/data/Management.csv");
        managenmentStaffs.clear();
        for (String[] item : list) {
            ManagenmentStaff managenmentStaff = new ManagenmentStaff(
                    Integer.parseInt(item[0]),
                    item[1],
                    item[2],
                    item[3],
                    item[4],
                    Double.parseDouble(item[5]),
                    Double.parseDouble(item[6]));
            managenmentStaffs.add(managenmentStaff);
        }

        System.out.println("Nhập mã nhân viên muốn xoá");
        String delete= scanner.nextLine();
        boolean check= false;
        for (int i = 0; i < managenmentStaffs.size(); i++) {
            if (managenmentStaffs.get(i).getEmployeeCode().equals(delete)) {
                managenmentStaffs.remove(i);
                System.out.println("da xoa thanh cong");
            } else {
                check = true;
            }
        }
        if(check){
            System.out.println("Mã nv ko tồn tại");
        }

        abc.data.ReadAndWrite.clearFile("src/abc/data/Management.csv");
        for(ManagenmentStaff item:managenmentStaffs ){
            String line=
                            item.getId()+","+
                            item.getEmployeeCode()+","+
                            item.getFullName()+","+
                            item.getDayOfBirth()+","+
                            item.getAddress()+","+
                            item.getSalary()+","+
                            item.getCoefficientsSalary();
            abc.data.ReadAndWrite.writeFile("src/abc/data/Management.csv",line);
        }
    }

    @Override
    public void search() {
        list = ReadAndWrite.readerFile("src/abc/data/Management.csv");
        managenmentStaffs.clear();
        for (String[] item : list) {
            ManagenmentStaff managenmentStaff = new ManagenmentStaff(
                    Integer.parseInt(item[0]),
                    item[1],
                    item[2],
                    item[3],
                    item[4],
                    Double.parseDouble(item[5]),
                    Double.parseDouble(item[6]));
            managenmentStaffs.add(managenmentStaff);
        }

        System.out.println("nhập mã nv muốn tìm");
        String search=scanner.nextLine();
        boolean check = false;
        for (int i = 0; i < managenmentStaffs.size(); i++) {
            if (managenmentStaffs.get(i).getEmployeeCode().contains(search)) {
                System.out.println(managenmentStaffs.get(i));
            }
            else {
                check=true;
            }
        }
        if (check==true) {
            System.out.println("ID not Exist");
        }
    }
}
