package application;

import java.util.Scanner;
import java.util.Locale;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int counter = 0;
		
		System.out.print("How many numbers are you going to enter? ");
		int quantity = sc.nextInt();
		
		int[] vect = new int[quantity];
		int[] negativeNumber = new int[quantity];
		
		for (int i = 0, n = vect.length; i < n; i++) {
			System.out.print("Enter a number: ");
			vect[i] = sc.nextInt();
			if (vect[i] < 0) {
				negativeNumber[counter] = vect[i];
				counter++;
			}
		}
		
		System.out.println("NUMEROS NEGATIVOS");
		for (int i = 0, n = counter; i < n; i++) {
			System.out.println(negativeNumber[i]);
		}
		
		sc.close();
	}

}
