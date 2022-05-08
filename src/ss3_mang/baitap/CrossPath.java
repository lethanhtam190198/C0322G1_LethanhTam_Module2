package ss3_mang.baitap;

import java.util.Scanner;

public class CrossPath {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input row :");
        int row = scanner.nextInt();
        System.out.println("Input height :");
        int height = scanner.nextInt();
        int[][] arr = new int[row][height];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < height; j++) {
                System.out.println("Input value " + i + "," + j + "];");
                arr[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i <row ; i++) {
            System.out.print("[ ");
            for (int j = 0; j < height; j++) {
                System.out.print(arr[i][j] + " ");
            } System.out.println(" ] ");
        }
        int sum = 0;
        for (int i = 0; i <row ; i++) {
            for (int j = 0; j < height; j++) {
                if (i==j){
                    sum +=arr[i][j];
                }
            }

        }
        System.out.println("Tổng đường chéo là : "+sum);
    }
}
