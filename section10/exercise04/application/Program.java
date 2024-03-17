package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int evenNumbers = 0;
		
		System.out.print("How many numbers will you enter? ");
		int quantity = sc.nextInt();
		int[] vect = new int[quantity];
		
		
		for (int i = 0; i < quantity; i++) {
			System.out.print("Enter a number: ");
			vect[i] = sc.nextInt();
		}
		
		System.out.println();
		System.out.println("EVEN NUMBERS:");
		for (int i = 0; i < quantity; i++) {
			if (vect[i] % 2 == 0) {
				System.out.printf("%d ", vect[i]);
				evenNumbers++;
			}
		}
		
		System.out.printf("%n%n");
		System.out.printf("NUMBER OF EVENS = %d", evenNumbers);
		
		sc.close();
	}

}
