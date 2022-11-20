package Practice_5;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(recurs(String.valueOf(num)));
    }

    private static String recurs(String num) {
        String symb = "";
        if(num.length()>1){
            symb = num.substring(num.length()-1);
            return symb + recurs(num.substring(0,num.length()-1));
        } else {
            return num;
        }
    }
}