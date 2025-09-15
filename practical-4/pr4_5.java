import java.util.Scanner;

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
public class Main {  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Shape s = new Shape();

        // Input for Circle
        System.out.print("Enter radius of circle: ");
        double radius = sc.nextDouble();
        s.calculateArea(radius);

        // Input for Square
        System.out.print("Enter side of square: ");
        int side = sc.nextInt();
        s.calculateArea(side);

        // Input for Rectangle
        System.out.print("Enter length of rectangle: ");
        int length = sc.nextInt();
        System.out.print("Enter breadth of rectangle: ");
        int breadth = sc.nextInt();
        s.calculateArea(length, breadth);

        sc.close();
    }
}
