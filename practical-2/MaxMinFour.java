import java.util.Scanner;

public class MaxMinNestedIfElse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input
        System.out.print("Enter first number: ");
        int a = input.nextInt(); 

        System.out.print("Enter second number: ");
        int b = input.nextInt();

        System.out.print("Enter third number: ");
        int c = input.nextInt();

        System.out.print("Enter fourth number: ");
        int d = input.nextInt();

        int max, min;

        // Find maximum
        if (a > b) {
            if (a > c) {
                if (a > d) {
                    max = a;
                } else {
                    max = d;
                }
            } else {
                if (c > d) {
                    max = c;
                } else {
                    max = d;
                }
            }
        } else {
            if (b > c) {
                if (b > d) {
                    max = b;
                } else {
                    max = d;
                }
            } else {
                if (c > d) {
                    max = c;
                } else {
                    max = d;
                }
            }
        }

        // Find minimum
        if (a < b) {
            if (a < c) {
                if (a < d) {
                    min = a;
                } else {
                    min = d;
                }
            } else {
                if (c < d) {
                    min = c;
                } else {
                    min = d;
                }
            }
        } else {
            if (b < c) {
                if (b < d) {
                    min = b;
                } else {
                    min = d;
                }
            } else {
                if (c < d) {
                    min = c;
                } else {
                    min = d;
                }
            }
        }

        // Output
        System.out.println("Maximum number = " + max);
        System.out.println("Minimum number = " + min);
    }
}
