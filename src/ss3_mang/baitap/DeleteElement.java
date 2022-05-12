package ss3_mang.baitap;

import java.util.Arrays;
import java.util.Scanner;

public class DeleteElement {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Số phần tử của mảng:");
            size = scanner.nextInt();
            if (size > 20)
                System.out.println("Quá 20 phần tử");
        } while (size > 20);
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("Phần tử " + (i + 1) + " : ");
            array[i] = scanner.nextInt();
            i++;
        }
        System.out.println("Property list: ");
        for (int j = 0; j < array.length; j++) {
            System.out.println(array[j] );
        }
        System.out.println("nhập vào phần tử muốn xoá:");
        int input = scanner.nextInt();
        int count=0;
        for (int j = 0; j < array.length; j++) {
            if (input == array[j]) {
                for (int k = j; k <array.length-1 ; k++) {
                array[k] = array[k + 1];
            }
                j--;
                count++;
                array[array.length-count]=0;
            }

        }
        System.out.println(Arrays.toString(array));

    }
}
