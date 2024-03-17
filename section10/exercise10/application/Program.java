package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Student;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		String name;
		double grade1, grade2;
		boolean approved;
		
		System.out.print("How many students will be entered? ");
		int n = sc.nextInt();
		Student[] student = new Student[n];
		
		for (int i = 0; i < n; i++) {
			System.out.printf("Enter the name, first and second grades of the %dst student:%n", i + 1);
			sc.nextLine();
			name = sc.nextLine();
			grade1 = sc.nextDouble();
			grade2 = sc.nextDouble();
			approved = ((grade1 + grade2)/2 < 6.0) ? false : true;
			
			student[i] = new Student(name, grade1, grade2, approved);
		}
		
		System.out.println("Approved students:");
		for (int i = 0; i < n; i++) {
			if (student[i].isApproved() == true) {
				System.out.println(student[i].getName());
			}
		}
		
		sc.close();
	}

}
