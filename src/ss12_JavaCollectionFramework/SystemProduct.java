package ss12_JavaCollectionFramework;

import crud.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SystemProduct extends ProductManagement implements IProduct {
    public static Scanner scanner = new Scanner(System.in);
    public static List<ProductManagement> productManagements= new ArrayList<>();
    public static int count;
    static {
        productManagements.add(new ProductManagement("ab",1,100,1000,"abc"));
        productManagements.add(new ProductManagement("cd",2,200,2000,"abc"));
        productManagements.add(new ProductManagement("ef",3,300,3000,"abc"));
        count=3;
    }


    @Override
    public void add() {
        System.out.println("nhap ten");
        String name = scanner.nextLine();
        System.out.println("nhap price:");
        double price= Double.parseDouble(scanner.nextLine());
        System.out.println("nhap Amout");
        double amout = Double.parseDouble(scanner.nextLine());
        System.out.println("nhap produttion");
        String production = scanner.nextLine();
        productManagements.add(new ProductManagement(name,count+1,price,amout,production));
        count++;
    }

    @Override
    public void display() {
                System.out.println(productManagements.toString());
    }

    @Override
    public void delete() {

    }

    @Override
    public void update() {

    }

    @Override
    public void findName() {

    }

    @Override
    public void SortAscending() {

    }
}
