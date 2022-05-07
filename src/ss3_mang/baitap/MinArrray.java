package ss3_mang.baitap;

import java.util.Scanner;

public class MinArrray {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int current;
        System.out.println("Nhập vào độ dài ");
        current = scanner.nextInt();
        int[] newarray=new int[current];
        for (int i = 0; i < current; i++) {
            System.out.println("nhap vao vị trí :"+i);
            newarray[i]=scanner.nextInt();
        }
        int min=newarray[0];
        for (int i = 0; i < newarray.length; i++) {
            if(newarray[i]<min){
                min=newarray[i];
            }
        }System.out.println("Min là:"+min);
    }
}
