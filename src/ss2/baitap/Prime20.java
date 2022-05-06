package ss2.baitap;

public class Prime20 {
    public static void main(String[] args) {
        int number = 2;
        int count = 0;
        while (count < 20) {
            boolean flag = true;
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println(number);
                count++;
            }
            number++;
        }

    }
}
