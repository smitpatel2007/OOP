import java.util.Scanner;
public class MergeArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // First array
        System.out.print("Enter size of first array: ");
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        System.out.println("Enter elements of first array:");
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }

        // Second array
        System.out.print("Enter size of second array: ");
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        System.out.println("Enter elements of second array:");
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }

        // Merge arrays
        int[] merged = new int[n1 + n2];
        int k = 0;
        for (int i = 0; i < n1; i++) merged[k++] = arr1[i];
        for (int i = 0; i < n2; i++) merged[k++] = arr2[i];

        // Sort (simple bubble sort)
        for (int i = 0; i < merged.length; i++) {
            for (int j = i + 1; j < merged.length; j++) {
                if (merged[i] > merged[j]) {
                    int temp = merged[i];
                    merged[i] = merged[j];
                    merged[j] = temp;
                }
            }
        }

        // Print
        System.out.println("Merged Array in Ascending Order:");
        for (int i = 0; i < merged.length; i++) {
            System.out.print(merged[i] + " ");
        }

        sc.close();
    }
}
