package application;

import util.CurrencyConverter;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("What is the dollar price? ");
        double dollarPrice = sc.nextDouble();
        System.out.print("How many dollars will be bought? ");
        double amount = sc.nextDouble();
        System.out.printf("Amount to be paid in reais = %.2f%n", CurrencyConverter.converter(amount, dollarPrice));
        sc.close();
    }
}
