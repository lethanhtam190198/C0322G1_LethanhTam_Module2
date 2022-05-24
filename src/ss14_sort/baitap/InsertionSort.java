package ss14_sort.baitap;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("nhập số phần tử của mảng:");
        int input = Integer.parseInt(scanner.nextLine());
        int[] arr = new int[input];
        for (int i = 0; i < input; i++) {
            int z = i + 1;
            System.out.println("Phần tử thứ " + z);
            arr[i] = scanner.nextInt();
        }
        int sort, x;
        for (int i = 1; i < arr.length; i++) {
            x = arr[i];
            sort = i;
            while (sort > 0 && x < arr[sort - 1]) {
                arr[sort] = arr[sort - 1];
                sort--;
            }
            arr[sort] = x;
            System.out.println("Mảng sau khi sắp xếp lần " + i + ":" + Arrays.toString(arr));
        }
    }
}
