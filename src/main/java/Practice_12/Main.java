package Practice_12;

import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        №1
        String regex = "[\s]*[A-Z][a-z]+[\s]*[A-Z][a-z]+[\s]*[A-Z][a-z]+";
        Pattern pattern = Pattern.compile(regex);
        String regex2 = "[\s]*[A-Z][a-z]+[\s]*[A-Z][a-z]+";
        Pattern pattern2 = Pattern.compile(regex2);
        String regex3 = "[\s]*[A-Z][a-z]+";
        Pattern pattern3 = Pattern.compile(regex3);
        System.out.print("Фамилия Имя Отчество: ");
        String line = sc.nextLine();
        line=line.trim();
        line=line.replaceAll("\\s+"," ");
        if(line.split(" ").length==3){
            Matcher matcher = pattern.matcher(line);
            if(matcher.matches()){
                Person person = new Person(line);
                System.out.println(person);
            }else {
                System.out.println("Ошибка");
            }
        }else if (line.split(" ").length==2) {
            Matcher matcher2 = pattern2.matcher(line);
            if(matcher2.matches()){
                Person person = new Person(line);
                System.out.println(person);
            }else {
                System.out.println("Ошибка");
            }
        }else if (line.split(" ").length==1) {
            Matcher matcher3 = pattern3.matcher(line);
            if(matcher3.matches()){
                Person person = new Person(line);
                System.out.println(person);
            }else {
                System.out.println("Ошибка");
            }
        }
//        №2
//        System.out.print("Страна, Регион, Город, Улица, Дом, Корпус, Квартира: ");
//        Address address = new Address(sc.nextLine());
//        System.out.println(address);

//        №3
//        String[] arr = new String[11];
//        fillarr(arr);
//        Shirt[] shirts = new Shirt[11];
//        for(int i=0;i<11;i++){
//            String[] split = arr[i].split(",");
//            shirts[i]=new Shirt(split[0],split[1],split[2],split[3]);
//        }
//        for(Shirt shirt: shirts){
//            System.out.println(shirt);
//        }
//        №4
//        System.out.println(new PhoneNumber("89106343780"));
    }

    private static void fillarr(String[] shirts) {
        shirts[0] = "S001,Black Polo Shirt,Black,XL"; shirts[1] = "S002,Black Polo Shirt,Black,L"; shirts[2] = "S003,Blue Polo Shirt,Blue,XL"; shirts[3] = "S004,Blue Polo Shirt,Blue,M"; shirts[4] = "S005,Tan Polo Shirt,Tan,XL"; shirts[5] = "S006,Black T-Shirt,Black,XL"; shirts[6] = "S007,White T-Shirt,White,XL"; shirts[7] = "S008,White T-Shirt,White,L"; shirts[8] = "S009,Green T-Shirt,Green,S"; shirts[9] = "S010,Orange T-Shirt,Orange,S"; shirts[10] = "S011,Maroon Polo Shirt,Maroon,S";
    }
}