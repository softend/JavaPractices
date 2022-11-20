package Practice_3;

public class Square extends Rectangle {

    public Square() {
        super(0, 0);
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(color, filled, side, side);
    }

    public double getSide(){
        return getWidth();
    }
    public void setSide(double side){
        setWidth(side);
        setLength(side);
    }

    public void setWidth(double side){
        setSide(side);
    }

    public void setLength(double side){
        setSide(side);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
