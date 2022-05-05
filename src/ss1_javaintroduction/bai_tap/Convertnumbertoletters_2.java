package ss1_javaintroduction.bai_tap;

import java.util.Scanner;

public class Convertnumbertoletters_2 {
    private static final String[] UNIT = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
    private static final String[] TEEN = {"ten", "eleven", "twelve", "threteen", "fourteen", "fivteen", "sixteen", "seventeen", "eighteen", "ninteen"};
    private static final String[] DOZENS = {null, null, "twenty", "thirty", "fourty", "fivty", "sixty", "seventy", "eighty", "ninety"};

    public static String Convertnumbertoletters_2(int number) {
        if (number < 10) {
            return UNIT[number];
        }
        if (number < 20) {
            return TEEN[number];
        } else if (number < 100) {
            return DOZENS[number / 10] + ((number % 10 > 0) ? " " + Convertnumbertoletters_2(number % 10) : "");
        } else if (number < 1000) {
            return UNIT[number / 100] + "Hundred" + ((number % 100 > 0) ? " " + Convertnumbertoletters_2(number % 100) : "");
        }
        return Convertnumbertoletters_2(number / 1000) + "Thousand" + ((number % 1000 > 0) ? " " + Convertnumbertoletters_2(number % 1000) : "");
    }

    public static void main(String[] args) {
        int num;
        do {
            Scanner scan = new Scanner(System.in);
            System.out.println("Input number");
            num = scan.nextInt();
            if (num >= 0 && num < 100000) {
                System.out.println(Convertnumbertoletters_2(num));
            } else {
                System.out.println("Number it out of range");
            }

        }while (num < 0 ||num >= 100000);

    }
}
