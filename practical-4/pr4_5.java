
class Shape {
    // Area of circle
    void calculateArea(double radius) {
        double area = 3.14 * radius * radius;
        System.out.println("Area of Circle: " + area);
    }

    // Area of square
    void calculateArea(int side) {
        int area = side * side;
        System.out.println("Area of Square: " + area);
    }

    // Area of rectangle
    void calculateArea(int length, int breadth) {
        int area = length * breadth;
        System.out.println("Area of Rectangle: " + area);
    }
}


public class pr4_5 {
    public static void main(String[] args) {
        Shape s = new Shape();
        s.calculateArea(5.0);     // Circle
        s.calculateArea(4);       // Square
        s.calculateArea(5, 3);    // Rectangle
    }
}

