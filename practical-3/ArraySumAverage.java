import java.util.Scanner;

public class ArraySumAverage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input: how many numbers
        System.out.print("Enter how many numbers you want to input: ");
        int n = input.nextInt();

        int[] arr = new int[n];
        int sum = 0;

        // Taking array elements from user
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
            sum += arr[i];
        }

        // Calculate average
        double avg = (double) sum / n;

        // Print sum and average
        System.out.println("Sum = " + sum);
        System.out.println("Average = " + avg);

        input.close();
    }
}

