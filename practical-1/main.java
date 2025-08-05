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











pr1_5.java
    public class pr1_5
{
public static void main(String[] args)
{
String rollNumber = args[0];
String name = args[1];
String course=args[2];
String semester=args[3];

System.out.println("(a) on a single line:");
System.out.println("rollNumber:" + rollNumber + ", name:" + name +", course:" + course + ", semester:" + semester);

System.out.println("\n(b) Each on a separate line:");
System.out.println("roll Number: " + rollNumber);
System.out.println("name: " + name);
System.out.println("course: " + course);
System.out.println("semester: " + semester);
}
}
