package ss2.baitap;

import java.util.Scanner;

public class DisplayImage {
    public static void main(String[] args) {
        int choice = -1;
        Scanner input = new Scanner(System.in);
        while(choice != 0) {
            System.out.println("Menu");
            System.out.println("1. In hình chữ nhật");
            System.out.println("2. In hình tam giác vuông, có cạnh góc vuông ở botton-left");
            System.out.println("3. In hình tam giác vuông, có cạnh góc vuông ở top-left");
            System.out.println("4. In hình tam giác cân.");
            System.out.println("5. Exit");
            System.out.println("Enter your choice: ");
            choice = input.nextInt();
            System.out.println("nhap vao do dai *:");
            int length= input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("nhap vao do rong :");
                    int width= input.nextInt();
                    for(int i=0;i<width;i++){
                        System.out.println();
                        for(int j=0;j<length;j++){
                            System.out.print("*");
                        }
                    }
                    System.out.println();
                    break;
                case 2:
                    for(int i=0;i<length;i++){
                        for(int j=0;j<=i;j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    System.out.println();
                    break;
                case 3:
                    for(int i=0;i<length;i++){
                        for(int j=length;j>i;j--) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    System.out.println();
                    break;
                case 4:
                    for (int i = 0; i < length; i++) {
                        for (int j = i; j < length-1; j++) {
                            System.out.print(" ");
                        }
                        for (int k = 0; k <=i ; k++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                case 5:
                    System.exit(0);
                default:
                    System.out.println("No choice!");
            }
        }
    }
}
