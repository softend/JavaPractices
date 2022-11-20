package Practice_5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println((recurs(str)));
    }

    public static String recurs(String str) {
        if (str.charAt(0) == str.charAt(str.length() - 1)) {
            if (str.length() > 2) {
                return recurs(str.substring(1, str.length() - 1));
            } else {
                return "YES";
            }
        }
        return "NO";
    }
}
