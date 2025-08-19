import java.util.Scanner;

public class TransposeTwoMatrices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matrix1 = new int[3][3];
        int[][] matrix2 = new int[3][3];

        System.out.println("Enter elements for Matrix 1 (3x3):");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter elements for Matrix 2 (3x3):");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix2[i][j] = sc.nextInt();
            }
        }

        //  print matrix 1
        System.out.println("\nMatrix 1:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix1[i][j] + " ");
            }
            System.out.println();
        }

        // print matrix 2
        System.out.println("\nMatrix 2:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix2[i][j] + " ");
            }
            System.out.println();
        }

        // Transpose of Matrix 1
        System.out.println("\nTranspose of Matrix 1:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix1[j][i] + " ");
            }
            System.out.println();
        }

        // Transpose of Matrix 2
        System.out.println("\nTranspose of Matrix 2:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix2[j][i] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
