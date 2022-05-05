package ss2.baitap;

public class Prime {
        public static void main(String[] args) {
            System.out.println("Các số nguyên tố nhỏ hơn 20 là: ");
            for (int i = 0; i < 20; i++) {
                if (isPrimeNumber(i)) {
                    System.out.print(i + " ");
                }
            }
        }
        public static boolean isPrimeNumber(int n) {
            // so nguyen n < 2 khong phai la so nguyen to
            if (n < 2) {
                return false;
            }
            // check so nguyen to khi n >= 2
            int squareRoot = (int) Math.sqrt(n);
            for (int i = 2; i <= squareRoot; i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }

