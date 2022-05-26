package ss15_sulingoaile.baitap;

import java.util.Scanner;

public class Triangle {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws TriangleException {
        boolean flag;
        do {
            flag = false;
            try {
                System.out.println("nhập cạnh a:");
                double a = Double.parseDouble(scanner.nextLine());
                System.out.println("nhap canh b:");
                double b = Double.parseDouble(scanner.nextLine());
                System.out.println("nhap canh c:");
                double c = Double.parseDouble(scanner.nextLine());
                if (a <= 0 || b <= 0 || c <= 0) {
                    throw new TriangleException("Không phải là tam giác");
                } else if (a + b < c && a + c < b && b + c < a) {
                    throw new TriangleException("Không phải là tam giác:");
                } else {
                    System.out.println("đây la tam giac");
                }
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
                System.out.println("Hãy nhập vào số, không thể nhập vào chữ!!");
                flag = true;
            } catch (TriangleException e) {
                System.out.println(e.getMessage());
                System.out.println("hãy nhập lại!!!");
                flag = true;
            }
        } while (flag);
    }
}
