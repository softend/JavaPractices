package Practice_12;

import java.util.regex.Pattern;

public class Person {
    String name;
    String surname;
    String patronym;

    public Person(String name, String surname, String patronym) {
        this.name = name;
        this.surname = surname;
        this.patronym = patronym;
    }

    public Person(String str) {
        str=str.trim();
        System.out.println(str);
        String[] arr = str.split(" ");
        if(arr.length==3) {
            this.name = (arr[1].charAt(0)) + ".";
            this.surname = arr[0];
            this.patronym = (arr[2].charAt(0)) + ".";
        }else if(arr.length==2){
            this.surname = arr[0];
            this.name = (arr[1].charAt(0)) + ".";
            this.patronym="";
        }else if(arr.length==1){
            this.surname=arr[0];
            this.name="";
            this.patronym="";
        }
    }

    @Override
    public String toString() {
        return "Person{ " +
                surname  +' ' +
                name  +' ' +
                patronym +
                "}";
    }
}
