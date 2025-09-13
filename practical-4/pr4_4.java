class Person {
    String name;
    int age;

    // Constructor with no arguments
    Person() {
        name = "Unknown";
        age = 0;
    }

    // Constructor with one argument
    Person(String n) {
        name = n;
        age = 0;
    }

    // Constructor with two arguments
    Person(String n, int a) {
        name = n;
        age = a;
    }

    // Method to display details
    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}


public class pr4_4 {
    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person("Smit");
        Person p3 = new Person("Rahul", 22);

        p1.display();
        p2.display();
        p3.display();
    }
}

