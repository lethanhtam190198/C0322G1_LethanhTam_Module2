package ss11_Dsa_Stack_Queue.baitap.InvertElement;

import java.util.*;

public class InvertElement {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] list = new int[5];
        for (int i = 0; i < list.length; i++) {
            list[i] = scanner.nextInt();
        }
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < list.length; i++) {
            stack.push(list[i]);
        }
        System.out.println("Before" + stack);
        for (int i = 0; i < list.length; i++) {
            stack.pop();
        }

        for (int i = list.length - 1; i >= 0; i--) {
            stack.add(list[i]);
        }
        System.out.println("After" + stack);

    }
}
