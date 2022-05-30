package ss18_regex.baitap;

import java.util.regex.Pattern;

public class Validate {
    public static void main(String[] args) {
        String regexValidate = "^(C|A|P)[0-9]{4}(G|H|I|K|L|M)$";
        String str = "C0322G";
        String str1 = "C0322G1";
        String str2 = "2C0322G";
        boolean checkRegex = Pattern.matches(regexValidate, str);
        System.out.println(checkRegex);
        boolean checkRegex1 = Pattern.matches(regexValidate, str1);
        System.out.println(checkRegex1);
        boolean checkRegex2 = Pattern.matches(regexValidate, str2);
        System.out.println(checkRegex2);

    }
}
