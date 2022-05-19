package ss11_Dsa_Stack_Queue.baitap.Palindrome;

import java.util.*;

public class Palindrome {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();
        System.out.println("nhap text");
        String text = scanner.nextLine().toLowerCase();
        char[] array = text.toCharArray();//chuyển str thành arr
        for (int i = 0; i < array.length; i++) {
            stack.push(array[i]);
            queue.add(array[i]);
        }
        boolean flag = true;
        for (int i = 0; i < array.length; i++) {
            if (stack.pop().equals(queue.poll())) {
                flag = true;
            } else {
                flag = false;
                break;
            }

        }
        if (flag) {
            System.out.println("Palindrome");
        } else {
            System.out.println("No Palindrome");
        }
    }

}
