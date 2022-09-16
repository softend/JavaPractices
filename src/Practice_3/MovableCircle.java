package Practice_3;

public class MovableCircle implements Movable{

    protected int x;
    protected int y;
    protected int xSpeed;
    protected int ySpeed;
    protected int radius;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
        this.radius = radius;
    }

    @Override
    public void moveUp() {
        this.y+=1;
    }

    @Override
    public void moveDown() {
        this.y-=1;
    }

    @Override
    public void moveLeft() {
        this.x-=1;
    }

    @Override
    public void moveRight() {
        this.x+=1;
    }
}
