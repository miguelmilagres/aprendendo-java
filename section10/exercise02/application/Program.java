package application;

import java.util.Scanner;
import java.util.Locale;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double sum = 0;
		
		System.out.print("How many numbers are you goint to enter? ");
		int quantity = sc.nextInt();
		double[] vect = new double[quantity];
		
		for (int i = 0; i < quantity; i++) {
			System.out.print("Enter a number: ");
			vect[i] = sc.nextInt();
			sum += vect[i];
		}
		
		double average = sum / quantity;
		
		System.out.println();
		System.out.print("VALORES =");
		for (int i = 0; i < quantity; i++) {
			System.out.printf(" %.1f", vect[i]);
		}
		
		System.out.println();
		System.out.printf("SUM = %.2f%n", sum);
		System.out.printf("AVERAGE = %.2f", average);
		
		sc.close();
	}

}
