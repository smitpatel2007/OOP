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
        Employee e1 = new Employee();
        e1.setDetails(201, "Rahul", 30000);
        e1.displayDetails();
        e1.calculateBonus();
    }
}

