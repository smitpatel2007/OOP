public class AreaPerimeter {
    public static void main(String[] args) {
        // Triangle values
        double base = 5.0;
        double height = 10.0;

        // Rectangle values
        double length = 8.0;
        double breadth = 4.0;

        // Calculate area of triangle
        double area = 0.5 * base * height;

        // Calculate perimeter of rectangle
        double perimeter = 2 * (length + breadth);

        // Display results
        System.out.println("Area of Triangle = " + area);
        System.out.println("Perimeter of Rectangle = " + perimeter);
    }
}

