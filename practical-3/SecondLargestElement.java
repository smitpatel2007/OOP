import java.util.Scanner;

public class SecondLargestElement {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter how many elements you want in the array: ");
        int n = input.nextInt();

        int[] arr = new int[n];

        
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        // Find largest and second largest
        for (int i = 0; i < n; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;   // shift old largest to secondLargest
                largest = arr[i];          // new largest
            } else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }

        System.out.println("Largest = " + largest);
        System.out.println("Second Largest = " + secondLargest);

        input.close();
    }
}
