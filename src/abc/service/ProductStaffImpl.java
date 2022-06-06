package abc.service;

import CaseStudy.Task2.Exception.FullNameEx;
import CaseStudy.Task2.data.ReadAndWrite;
import abc.models.ManagenmentStaff;
import abc.models.ProductionStaff;
import abc.regex.Regex;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductStaffImpl implements IAbc {
    List<String[]> list1 = new ArrayList<>();
    ArrayList<ProductionStaff> productionStaffs = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    @Override
    public void add() throws IOException {
        list1 = ReadAndWrite.readerFile("src/abc/data/Product.csv");
        productionStaffs.clear();
        for (String[] item : list1) {
            ProductionStaff productionStaff = new ProductionStaff(
                    Integer.parseInt(item[0]),
                    item[1],
                    item[2],
                    item[3],
                    item[4],
                    Integer.parseInt(item[5]),
                    Double.parseDouble(item[6]));
            productionStaffs.add(productionStaff);
        }
        int id = 0;
        int max = 0;
        if (productionStaffs.isEmpty()) {
            id = 1;
        } else {
            for (ProductionStaff item : productionStaffs) {
                if (item.getId() > max) {
                    max = item.getId();
                }
            }
            id = max + 1;
        }

        System.out.println("Nhập mã nhân viên:");
        String employeeCode = scanner.nextLine();

        String fullName;
        do {
            try {
                System.out.println("Nhap ten NV");
                fullName = scanner.nextLine();
                if (Regex.formatName(fullName)) {
                    break;
                } else {
                    throw new FullNameEx("Wrong Fomat Input");
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
                if (Regex.dateFormat(dayOfBirth)) {
                    break;
                } else
                    System.out.println("Wrong Format Input");
            } catch (Exception e) {
                e.printStackTrace();
            }
        } while (true);

        System.out.println("Nhập địa chỉ");
        String address = scanner.nextLine();


        System.out.println("Nhập số sản phẩm");
        int productNumber = Integer.parseInt(scanner.nextLine());

        System.out.println("nhập giá mỗi sản phẩm");
        double priceProduct = Double.parseDouble(scanner.nextLine());

        ProductionStaff productionStaff = new ProductionStaff(
                id, employeeCode, fullName, dayOfBirth, address,
                productNumber, priceProduct);

        productionStaffs.add(productionStaff);

        String line = productionStaff.getInfo();

        abc.data.ReadAndWrite.writeFile("src/abc/data/Product.csv", line);
        System.out.println("Đã thêm thành công");
    }


    @Override
    public void display() {
        list1 = ReadAndWrite.readerFile("src/abc/data/Product.csv");
        productionStaffs.clear();
        for (String[] item : list1) {
            ProductionStaff productionStaff = new ProductionStaff(
                    Integer.parseInt(item[0]),
                    item[1],
                    item[2],
                    item[3],
                    item[4],
                    Integer.parseInt(item[5]),
                    Double.parseDouble(item[6]));
            productionStaffs.add(productionStaff);
        }
        System.out.println("Danh Nv san xuat:");
        for (ProductionStaff productionStaff : productionStaffs) {
            System.out.println(productionStaff);
        }
    }

    @Override
    public void delete() throws IOException {
        list1 = ReadAndWrite.readerFile("src/abc/data/Product.csv");
        productionStaffs.clear();
        for (String[] item : list1) {
            ProductionStaff productionStaff = new ProductionStaff(
                    Integer.parseInt(item[0]),
                    item[1],
                    item[2],
                    item[3],
                    item[4],
                    Integer.parseInt(item[5]),
                    Double.parseDouble(item[6]));
            productionStaffs.add(productionStaff);
        }
        System.out.println("Nhập mã nhân viên muốn xoá");
        String delete= scanner.nextLine();
        boolean check= false;
        for (int i = 0; i < productionStaffs.size(); i++) {
            if (productionStaffs.get(i).getEmployeeCode().equals(delete)) {
                productionStaffs.remove(i);
                System.out.println("da xoa thanh cong");
            } else {
                check = true;
            }
        }
        if(check){
            System.out.println("Mã nv ko tồn tại");
        }
        abc.data.ReadAndWrite.clearFile("src/abc/data/Product.csv");

        for(ProductionStaff item:productionStaffs ){
            String line=
                    item.getId()+","+
                            item.getEmployeeCode()+","+
                            item.getFullName()+","+
                            item.getDayOfBirth()+","+
                            item.getAddress()+","+
                            item.getProductNumber()+","+
                            item.getPriceProduct();
            abc.data.ReadAndWrite.writeFile("src/abc/data/Product.csv",line);

        }
    }

    @Override
    public void search() {
        list1 = ReadAndWrite.readerFile("src/abc/data/Product.csv");
        productionStaffs.clear();
        for (String[] item : list1) {
            ProductionStaff productionStaff = new ProductionStaff(
                    Integer.parseInt(item[0]),
                    item[1],
                    item[2],
                    item[3],
                    item[4],
                    Integer.parseInt(item[5]),
                    Double.parseDouble(item[6]));
            productionStaffs.add(productionStaff);
        }
        System.out.println("nhập mã nv muốn tìm");
        String search=scanner.nextLine();
        boolean check = false;
        for (int i = 0; i < productionStaffs.size(); i++) {
            if (productionStaffs.get(i).getEmployeeCode().contains(search)) {
                System.out.println(productionStaffs.get(i));
            }
        }
        if (check) {
            System.out.println("ID not Exist");
        }
    }
}
