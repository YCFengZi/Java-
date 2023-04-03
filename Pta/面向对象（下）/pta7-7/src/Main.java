import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n  = input.nextInt();
        Shape[] shapes = new Shape[n];
        input.nextLine();
        for (int i = 0;i < n;i++) {
            String s = input.next();
            if (s.equals("rect")) {
                shapes[i] = new Rectangle(input.nextInt(),input.nextInt());
                input.nextLine();
            } else if (s.equals("cir")) {
                shapes[i] = new Circle(input.nextInt());
                input.nextLine();
            }
        }
        System.out.println(sumAllperimeter(shapes));
        System.out.println(sumAllArea(shapes));
        System.out.println(Arrays.toString(shapes));
        for (Shape s:shapes) {
            System.out.println(s.getClass() + "," + s.getClass().getSuperclass());
        }
    }
    public static double sumAllArea(Shape[] shapes) {
        double sum = 0;
        for (Shape s:shapes) {
            sum += s.getArea();
        }
        return sum;
    }
    public static double sumAllperimeter(Shape[] shapes) {
        double sum = 0;
        for (Shape s:shapes) {
            sum += s.getPerimeter();
        }
        return sum;
    }
}

abstract class Shape {
    final static double PI = 3.14;
    abstract double getPerimeter();
    abstract double getArea();
}

class Rectangle extends Shape {
    private int width;
    private int length;
    public Rectangle() {
        super();
    }
    public Rectangle(int width, int length) {
        this.width = width;
        this.length = length;
    }
    public int getWidth() {
        return width;
    }
    public void setWidth(int width) {
        this.width = width;
    }
    public int getLength() {
        return length;
    }
    public void setLength(int length) {
        this.length = length;
    }
    @Override
    double getPerimeter() {
        return 2 * (width + length);
    }
    @Override
    double getArea() {
        return width * length;
    }
    @Override
    public String toString() {
        return "Rectangle [" +
                "width=" + width +
                ", length=" + length +
                ']';
    }
}

class Circle extends Shape {
    private int radius;
    public Circle() {
        super();
    }
    public Circle(int radius) {
        this.radius = radius;
    }
    public int getRadius() {
        return radius;
    }
    public void setRadius(int radius) {
        this.radius = radius;
    }
    @Override
    double getPerimeter() {
        return 2 * PI * radius;
    }
    @Override
    double getArea() {
        return PI * radius * radius;
    }
    @Override
    public String toString() {
        return "Circle [" +
                "radius=" + radius +
                ']';
    }
}