package ss18_regex.baitap;

import java.util.regex.Pattern;

public class CrawlNews {
    public static void main(String[] args) {
        String regexCrawlNews="^(https?|ftp|file)://[-a-zA-Z0-9+&@#/%?=~_|!:,.;]*[-a-zA-Z0-9+&@#/%=~_|]$";
        String str="http://dantri.com.vn/the-gioi.html";
        boolean checkRegex= Pattern.matches(regexCrawlNews,str);
        System.out.println(checkRegex);
    }
}
