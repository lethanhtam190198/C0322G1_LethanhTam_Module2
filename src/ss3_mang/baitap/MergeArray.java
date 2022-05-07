package ss3_mang.baitap;

import java.util.Arrays;
import java.util.Scanner;

public class MergeArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the arr1 length");
        int a = scanner.nextInt();
        int[] arr1=new int[a];
        for (int i = 0; i < a; i++) {
            System.out.println("Index "+i);
            arr1[i]=scanner.nextInt();
        }
        System.out.println(Arrays.toString(arr1));
        System.out.println("Input the arr2 length");
        int b = scanner.nextInt();
        int[] arr2=new int[b];
        for (int j = 0; j < b; j++) {
            System.out.println("Index"+j);
            arr2[j]=scanner.nextInt();
        }
        System.out.println(Arrays.toString(arr2));
        int[] arr3 = new int[arr1.length+arr2.length];
        for (int i = 0; i < arr3.length; i++) {
            if(i<arr1.length) {
                arr3[i]=arr1[i];
            }else {
                arr3[i]=arr2[i-arr1.length];
            }
        }
        System.out.println(Arrays.toString(arr3));


    }
}
