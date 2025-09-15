

import java.util.Scanner;

class Student {
    String name;
    int id;
    String course;
// set  details
    void setDetails(String n, int i, String c) {
        name = n;
        id = i;
        course = c;
    }
// display  details
    void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Student ID: " + id);
        System.out.println("Course: " + course);
    }
}

public class pr4_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        String name = input.nextLine();

        System.out.print("Enter Student ID: ");
        int id = input.nextInt();
        input.nextLine(); 

        System.out.print("Enter Course: ");
        String course = input.nextLine();

        Student s1 = new Student();
        s1.setDetails(name, id, course);

        System.out.println("\nStudent Details:");
        s1.displayDetails();

        input.close();
    }
}
