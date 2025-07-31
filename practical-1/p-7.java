public class AreaPerimeter {
    public static void main(String[] args) {

        // Scanner object for user input (without import line)
        java.util.Scanner input = new java.util.Scanner(System.in);

        // Get triangle values from user
        System.out.print("Enter base of triangle: ");
        double base = input.nextDouble();

        System.out.print("Enter height of triangle: ");
        double height = input.nextDouble();

        // Get rectangle values from user
        System.out.print("Enter length of rectangle: ");
        double length = input.nextDouble();

        System.out.print("Enter breadth of rectangle: ");
        double breadth = input.nextDouble();

        // Calculate area of triangle
        double area = 0.5 * base * height;

        // Calculate perimeter of rectangle
        double perimeter = 2 * (length + breadth);

        // Display results
        System.out.println("Area of Triangle = " + area);
        System.out.println("Perimeter of Rectangle = " + perimeter);
    }
}
