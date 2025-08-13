import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

       
        System.out.print("Enter a number: ");
        int num = input.nextInt();

        System.out.println("Factors of " + num + " are:");

        // Loop to find factors
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) { 
                System.out.println(i);
            }
        }
    }
}
