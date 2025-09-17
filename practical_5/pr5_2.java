import java.util.Scanner;

public class pr5_2 {

    // Inner Exam class
    static class Exam {
        String stu_name;
        int rollno;
        String sub_code;
        String sub_name;
        int InternalMarks;
        int ExternalMarks;
        int totalMarks;

        // Parameterized constructor (no 'this' keyword)
        Exam(String name, int roll, String code, String subject, int internal, int external) {
            stu_name = name;
            rollno = roll;
            sub_code = code;
            sub_name = subject;
            InternalMarks = internal;
            ExternalMarks = external;
        }

        // Method to calculate total marks
        void Calculate_result() {
            totalMarks = InternalMarks + ExternalMarks;
        }

        // Method to display result
        void Show_result() {
            System.out.println("\n--- Student Result ---");
            System.out.println("Student Name   : " + stu_name);
            System.out.println("Roll Number    : " + rollno);
            System.out.println("Subject Code   : " + sub_code);
            System.out.println("Subject Name   : " + sub_name);
            System.out.println("Internal Marks : " + InternalMarks);
            System.out.println("External Marks : " + ExternalMarks);
            System.out.println("Total Marks    : " + totalMarks);
            System.out.println("----------------------------");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine(); // clear buffer

        // Create array to hold Exam objects
        Exam[] students = new Exam[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Student " + (i + 1));

            System.out.print("Enter Student Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Roll Number: ");
            int roll = sc.nextInt();
            sc.nextLine(); 

            System.out.print("Enter Subject Code: ");
            String code = sc.nextLine();

            System.out.print("Enter Subject Name: ");
            String subject = sc.nextLine();

            System.out.print("Enter Internal Marks: ");
            int internal = sc.nextInt();

            System.out.print("Enter External Marks: ");
            int external = sc.nextInt();
            sc.nextLine();

            // Create Exam object and store in array
            students[i] = new Exam(name, roll, code, subject, internal, external);
        }

        // Calculate and show results
        for (int i = 0; i < n; i++) {
            students[i].Calculate_result();
            students[i].Show_result();
        }

        sc.close();
    }
}
