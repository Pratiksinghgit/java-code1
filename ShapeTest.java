// Abstract Class: Shape
abstract class Shape {
    public abstract double area();
}

// Subclass: Circle
class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}

// Subclass: Rectangle
class Rectangle extends Shape {
    private double length, width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double area() {
        return length * width;
    }
}

public class ShapeTest {
    public static void main(String[] args) {
        Shape s1 = new Circle(5);
        Shape s2 = new Rectangle(4, 6);

        System.out.println("Area of Circle: " + s1.area()); // Output: Circle area
        System.out.println("Area of Rectangle: " + s2.area()); // Output: Rectangle area
    }
}
