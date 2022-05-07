package ss3_mang.baitap;

import java.util.Arrays;
import java.util.Scanner;

public class InsertElement {
    public static void main(String[] args) {
        int[] array = new int[11];
        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i <= 8; i++) {
            System.out.print("Nhập phần tử thứ" + " " + i + ":");
            array[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(array));

        System.out.println("nhập vào số muốn chèn:");
        int input = scanner.nextInt();
        System.out.println("nhập vào vị trí muốn chèn:");
        int insert = scanner.nextInt();
        if (insert <= -1 || insert >= array.length - 1) {
            System.out.println("không chèn được");
        } else {
            for (int i = array.length - 1; i > insert; i--) {
                array[i] = array[i - 1];
            }
            array[insert] = input;
            System.out.println(Arrays.toString(array));
        }
    }
}