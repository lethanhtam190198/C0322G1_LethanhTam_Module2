package ss2.baitap;

public class PrimeLess100 {
    public static void main(String[] args) {
        int number = 2;
        while (number<100) {
            boolean flag = true;
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println(number);
            }
            number++;
        }

    }
}
