package abc.regex;

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
        final String VALID_FORMAT_DATE = "^(?:(?:31(\\/|-|\\.)(?:0?[13578]|1[02]))\\1|(?:(?:29|30)(\\/|-|\\.)(?:0?[13-9]|1[0-2])\\2))(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$|^(?:29(\\/|-|\\.)0?2\\3(?:(?:(?:1[6-9]|[2-9]\\d)?(?:0[48]|[2468][048]|[13579][26])|(?:(?:16|[2468][048]|[3579][26])00))))$|^(?:0?[1-9]|1\\d|2[0-8])(\\/|-|\\.)(?:(?:0?[1-9])|(?:1[0-2]))\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$";
        Pattern pattern = Pattern.compile(VALID_FORMAT_DATE);
        return pattern.matcher(str).matches();
    }
}
