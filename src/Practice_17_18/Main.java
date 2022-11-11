package Practice_17_18;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static boolean check(String regex, String str){
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);
        return matcher.find();
    }

    public static void main(String[] args) {
        String testStr1 = "abcdefghijklmnopqrstuv18340";
        String testStr2 = "abcdefghijklmnoasdfasdpqrstuv18340";

        String regex = "^abcdefghijklmnopqrstuv18340$";
        System.out.println(check(regex, testStr1));
        System.out.println(check(regex, testStr2));

        testStr1 = "AE:dC:cA:56:76:54";
        testStr2 = "01:23:45:67:89:Az";

        regex = "[[a-f[A-F]][a-f[A-F]]:]{3}[\\d{2}:]{3}";
        System.out.println(check(regex, testStr1));
        System.out.println(check(regex, testStr2));

        testStr1 = "Text 23.78 USD smth";
        testStr2 = "Text 22 UDD, 0.002 USD smth";

        regex = "\\d+\\.\\d{1,2} USD|RUB|EU";
        System.out.println(check(regex, testStr1));
        System.out.println(check(regex, testStr2));
    }
}
