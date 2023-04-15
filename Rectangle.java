import java.util.Objects;

public class Rectangle extends MyShape {
    int x1;
    int x2;
    int y1;
    int y2;
    //x1 = левая, x2 = правая
    //y1 = нижняя, y2 = верхняя

    int xCenter = (x1+x2)/2;
    int yCenter = (y1+y2)/2;


    public Rectangle(){
        x1 = 0;
        x2 = 1;
        y1 = 0;
        y2 = -1;
    }
    public Rectangle(int x1, int x2, int y1, int y2) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }

    public Rectangle(String color, boolean filled, int x1, int x2, int y1, int y2) {
        super(color, filled);
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }

    public int getX1() {
        return x1;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public int getX2() {
        return x2;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public int getY1() {
        return y1;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public int getY2() {
        return y2;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }

    public int getxCenter() {
        return xCenter;
    }

    public void setxCenter(int xCenter) {
        this.xCenter = xCenter;
    }

    public int getyCenter() {
        return yCenter;
    }

    public void setyCenter(int yCenter) {
        this.yCenter = yCenter;
    }

    public double getArea(){
        return Math.abs(x1-x2)*Math.abs(y1-y2);
    }

    public double getPerimeter(){
        return (Math.abs(x1-x2) + Math.abs(y1-y2))*2;
    }

    public double getDistanceToTheCenterOf(Rectangle anotherRectangle){
        return Math.sqrt(Math.pow(getxCenter() - anotherRectangle.getxCenter(), 2) + Math.pow(getyCenter() - anotherRectangle.getyCenter(), 2));
    }

    public double getLength() {
        return getX1() - getX2();
    }
    public double getWidth() {
        return getY1() - getY2();
    }



    @Override
    public String toString() {
        return "Rectangle{" +
                "x1=" + x1 +
                ", x2=" + x2 +
                ", y1=" + y1 +
                ", y2=" + y2 +
                ", xCenter=" + xCenter +
                ", yCenter=" + yCenter +
                ", which is subclass of " + super.toString() +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Rectangle rectangle = (Rectangle) o;
        return x1 == rectangle.x1 && x2 == rectangle.x2 && y1 == rectangle.y1 && y2 == rectangle.y2 && xCenter == rectangle.xCenter && yCenter == rectangle.yCenter;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x1, x2, y1, y2, xCenter, yCenter);
    }
}