package ss11_Dsa_Stack_Queue.baitap.DecimalConversion;

import java.util.Scanner;
import java.util.Stack;

public class DecimalConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        System.out.println("nhap so");
        int num = scanner.nextInt();
        while (num > 0) {
            stack.push(num % 2);
            num = num / 2;
        }
        System.out.println(stack);
        while (!(stack.isEmpty())) { //isEmpty để kiểm trả mảng có rỗng hay không, nếu rỗng trả về true,!isEmpty là cho nó chạy đến khi nào thành rỗng
            System.out.print(stack.pop());
        }
    }
}
