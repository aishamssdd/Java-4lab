import java.lang.Math;
import java.util.Objects;

public class Circle extends MyShape {
    int xCoordinate;
    int yCoordinate;
    int radius;
    public Circle() {
        xCoordinate = 0;
        yCoordinate = 0;
        radius = 1;
    }
    public Circle(int xCoordinate, int yCoordinate, int radius) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
        this.radius = radius;
    }

    public Circle(String color, boolean filled, int xCoordinate, int yCoordinate, int radius) {
        super(color, filled);
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
        this.radius = radius;
    }

    public int getxCoordinate() {
        return xCoordinate;
    }

    public void setxCoordinate(int xCoordinate) {
        this.xCoordinate = xCoordinate;
    }

    public int getyCoordinate() {
        return yCoordinate;
    }

    public void setyCoordinate(int yCoordinate) {
        this.yCoordinate = yCoordinate;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double getArea() {
        return 3.14 * (radius*radius);
    }

    public double getCircumference() {
        return 2*3.14 * radius;
    }

    double getDistanceTo(Circle anotherCircle) {
        return Math.pow(anotherCircle.getxCoordinate() - xCoordinate, 2) * Math.pow(anotherCircle.getyCoordinate() - yCoordinate, 2);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "xCoordinate=" + xCoordinate +
                ", yCoordinate=" + yCoordinate +
                ", radius=" + radius +
                ", which is subclass of " + super.toString() +
                "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Circle circle = (Circle) o;
        return xCoordinate == circle.xCoordinate && yCoordinate == circle.yCoordinate && radius == circle.radius;
    }

    @Override
    public int hashCode() {
        return Objects.hash(xCoordinate, yCoordinate, radius);
    }
}
