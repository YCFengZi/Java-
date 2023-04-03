import java.lang.reflect.Constructor;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int type = input.nextInt();
        switch (type) {
            case 1:
                double radius = input.nextDouble();
                if (radius < 0.0) {
                    System.out.println("Wrong Format");
                } else {
                    Circle circle = new Circle();
                    circle.setRadius(radius);
                    System.out.printf("Circle's area:%.2f",circle.getArea());
                }
                break;
            case 2:
                double width = input.nextDouble();
                double length = input.nextDouble();
                if (width < 0.0 || length < 0.0) {
                    System.out.println("Wrong Format");
                } else {
                    Rectangle rectangle = new Rectangle();
                    rectangle.setWidth(width);
                    rectangle.setLength(length);
                    System.out.printf("Rectangle's area:%.2f",rectangle.getArea());
                }
                break;
            case 3:
                double radius1 = input.nextDouble();
                if (radius1 < 0.0) {
                    System.out.println("Wrong Format");
                } else {
                    Ball ball = new Ball();
                    ball.setRadius(radius1);
                    System.out.printf("Ball's surface area:%.2f\n",ball.getArea());
                    System.out.printf("Ball's volume:%.2f",ball.getVolume());
                }
                break;
            case 4:
                double width1 = input.nextDouble();
                double length1= input.nextDouble();
                double height1 = input.nextDouble();
                if (width1 < 0.0 || length1 < 0.0 || height1 < 0.0) {
                    System.out.println("Wrong Format");
                } else {
                    Box box = new Box();
                    box.setWidth(width1);
                    box.setLength(length1);
                    box.setHeight(height1);
                    System.out.printf("Box's surface area:%.2f\n",box.getArea());
                    System.out.printf("Box's volume:%.2f",box.getVolume());
                }
                break;
            default:
                System.out.println("Wrong Format");
        }
    }
}

class Shape {
    public Shape() {
        System.out.println("Constructing Shape");
    }
    public double getArea() {
        return 0.0;
    }
}

class Circle extends Shape{
    private double radius;

    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }


    public Circle() {
        System.out.println("Constructing Circle");
    }
    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }
}

class Rectangle extends Shape{
    private double width;
    private double length;

    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }

    public Rectangle() {
        System.out.println("Constructing Rectangle");
    }
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    @Override
    public double getArea() {
        return this.width * this.length;
    }
}

class Ball extends Circle {
    public Ball() {
        System.out.println("Constructing Ball");
    }

    @Override
    public double getArea() {
        return 4.0 * super.getArea();
    }
    public double getVolume() {
        double r2=getRadius();
        return 4.0/3.0*r2*r2*r2*Math.PI;
    }
}

class Box extends Rectangle {
    private double height;

    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }

    public Box() {
        System.out.println("Constructing Box");
    }
    public Box(double width, double length, double height) {
        super(width, length);
        this.height = height;
    }

    @Override
    public double getArea() {
        double w2=getWidth();
        double l2=getLength();
        return 2*(w2*l2+w2*height+l2*height);
    }
    public double getVolume() {
        return super.getArea() * height;
    }
}