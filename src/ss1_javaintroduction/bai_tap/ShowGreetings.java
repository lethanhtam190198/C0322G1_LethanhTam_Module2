package ss1_javaintroduction.bai_tap;

import java.util.Scanner;
public class ShowGreetings {
    public static void main(String[] args) {
        Scanner hello = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = hello.nextLine();
        System.out.println("Hello" + name);
    }
}
