package Practice_12;

public class Shirt {
    String number;
    String type, color, size;

    public Shirt(String number, String type, String color, String size) {
        this.number = number;
        this.type = type;
        this.color = color;
        this.size = size;
    }

    @Override
    public String toString() {
        return "Shirt{" +
                "number=" + number +
                ", type='" + type + '\'' +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                '}';
    }
}