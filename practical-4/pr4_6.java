class MaxNumber {
    // Method 1: Find max of 2 integers
    int max(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    // Method 2: Find max of 3 integers
    int max(int a, int b, int c) {
        if (a > b && a > c) {
            return a;
        } else if (b > c) {
            return b;
        } else {
            return c;
        }
    }

    // Method 3: Find max of 2 double values
    double max(double a, double b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }
}

public class pr4_6 {  
    public static void main(String[] args) {
        // Create object of MaxNumber class
        MaxNumber m = new MaxNumber();

        // Call from max() method
        System.out.println("Maximum of 20 and 50 = " + m.max(20, 50));
        System.out.println("Maximum of 10, 15 and 55 = " + m.max(10, 15, 55));
        System.out.println("Maximum of 14.3 and 18.2 = " + m.max(14.3, 18.2));
    }
}





// class MaxNumber {

//     int max (int a, int b) {
//         return (a > b) ? a : b;
//     }

//     int max (int a, int b, int c) {
//         int temp = (a > b) ? a : b;
//         return (temp > c) ? temp : c;
//     }

//     double max (double x, double y) {
//         return (x > y) ? x : y;
//     }

// }
