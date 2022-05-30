package ss18_regex.baitap;

import java.util.regex.Pattern;

public class ValidatePhoneNumber {
    public static void main(String[] args) {
        String phoneNumberRegex="^(84){1}-(0){1}\\d{9}";
        String str="84-0123456777";
        boolean checkRegex= Pattern.matches(phoneNumberRegex,str);
        System.out.println(checkRegex);
        String str1="84-2123456777";
        boolean checkRegex1= Pattern.matches(phoneNumberRegex,str1);
        System.out.println(checkRegex1);
    }
}
