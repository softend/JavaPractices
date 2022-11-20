package Practice_12;

public class PhoneNumber {
    String number="";

    public PhoneNumber(String number) {
        if (number.charAt(0)=='+'){
            int country = number.length()-10;
            this.number+=number.substring(0,country+3)+"-"+number.substring(country+3,country+6)+"-"+number.substring(country+6);
        }else{
            this.number+=number.substring(0,4)+"-"+number.substring(4,7)+"-"+number.substring(7);
        }
    }

    @Override
    public String toString() {
        return "PhoneNumber{" +
                "number='" + number + '\'' +
                '}';
    }
}
