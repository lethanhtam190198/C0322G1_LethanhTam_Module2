package ss17_binary.baitap;

import java.util.Scanner;

public class Controller {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        ProductSystem productSystem= new ProductSystem();
        do {
            try {
            System.out.println("----------Product-----------");
            System.out.println("1.Display");
            System.out.println("2.Add");
            System.out.println("3.Search");
            System.out.println("Please Choose:");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    System.out.println("----------Display----------");
                    productSystem.display();
                    break;
                case 2:
                    System.out.println("----------Add----------");
                    productSystem.add();
                    break;
                case 3:
                    System.out.println("----------Search----------");
                    productSystem.search();
                    break;

                default:
                    System.out.println("nhap sai !!!");
            }
        } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        }
        while (true);
    }
}
