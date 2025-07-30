public class StudentInfo {
    public static void main(String[] args) {
      
        if (args.length < 4) {
            System.out.println("Please provide Roll Number, Name, Course, and Semester.");
            return;
        }

 
        String rollNo = args[0];
        String name = args[1];
        String course = args[2];
        String semester = args[3];

        // (a) Print on a single line
        System.out.println("Single Line:");
        System.out.println(rollNo + " " + name + " " + course + " " + semester);

        // (b) Print each on a separate line
        System.out.println("\nSeparate Lines:");
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Course: " + course);
        System.out.println("Semester: " + semester);
    }
}

