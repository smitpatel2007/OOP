interface A {
    void methodA(); // abstract method
}

interface B {
    void methodB(); // abstract method
}

// Interface C extends both A and B (Multiple Inheritance in Interfaces)
interface C extends A, B {
    void methodC();
}

// Class D implements Interface C
class D implements C {
    public void methodA() {
        System.out.println("Method A from Interface A");
    }

    public void methodB() {
        System.out.println("Method B from Interface B");
    }

    public void methodC() {
        System.out.println("Method C from Interface C");
    }

    void displayD() {
        System.out.println("This is Class D implementing Interface C");
    }
}

// Class E extends Class D
class E extends D {
    void displayE() {
        System.out.println("This is Class E extending Class D");
    }
}

// Main class
public class pr5_9 {
    public static void main(String[] args) {
        // Create object of Class E
        E obj = new E();

        // Call all interface methods (inherited from Class D)
        obj.methodA();
        obj.methodB();
        obj.methodC();

        // Call class methods
        obj.displayD();
        obj.displayE();
    }
}
