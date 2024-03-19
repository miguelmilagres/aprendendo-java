package application;

import java.util.Locale;
import java.util.Scanner;

class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int negativeCounter = 0;

        int n = sc.nextInt();
        int[][] mat = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = sc.nextInt();
                if (mat[i][j] < 0) {
                    negativeCounter++;
                }
            }
        }

        System.out.println("Main diagonal:");
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (i == j) {
                    System.out.print(mat[i][j] + " ");
                }
            }
        }
        
        System.out.println();
        System.out.println("Negative numbers = " + negativeCounter);

        sc.close();
    }
}