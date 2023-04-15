import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<MyShape, String> myHashMap = new HashMap<>();

        Circle myCircle = new Circle(0, 0, 1);
        Rectangle myRectangle = new Rectangle(0,1,3,0);
        Square mySquare = new Square(0, 1, 1);
    /*        System.out.println("Введите координаты и радиус окружности");
            int xCoordinate = sc.nextInt();
            int yCoordinate = sc.nextInt();
            int radius = sc.nextInt();

            Circle myCircle = new Circle(xCoordinate, yCoordinate, radius);
            System.out.println(myCircle);

            System.out.println("Площадь: " + myCircle.getArea());
            System.out.println("Длина окружности: " + myCircle.getCircumference());

            System.out.println("Введите координаты и радиус второй окружности");
            int xCoordinate2 = sc.nextInt();
            int yCoordinate2 = sc.nextInt();
            int radius2 = sc.nextInt();
            Circle secondCircle = new Circle(xCoordinate2, yCoordinate2, radius2);
            System.out.println("расчет расстояния от центра окружности до центра второй окружности: " + myCircle.getDistanceTo(secondCircle));

            System.out.println("Введите координаты первого прямоугольника");
            int x1CoordinateRec = sc.nextInt();
            int x2CoordinateRec = sc.nextInt();
            int y1CoordinateRec = sc.nextInt();
            int y2CoordinateRec = sc.nextInt();

            System.out.println("Введите координаты второго прямоугольника");
            int x1CoordinateRec2 = sc.nextInt();
            int x2CoordinateRec2 = sc.nextInt();
            int y1CoordinateRec2 = sc.nextInt();
            int y2CoordinateRec2 = sc.nextInt();

            Rectangle rectangle1 = new Rectangle(x1CoordinateRec,x2CoordinateRec,y1CoordinateRec,y2CoordinateRec);
            Rectangle rectangle2 = new Rectangle(x1CoordinateRec2,x2CoordinateRec2,y1CoordinateRec2,y2CoordinateRec2);
            System.out.println(rectangle1.getArea());
            System.out.println(rectangle1.getPerimeter());
            System.out.println(rectangle1.getDistanceToTheCenterOf(rectangle2));

            System.out.println("Введите координаты квадрата: ");
            int xTopLeftCoordinate = sc.nextInt();
            int yTopLeftCoordinate = sc.nextInt();
            int sideLength = sc.nextInt();

            Square square = new Square(xTopLeftCoordinate, yTopLeftCoordinate, sideLength);

            System.out.println("Площадь: " + square.getArea());
            System.out.println("Периметр: " + square.getCircumference());
            System.out.println("Цвет: " + square.getColor());
            System.out.println("Закрашен: " + square.isFilled());

            String color = sc.next();
            square.setColor(color);
            System.out.println("Цвет: " + square.getColor());*/
        myHashMap.put(myCircle, "CIRCLES");
        myHashMap.put(myRectangle, "RECTANGLES");
        myHashMap.put(mySquare, "SQUARES");

        System.out.println("INITIAL - " + myHashMap.size() + " " + myHashMap.get(myCircle));

        Circle circleWithSameAttributes = new Circle(0,0,1);
        myHashMap.put(circleWithSameAttributes, "SAME CIRCLES");
        System.out.println("INITIAL - " + myHashMap.size() + " " + myHashMap.get(myCircle));
    }
}