package ss5.baitap.AccessModifier;

import java.util.Scanner;

public class RunAccessModifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AccessModifier accessModifier = new AccessModifier();
        accessModifier.display();
        System.out.println("nhập bán kính:");
        double radius = scanner.nextDouble();
        System.out.println("nhập màu:");
        String color = scanner.next();
        accessModifier.setRadius(radius);
        accessModifier.setColor(color);
        accessModifier.display();
    }
}
