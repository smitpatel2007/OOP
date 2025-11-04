import java.util.Scanner;

public class Box {

    double length;
    double width;
    double height;

    
    public Box() {
        Scanner scanner = new Scanner(System.in);

        //  length
        System.out.print("Enter the length of the box: ");
        length = scanner.nextDouble();

        //  width
        System.out.print("Enter the width of the box: ");
        width = scanner.nextDouble();

        //  height
        System.out.print("Enter the height of the box: ");
        height = scanner.nextDouble();

        scanner.close(); 
    }

    
    public double calculateVolume() {
        return length * width * height;
    }

    // Main method
    public static void main(String[] args) {
        // Create object of Box
        Box myBox = new Box();

       
        double volume = myBox.calculateVolume();
        System.out.println("The volume of the box is: " + volume);
    }
}
