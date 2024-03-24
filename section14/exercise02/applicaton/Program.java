package applicaton;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		List<Product> products = new ArrayList<>();
		
		System.out.print("Enter the number of products: ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.printf("Product #%d data:%n", i);
			System.out.print("Common, used or imported (c/u/i)? ");
			char condicao = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Price: ");
			Double price = sc.nextDouble();
			
			if (condicao == 'i') {
				System.out.print("Customs fee: ");
				Double customsFee = sc.nextDouble();
				
				ImportedProduct importedProduct = new ImportedProduct(name, price, customsFee);
				products.add(importedProduct);
			}
			else if (condicao == 'u') {
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				String date = sc.next();
				
				UsedProduct usedproduct = new UsedProduct(name, price, LocalDate.parse(date, fmt));
				products.add(usedproduct);
			} 
			else {
				Product product = new Product(name, price);
				products.add(product);
			}
			
		}
		
		System.out.println();
		System.out.println("PRICE TAGS:");
		for (Product p : products) {
			System.out.println(p.priceTag());
		}
		
		sc.close();
	}	
}

