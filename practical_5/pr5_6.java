// Abstract class declaration
abstract class Shape {
    // Abstract method (no body)
    abstract void area();
}

// Subclass for Triangle
class Triangle extends Shape {
    double base, height;

    // Constructor
    Triangle(double b, double h) {
        base = b;
        height = h;
    }

    // Override area() method
    void area() {
        double result = 0.5 * base * height;
        System.out.println("Area of Triangle: " + result);
    }
}

// Subclass for Rectangle
class Rectangle extends Shape {
    double length, breadth;

    Rectangle(double l, double b) {
        length = l;
        breadth = b;
    }

    void area() {
        double result = length * breadth;
        System.out.println("Area of Rectangle: " + result);
    }
}

// Subclass for Circle
class Circle extends Shape {
    double radius;

    Circle(double r) {
        radius = r;
    }

    void area() {
        double result = 3.14 * radius * radius;
        System.out.println("Area of Circle: " + result);
    }
}

// Main class
public class pr5_6 {
    public static void main(String[] args) {
        // Create objects of subclasses
        Triangle t = new Triangle(10, 5);
        Rectangle r = new Rectangle(8, 4);
        Circle c = new Circle(3);

        // Call area methods
        t.area();
        r.area();
        c.area();
    }
}
