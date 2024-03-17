package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Person;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		String name;
		int age;
		
		System.out.print("How many people will you enter: ");
		int n = sc.nextInt();
		Person[] person = new Person[n];
		
		for (int i = 0; i < n; i++) {
			System.out.printf("Data for the %dst person:%n", i + 1);
			sc.nextLine();
			System.out.print("Name: ");
			name = sc.nextLine();
			System.out.print("Age: ");
			age = sc.nextInt();
			
			person[i] = new Person(name, age);
		}
		
		int largestAge = person[0].getAge();
		String oldestPerson = person[0].getName();
		
		for (int i = 1; i < n; i++) {
			if (largestAge < person[i].getAge()) {
				largestAge = person[i].getAge();
				oldestPerson = person[i].getName();
			}
		}
		
		System.out.println("OLDEST PERSON: " + oldestPerson);
		
		sc.close();
	}

}
