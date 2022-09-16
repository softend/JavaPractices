package Practice_3;

public class MovableRectangle  implements Movable{

    protected int xSpeed;
    protected int ySpeed;
    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed){
        topLeft=new MovablePoint(x1,y1, xSpeed,ySpeed);
        bottomRight=new MovablePoint(x2, y2, xSpeed,ySpeed);
    }

    public boolean checkSpeed(){
        return xSpeed==ySpeed;
    }

    @Override
    public String toString() {
        return "MovableRectangle{" +
                "xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                ", topLeft.x=" + topLeft.x +
                ", topLeft.y=" + topLeft.y +
                ", topRight.x=" + bottomRight.x +
                ", topRight.y=" + bottomRight.y +
                '}';
    }

    @Override
    public void moveUp() {
        topLeft.y+=1;
        bottomRight.y+=1;
    }

    @Override
    public void moveDown() {
        topLeft.y-=1;
        bottomRight.y-=1;
    }

    @Override
    public void moveLeft() {
        topLeft.x-=1;
        bottomRight.x-=1;
    }

    @Override
    public void moveRight() {
        topLeft.x+=1;
        bottomRight.x+=1;
    }
}
