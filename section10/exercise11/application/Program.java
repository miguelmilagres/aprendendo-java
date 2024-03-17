package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Person;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double height;
		char gender;
		
		System.out.print("How many people will be entered? ");
		int n = sc.nextInt();
		Person[] person = new Person[n];
		
		for (int i = 0; i < n; i++) {
			System.out.printf("Height of the %d person: ", i + 1);
			height = sc.nextDouble();
			System.out.printf("Gender of the %d person: ", i + 1);
			gender = sc.next().charAt(0);
			
			person[i] = new Person(height, gender);
		}
		
		double shortest = person[0].getHeight();
		double tallest = person[0].getHeight();
		double sumHeightWomen = 0;
		int numberWomen = 0;
		for (int i = 0; i < n; i++) {
			if (shortest > person[i].getHeight()) {
				shortest = person[i].getHeight();
			}
			
			if (tallest < person[i].getHeight()) {
				tallest = person[i].getHeight();
			}
			
			if (person[i].getGender() == 'F') {
				sumHeightWomen += person[i].getHeight();
				numberWomen++;
			}
		}
		
		System.out.printf("Shortest height = %.2f%n", shortest);
		System.out.printf("Tallest height = %.2f%n", tallest);
		System.out.printf("Average height of woman = %.2f%n", sumHeightWomen/numberWomen);
		System.out.printf("Number of men = %d", n - numberWomen);
		
		sc.close();
	}

}
