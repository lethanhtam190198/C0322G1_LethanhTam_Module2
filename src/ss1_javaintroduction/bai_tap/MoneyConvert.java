package ss1_javaintroduction.bai_tap;

import java.util.Scanner;

public class MoneyConvert {
    public static void main(String[] args) {
        Scanner USD = new Scanner(System.in);
        System.out.print("Nhap USD: ");
        double usd = USD.nextDouble();
        double vnd=usd*23000;
        System.out.println("Currency conversion VND:"+vnd);
    }
}
