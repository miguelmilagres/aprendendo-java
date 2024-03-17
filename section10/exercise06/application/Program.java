package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many values will each array have? ");
		int N = sc.nextInt();
		
		int[] vectA = new int[N];
		System.out.println("Enter the values os Array A:");
		for (int i = 0; i < N; i++) {
			vectA[i] = sc.nextInt();
		}
		
		int[] vectB = new int[N];
		System.out.println("Enter the values of Array B:");
		for (int i = 0; i < N; i++) {
			vectB[i] = sc.nextInt();
		}
		
		System.out.println("RESULT ARRAY:");
		for (int i = 0; i < N; i++) {
			System.out.println(vectA[i] + vectB[i]);
		}
		
		sc.close();
	}

}
