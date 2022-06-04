package Benhan.regex;

import java.util.regex.Pattern;

public class Regex {
    public static boolean formatMaBenhAn (String str) {
        final String MA_BENH_NHAN = "(BA)-\\d{4}";
        Pattern pattern = Pattern.compile(MA_BENH_NHAN);
        return pattern.matcher(str).matches();
    }
    public static boolean formatName (String str) {
        final String VALID_FULL_NAME = "^([A-Z]{1}[a-z]{1,}\\s{1}){1,}([A-Z]{1}[a-z]{1,})$";
        Pattern pattern = Pattern.compile(VALID_FULL_NAME);
        return pattern.matcher(str).matches();
    }
    public static boolean formatMaBenhNhan (String str) {
        final String MA_BENH_NHAN = "(BN)-\\d{4}";
        Pattern pattern = Pattern.compile(MA_BENH_NHAN);
        return pattern.matcher(str).matches();
    }
    public static boolean dateFormat (String str) {
        final String VALID_FORMAT_DATE = "^\\d{1,2}/\\d{1,2}/\\d{4}$";
        Pattern pattern = Pattern.compile(VALID_FORMAT_DATE);
        return pattern.matcher(str).matches();
    }
}
