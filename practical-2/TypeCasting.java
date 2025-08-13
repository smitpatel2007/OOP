// Program to demonstrate widening and narrowing typecasting (No user input)
public class TypeCastingDemo {
    public static void main(String[] args) {

        // ----- Widening (automatic type casting) -----
        int intVal = 100;               // int value
        float floatVal = intVal;        // int -> float
        double doubleVal = floatVal;    // float -> double

        System.out.println("Widening Typecasting:");
        System.out.println("int value: " + intVal);
        System.out.println("float value (from int): " + floatVal);
        System.out.println("double value (from float): " + doubleVal);

        // ----- Narrowing (manual type casting) -----
        doubleVal = 123.456;            // double value
        floatVal = (float) doubleVal;   // double -> float
        intVal = (int) floatVal;        // float -> int

        System.out.println("\nNarrowing Typecasting:");
        System.out.println("double value: " + doubleVal);
        System.out.println("float value (from double): " + floatVal);
        System.out.println("int value (from float): " + intVal);
    }
}
