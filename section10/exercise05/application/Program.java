package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double temp;
		double greater = 0;
		int position = 0;
		
		System.out.print("How many numbers will you enter? ");
		int quantity = sc.nextInt();
		double[] vect = new double[quantity];
		
		
		for (int i = 0; i < quantity; i++) {
			System.out.print("Enter a number: ");
			vect[i] = sc.nextDouble();
			
			if (i == 0) {
				greater = vect[i];
			}
			
			if (greater < vect[i]) {
				greater = vect[i];
				position = i;
			}
		}
		
		System.out.println();
		System.out.printf("LARGEST VALUE = %.1f%n", greater);
		System.out.printf("POSITION OF LARGEST VALUE = %d%n", position);
		
		sc.close();
	}

}
