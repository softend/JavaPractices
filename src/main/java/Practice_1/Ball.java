package Practice_1;

public class Ball {
    String color;
    int size;

    public Ball(String color, int size) {
        this.color = color;
        this.size = size;
    }

    public Ball(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
