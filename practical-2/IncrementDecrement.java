import java.util.Scanner;

public class IncrementDecrement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter value of x: ");
        int x = input.nextInt();

        // Pre-increment (++x): increases x first, then uses it
        System.out.println(++x); // x increased by 1, then printed

        // Post-decrement (x--): uses x first, then decreases it
        System.out.println(x--); // prints current x, then decreases

        // Print current value of x
        System.out.println(x);   // prints updated x

        // Pre-decrement (--x): decreases x first, then uses it
        System.out.println(--x); // x decreased by 1, then printed

        // Post-increment (x++): uses x first, then increases it
        System.out.println(x++); // prints current x, then increases

        // Print final value of x
        System.out.println(x);   // prints updated x

        input.close();
    }
}
