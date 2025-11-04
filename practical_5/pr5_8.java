// Interface declaration
interface Shape {
    void area();
}

// Rectangle class
class Rectangle implements Shape {
    double length, width;

    Rectangle(double l, double w) {
        length = l;
        width = w;
    }

    public void area() {
        double result = length * width;
        System.out.println("Area of Rectangle: " + result);
    }
}

// Triangle class
class Triangle implements Shape {
    double base, height;

    Triangle(double b, double h) {
        base = b;
        height = h;
    }

    public void area() {
        double result = 0.5 * base * height;
        System.out.println("Area of Triangle: " + result);
    }
}

// Sphere class
class Sphere implements Shape {
    double radius;

    Sphere(double r) {
        radius = r;
    }

    public void area() {
        double result = 4 * 3.14 * radius * radius;
        System.out.println("Area of Sphere: " + result);
    }
}

// Main class
public class pr5_8 {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(5, 3);
        Triangle t = new Triangle(4, 6);
        Sphere s = new Sphere(2);

        r.area();
        t.area();
        s.area();
    }
}
