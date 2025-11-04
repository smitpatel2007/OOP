// First interface
interface A {
    void showA();
}

// Second interface
interface B {
    void showB();
}

// Class implementing both interfaces
class C implements A, B {
    public void showA() {
        System.out.println("This is method from Interface A");
    }

    public void showB() {
        System.out.println("This is method from Interface B");
    }

    void display() {
        System.out.println("Class C implements both A and B (Multiple Inheritance achieved)");
    }
}

// Main class
public class pr5_7 {
    public static void main(String[] args) {
        C obj = new C();
        obj.showA();
        obj.showB();
        obj.display();
    }
}
