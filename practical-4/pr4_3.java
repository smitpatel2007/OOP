import java.util.Scanner;

class Employee {
    int empId;
    String empName;
    double salary;

    // Method to set details
    void setDetails(int id, String name, double sal) {
        empId = id;
        empName = name;
        salary = sal;
    }

    // Method to display details
    void displayDetails() {
        System.out.println("\n--- Employee Details ---");
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + empName);
        System.out.println("Salary: " + salary);
    }

    // Method to calculate bonus
    void calculateBonus() {
        double bonus = 0.1 * salary;
        System.out.println("Bonus: " + bonus);
    }
}

public class pr4_3 {  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Employee e1 = new Employee();

        
        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();
        sc.nextLine();  // Consume newline

        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Salary: ");
        double salary = sc.nextDouble();

        // Set and display details
        e1.setDetails(id, name, salary);
        e1.displayDetails();
        e1.calculateBonus();

        sc.close();
    }
}
