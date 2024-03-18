package application;

import java.util.Scanner;
import java.util.Locale;
import entities.Rent;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        String name;
        String email;
        int room;

        System.out.print("How many rooms will be rented? ");
        int n = sc.nextInt();
        Rent[] rent = new Rent[9];

        for (int i = 0; i < n; i++) {
            sc.nextLine();
            System.out.println("Rent #" + (i + 1) +":");
            System.out.print("Name: ");
            name = sc.nextLine();
            System.out.print("Email: ");
            email = sc.nextLine();
            System.out.print("Room: ");
            room = sc.nextInt();
            
            rent[room] = new Rent(name, email);
        }

        System.out.println();
        System.out.println("Busy rooms:");
        for (int i = 0; i < 9; i++) {
            if (rent[i] != null) {
                System.out.println(i + ": " + rent[i]);
            }
        }

        sc.close();
    }
}