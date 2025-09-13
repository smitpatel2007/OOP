class Student {
    String name;
    int id;
    String course;

    // Method to set details
    void setDetails(String n, int i, String c) {
        name = n;
        id = i;
        course = c;
    }

    // Method to display details
    void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Student ID: " + id);
        System.out.println("Course: " + course);
    }
}

public class pr4_1 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setDetails("Smit", 101, "Computer Science");
        s1.displayDetails();
    }
}

