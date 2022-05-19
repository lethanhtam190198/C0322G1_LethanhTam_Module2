package ss11_Dsa_Stack_Queue.baitap.Bracket;

import java.util.Scanner;
import java.util.Stack;

public class Bracket {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Stack<Character> bStack = new Stack<>();
        System.out.println("nhap text");
        String text = scanner.nextLine();
        boolean flag = true;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == '(') {
                bStack.push(text.charAt(i));
            } else if (text.charAt(i) == ')') {
                if (bStack.isEmpty()) {
                    System.out.println("False");
                    flag = false;
                    break;
                }
                bStack.pop();
            }
        }
        if (flag && bStack.isEmpty()) {
            System.out.println("True");
        } else if (!bStack.isEmpty()) {
            System.out.println("False");
        }
    }
}
