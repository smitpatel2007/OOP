
public class pr6_3 {
    public static void main(String[] args) {
        try {
            int arr[] = {1, 2, 3};
            String str = null;

            // Uncomment one at a time to test different exceptions
            int result = 10 / 0;                     // ArithmeticException
            // int number = Integer.parseInt("abc"); // NumberFormatException
            // System.out.println(str.length());     // NullPointerException
            // System.out.println(arr[5]);           // ArrayIndexOutOfBoundsException

        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException");
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException");
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException");
        } finally {
            System.out.println("Finally block always runs!");
        }

        System.out.println("Program ended successfully.");
    }
}
