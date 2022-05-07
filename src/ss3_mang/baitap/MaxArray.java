package ss3_mang.baitap;

import java.util.Scanner;

public class MaxArray {
    public static void main(String[] args) {
        int current, pillar;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số dòng của ma trận: ");
        current = scanner.nextInt();
        System.out.println("Nhập vào số cột của ma trận: ");
        pillar = scanner.nextInt();
        int[][] newarray = new int[current][pillar];
        System.out.println("Nhập các phần tử cho ma trận: ");
        for (int i = 0; i < current; i++) {
            for (int j = 0; j < pillar; j++) {
                System.out.print("A[" + i + "]["+ j + "] = ");
                newarray[i][j] = scanner.nextInt();
            }
        }
        int max = newarray[0][0];
        for (int i = 0; i < current; i++) {
            for (int j = 0; j < pillar; j++) {
                if (max < newarray[i][j]) {
                    max = newarray[i][j];
                }
            }
        }
        System.out.println("Phần tử lớn nhất trong ma trận = " + max);
    }
}
