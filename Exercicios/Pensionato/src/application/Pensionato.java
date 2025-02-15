package application;

import util.Aluguel;

import java.util.Scanner;

public class Pensionato {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name, email;
        int number;
        System.out.print("How many rooms will be rented? ");
        int n = sc.nextInt();
        Aluguel[] aluguels = new Aluguel[10];
        System.out.println();

        for (int i = 0; i < n; i++) {
            System.out.println("Rent #" + (i+1));
            sc.nextLine();
            System.out.print("Name: ");
            name = sc.nextLine();
            System.out.print("Email: ");
            email = sc.nextLine();
            System.out.print("Room: ");
            number = sc.nextInt();
            aluguels[number] = new Aluguel(name, email);
            System.out.println();
        }

        System.out.println("Busy rooms:");

        for (int i = 0; i < aluguels.length; i++) {
            if (aluguels[i] != null) {
                System.out.printf("%d: %s, %s%n", i, aluguels[i].getName(), aluguels[i].getEmail());
            }
        }
        sc.close();
    }
}
