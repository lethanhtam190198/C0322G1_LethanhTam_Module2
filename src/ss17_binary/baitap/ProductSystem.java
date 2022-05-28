package ss17_binary.baitap;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductSystem extends ProductManagement implements IProduct {
    public static Scanner scanner = new Scanner(System.in);
    public static List<ProductManagement> productManagements = new ArrayList<>();
    public static int count = 1;


    @Override
    public void add() {
        try{
        System.out.println("Nhập nameProduct:");
        String nameProduct = scanner.nextLine();
        System.out.println("Nhập manufacturingCompany:");
        String manufacturingCompany = scanner.nextLine();
        System.out.println("nhập price:");
        double price = Double.parseDouble(scanner.nextLine());
        productManagements.add(new ProductManagement(count, nameProduct, manufacturingCompany, price));
        count++;
        ReadAndWriteProduct.writeProduct("src/ss17_binary/baitap/text.txt",productManagements);
    } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void display() {
        try{
        productManagements = (List<ProductManagement>) ReadAndWriteProduct.readProduct("src/ss17_binary/baitap/text.txt");
        System.out.println(productManagements.toString());
    } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void search() {
        try{
        System.out.println("nhap tu muon tim kiếm");
        String search = scanner.nextLine();
        boolean flag = false;
        for (int i = 0; i < productManagements.size(); i++) {
            if (productManagements.get(i).getNameProduct().contains(search)) {
                System.out.println(productManagements.get(i));
                flag = true;
            }
        }
        if (flag) {
            System.out.println("Không tim thấy");
        }

    } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
