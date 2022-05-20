package ss12_JavaCollectionFramework;

import java.util.*;

public class SystemProduct extends ProductManagement implements IProduct {
    public static Scanner scanner = new Scanner(System.in);
    public static List<ProductManagement> productManagements = new ArrayList<>();
    public static int count;

    static {
        productManagements.add(new ProductManagement("ab", 1, 700, 1000, "abc"));
        productManagements.add(new ProductManagement("ad", 2, 200, 2000, "def"));
        productManagements.add(new ProductManagement("ef", 3, 300, 3000, "aaaaa"));
        count = 3;
    }


    @Override
    public void add() {
        System.out.println("nhap ten");
        String name = scanner.nextLine();
        System.out.println("nhap price:");
        int price = Integer.parseInt(scanner.nextLine());
        System.out.println("nhap Amout");
        double amout = Double.parseDouble(scanner.nextLine());
        System.out.println("nhap produttion");
        String production = scanner.nextLine();
        productManagements.add(new ProductManagement(name, count + 1, price, amout, production));
        count++;
    }

    @Override
    public void display() {
        System.out.println(productManagements.toString());
    }

    @Override
    public void delete() {
        System.out.println("nhap id muon xoa:");
        int id = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < productManagements.size(); i++) {
            if (productManagements.get(i).getId() == id) {
                productManagements.remove(productManagements.get(i));
            }
        }
        display();
    }

    @Override
    public void update() {
        System.out.println("nhap id muon update:");
        int id = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < productManagements.size(); i++) {
            if (productManagements.get(i).getId() == id) {
                System.out.println("nhap ten");
                String name = scanner.nextLine();
                System.out.println("nhap price");
                int price = Integer.parseInt(scanner.nextLine());
                System.out.println("nhap amout");
                double amout = Double.parseDouble(scanner.nextLine());
                System.out.println("nhap production");
                String production = scanner.nextLine();
                productManagements.get(i).setNameProduct(name);
                productManagements.get(i).setPrice(price);
                productManagements.get(i).setAmout(amout);
                productManagements.get(i).setProduction(production);
                break;
            }
            display();
        }

    }

    @Override
    public void findName() {
        System.out.println("nhap tu muon tim kiếm");
        String search = scanner.nextLine();
        boolean flag = false;
        for (int i = 0; i < productManagements.size(); i++) {
            if (productManagements.get(i).getNameProduct().contains(search)) {
                System.out.println(productManagements.get(i));
                flag = true;
            } else {
                flag = false;
            }
        }
        if (flag) {
            System.out.println("Không tim thấy");
        }

    }

    @Override
    public void sortAscendingByPrice() {
        Collections.sort(productManagements, new Comparator<ProductManagement>() {
            @Override
            public int compare(ProductManagement o1, ProductManagement o2) {
                return o1.getPrice() - o2.getPrice();
            }
        });
        display();
    }

    @Override
    public void sortDescendingByPrice() {
        Collections.sort(productManagements, new Comparator<ProductManagement>() {
            @Override
            public int compare(ProductManagement o1, ProductManagement o2) {
                return o2.getPrice() - o1.getPrice();
            }
        });
        display();
    }
}
