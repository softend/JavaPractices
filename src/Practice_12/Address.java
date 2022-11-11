package Practice_12;

public class Address {
    String country, region, city, street, house, corpus, flat;

    public Address(String arg) {
        arg=arg.trim();
        String[] arr = arg.split("[,;.]");
        for(int i=0;i<arr.length;i++){
            if(arr[i].charAt(0)==' ') {
                arr[i]=arr[i].substring(1);
            }
        }
        this.country = arr[0];
        this.region = arr[1];
        this.city = arr[2];
        this.street = arr[3];
        this.house = arr[4];
        this.corpus = arr[5];
        this.flat = arr[6];
    }

    @Override
    public String toString() {
        return "Address{" +
                "country='" + country + '\'' +
                ", region='" + region + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", house='" + house + '\'' +
                ", corpus='" + corpus + '\'' +
                ", flat='" + flat + '\'' +
                '}';
    }
}