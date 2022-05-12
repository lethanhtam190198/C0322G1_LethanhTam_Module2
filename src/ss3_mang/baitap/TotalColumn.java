package ss3_mang.baitap;

import java.util.Arrays;
import java.util.Scanner;

public class TotalColumn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input the row :");
        int row = scanner.nextInt();
        System.out.println("Input the height :");
        int height = scanner.nextInt();
        int[][] arr = new int[row][height];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < height; j++) {
                System.out.println("Input the value " + i + "," + j + "];");
                arr[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < row; i++) {
            System.out.print("[");
            for (int j = 0; j < height; j++) {

                System.out.print(arr[i][j] + " ");
            }
        }
        System.out.println("]");
        System.out.println("nhập cột muốn tính tổng");
        int column = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i < row; i++) {
            sum = sum + arr[i][column];
        }
        System.out.println(sum);
    }
}