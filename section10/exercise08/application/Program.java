package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int evenNumbers = 0;
		int sum = 0;
		
		System.out.print("How many elements will the array have? ");
		int n = sc.nextInt();
		int[] vect = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.print("Enter a number: ");
			vect[i] = sc.nextInt();
			if (vect[i] % 2 == 0) {
				evenNumbers++;
				sum += vect[i];
			}
		}
		
		String message = (evenNumbers == 0) ? "NO EVEN NUMBERS" : String.format("AVERAGE OF THE EVEN NUMBERS = %.2f", (double) sum/evenNumbers);
		System.out.println(message);
		
		sc.close();
	}

}
