import java.util.Scanner;

public class MaxMinFour {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter four numbers: ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int d = input.nextInt();

        // Max
        int max;
        if (a > b)
            if (a > c)
                if (a > d)
                    max = a;
                else
                    max = d;
            else if (c > d)
                max = c;
            else
                max = d;
        else if (b > c)
            if (b > d)
                max = b;
            else
                max = d;
        else if (c > d)
            max = c;
        else
            max = d;

        // Min
        int min;
        if (a < b)
            if (a < c)
                if (a < d)
                    min = a;
                else
                    min = d;
            else if (c < d)
                min = c;
            else
                min = d;
        else if (b < c)
            if (b < d)
                min = b;
            else
                min = d;
        else if (c < d)
            min = c;
        else
            min = d;

        System.out.println("Maximum = " + max);
        System.out.println("Minimum = " + min);
    }
}
