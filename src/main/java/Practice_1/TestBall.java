package Practice_1;

public class TestBall {
    public static void main(String[] args) {
        Ball b1 = new Ball ("green", 123);
        System.out.println(b1.getColor());
        b1.setSize(344);
        System.out.println(b1.getSize());
    }
}
