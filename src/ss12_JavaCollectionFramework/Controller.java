package ss12_JavaCollectionFramework;

import java.util.Scanner;

public class Controller {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        SystemProduct systemProduct = new SystemProduct();
        do {
            System.out.println("----------Product-----------");
            System.out.println("1.Display");
            System.out.println("2.Add");
            System.out.println("3.Delete");
            System.out.println("4.Update");
            System.out.println("5.Find Name");
            System.out.println("6.Sort Ascending");
            System.out.println("7.Sort Descending");
            System.out.println("8.Exit");
            System.out.println("nhap lua chon:");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    System.out.println("Display:");
                    systemProduct.display();
                    break;
                case 2:
                    System.out.println("Add");
                    systemProduct.add();
                    break;
                case 3:
                    System.out.println("Delete");
                    systemProduct.delete();
                    break;
                case 4:
                    System.out.println("Update");
                    systemProduct.update();
                    break;
                case 5:
                    System.out.println("Find Name");
                    systemProduct.findName();
                    break;
                case 6:
                    System.out.println("Sort Ascending By Price");
                    systemProduct.sortAscendingByPrice();
                    break;
                case 7:
                    System.out.println("Sort Descending By Price ");
                    systemProduct.sortDescendingByPrice();
                    break;
                case 8:
                    System.exit(0);

                default:
                    System.out.println("nhap sai !!!");
            }
        }
        while (true);
    }
}
