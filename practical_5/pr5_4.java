import java.util.Scanner;

public class pr5_4 {

    public static int[] readData(int size) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[size];

        System.out.println("enter  " + size + " integer value:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        return 0;
    }


    public static float[] readData(float dummy, int size) {
        Scanner scanner = new Scanner(System.in);
        float[] arr = new float[size];

        System.out.println("Enter " + size + " float values:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextFloat();
        }

        return arr;
    }

    
    public static int countOccurrences(int[] arr, int d) {
        int count = 0;
        for (int value : arr) {
            if (value == d) {
                count++;
            }
        }
        return count;
    }

    
    public static int countOccurrences(float[] arr, float d) {
        int count = 0;
        for (float value : arr) {
            if (value == d) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Reading integers
        System.out.print("How many integers you want to enter? ");
        int intSize = sc.nextInt();
        int[] intArray = readData(intSize);

        // Reading floats
        System.out.print("How many float numbers you want to enter? ");
        int floatSize = sc.nextInt();
        float[] floatArray = readData(0.0f, floatSize); 

        // Check in integer array
        System.out.print("Enter an integer to search: ");
        int searchInt = sc.nextInt();
        int intCount = countOccurrences(intArray, searchInt);
        if (intCount > 0) {
            System.out.println(searchInt + " is found " + intCount + " times in the integer array.");
        } else {
            System.out.println(searchInt + " is not found in the integer array.");
        }

        // Check in float array
        System.out.print("Enter a float number to search: ");
        float searchFloat = sc.nextFloat();
        int floatCount = countOccurrences(floatArray, searchFloat);

        if (floatCount > 0) {
            System.out.println(searchFloat + " is found " + floatCount + " times in the float array.");
        } 
        else {
            System.out.println(searchFloat + " is not found in the float array.");
        }

        sc.close();
    }
}
