public class pr6_2 {
    public static void main(String[] args) {
        try {
            int arr[] = {10, 20, 30};

            try {
                int result = arr[2] / 0; // inner exception (Arithmetic)
            } catch (ArithmeticException e) {
                System.out.println("Inner catch: Division by zero");
            }

            System.out.println("Accessing invalid index...");
            System.out.println(arr[5]); // outer exception (ArrayIndexOutOfBounds)

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Outer catch: Array index out of range");
        } catch (Exception e) {
            System.out.println("General Exception caught");
        }

        System.out.println("Program finished normally.");
    }
}
