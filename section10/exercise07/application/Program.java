package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double sum = 0;
		
		System.out.print("How many elements will the array have? ");
		int N = sc.nextInt();
		double[] vect = new double[N];
		for (int i = 0; i < N; i++) {
			System.out.print("Enter a number: ");
			vect[i] = sc.nextDouble();
			sum += vect[i];
		}
		
		double average = sum/N;
		System.out.println();
		System.out.println("ARRAY AVERAGE = " +String.format("%.3f", average));
		System.out.println("ELEMENTS BELOW AVERAGE");
		for (int i = 0; i < N; i++) {
			if (average > vect[i]) {
				System.out.println(vect[i]);
			}
		}
		
		sc.close();
	}

}
