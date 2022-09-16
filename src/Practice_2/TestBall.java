package Practice_2;

public class TestBall {
    public static void main(String[] args) {
        Ball ball = new Ball(19,14);
        ball.move(1,-2);
        System.out.println(ball.toString());
    }
}
