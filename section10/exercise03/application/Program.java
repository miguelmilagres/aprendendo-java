package application;

import java.util.Scanner;
import java.util.Locale;
import entities.Person;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		String name;
		int age;
		int under16 = 0;
		double height;
		double totalHeight = 0;
		
		System.out.print("How many people will be entered? ");
		int quantity = sc.nextInt();
		Person[] person = new Person[quantity];
		for (int i = 0; i < quantity; i++) {
			System.out.printf("Data for the %dst person:%n", i + 1);
			sc.nextLine();
			System.out.print("Name: ");
			name = sc.nextLine();
			System.out.print("Age: ");
			age = sc.nextInt();
			System.out.print("Height: ");
			height = sc.nextDouble();
			
			under16 += (age < 16) ? 1 : 0;
			totalHeight += height;
			
			person[i] = new Person(name, age, height);
		}
		
		System.out.println();
		System.out.print("Average height: ");
		System.out.printf("%.2f%n", totalHeight/quantity);
		System.out.printf("People under 16 years old: %.1f%%%n", 100.0 * under16 / quantity);
		for (int i = 0, n = person.length; i < n; i++) {
			if (person[i].getAge() < 16) {
				System.out.println(person[i].getName());
			}
		}
		
		sc.close();
	}

}
