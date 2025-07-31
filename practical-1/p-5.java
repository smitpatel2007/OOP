import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  // Create Scanner object

        // Take user input
        System.out.print("Enter your name: ");
        String name = input.nextLine();

        System.out.print("Enter your roll number: ");
        String rollNo = input.nextLine();

        System.out.print("Enter your course: ");
        String course = input.nextLine();

        System.out.print("Enter your semester: ");
        String semester = input.nextLine();

        // Print user details
        System.out.println("\n=== Student Details ===\n");
        System.out.println("Name: " + name +"  Roll No: " +rollNo+"  Course: " + course+"  Semester: " + semester);
        
        
        System.out.println("\n\nName      : " + name);
        System.out.println("Roll No   : " + rollNo);
        System.out.println("Course    : " + course);
        System.out.println("Semester  : " + semester);

        input.close();  // Close scanner
    }
}
