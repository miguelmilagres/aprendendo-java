package applicaton;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<TaxPayer> taxPayer = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.println("Tax payer #" + i + " data:");
			System.out.print("Individual or company (i/c)? ");
			char payerType = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Anual income: ");
			double anualIncome = sc.nextDouble();
			
			if (payerType == 'i') {
				System.out.print("Health expenditures: ");
				double healthExpenditures = sc.nextDouble();
				
				Individual individual = new Individual(name, anualIncome, healthExpenditures);
				
				taxPayer.add(individual);
			}
			
			if (payerType == 'c') {
				System.out.print("Number of employees: ");
				int numberOfEmployees = sc.nextInt();
				
				Company company = new Company(name, anualIncome, numberOfEmployees);
				
				taxPayer.add(company);
			}
		}
		
		System.out.println();
		System.out.println("TAXES PAID:");
		double total = 0;
		for (TaxPayer tp : taxPayer) {
			System.out.printf("%s: $ %.2f%n", tp.getName(), tp.tax());
			total += tp.tax();
		}
		
		System.out.println();
		System.out.printf("TOTAL TAXES: $ %.2f", total);
		
		sc.close();
	}	
}

