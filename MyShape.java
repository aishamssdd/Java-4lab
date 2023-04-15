import java.util.Objects;

public class MyShape {
    private String color;
    private boolean filled;

    public MyShape() {
        color = "red";
        filled = true;
    }

    public MyShape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "MyShape{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyShape myShape = (MyShape) o;
        return color.equals(myShape.getColor()) &&
                filled == myShape.isFilled();
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, filled);
    }
}
