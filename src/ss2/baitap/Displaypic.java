package ss2.baitap;

import java.util.Scanner;

public class Displaypic {
    public static void main(String[] args) {
        int choice = -1;
        Scanner input = new Scanner(System.in);
        while(choice != 0) {
            System.out.println("Menu");
            System.out.println("1. In hình chữ nhật");
            System.out.println("2. In hình tam giác vuông, có cạnh góc vuông ở botton-left");
            System.out.println("3. In hình tam giác vuông, có cạnh góc vuông ở top-left");
            System.out.println("4. Exit");
            System.out.println("Enter your choice: ");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    for(int i=0;i<4;i++){
                        System.out.println();
                        for(int j=0;j<15;j++){
                            System.out.print("*");
                        }
                    }
                    System.out.println();
                    break;
                case 2:
                    for(int i=0;i<8;i++){
                        for(int j=0;j<=i;j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    System.out.println();
                    break;
                case 3:
                    for(int i=0;i<8;i++){
                        for(int j=8;j>i;j--) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    System.out.println();
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("No choice!");
            }
        }
    }
}
