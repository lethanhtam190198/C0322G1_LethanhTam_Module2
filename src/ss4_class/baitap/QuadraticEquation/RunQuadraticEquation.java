package ss4_class.baitap.QuadraticEquation;

import java.util.Scanner;

class RunQuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a, b, c;
        System.out.println("nhập a:");
        a = Double.parseDouble(scanner.nextLine());
        System.out.println("nhập b:");
        b = Double.parseDouble(scanner.nextLine());
        System.out.println("nhập c:");
        c = Double.parseDouble(scanner.nextLine());
        ClassQuadraticEquation abc = new ClassQuadraticEquation(a, b, c);
        if (abc.getDiscriminant() < 0) {
            System.out.println("phương trình vô nghiệm");
        } else if (abc.getDiscriminant() == 0) {
            System.out.println("phuong trinh co 1 nghiem " + abc.getRoot1());
        } else {
            System.out.println("phương trình có 2 nghiệm là:");
            System.out.println("delta la:" + " " + abc.getDiscriminant());
            System.out.println("Nghiệm 1:" + " " + abc.getRoot1());
            System.out.println("Nghiệm 2:" + " " + abc.getRoot2());

        }
    }
}

