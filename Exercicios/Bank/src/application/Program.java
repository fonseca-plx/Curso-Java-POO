package application;

import entities.Account;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter account number: ");
        int accountNumber = sc.nextInt();
        System.out.print("Enter account holder: ");
        String accountHolder = sc.next();
        System.out.print("Is there an initial deposit? (y/n) ");
        char response = sc.next().charAt(0);

        if (response == 'y') {
            System.out.print("Enter initial deposit value: ");
            double amount = sc.nextDouble();
            Account account = new Account(accountNumber, accountHolder, amount);

            System.out.println();
            System.out.println("Account data:");
            System.out.println(account.toString());
            System.out.println();

            System.out.print("Enter a deposit value: ");
            amount = sc.nextDouble();
            account.deposit(amount);
            System.out.println("Updated account data:");
            System.out.println(account.toString());
            System.out.println();

            System.out.print("Enter a withdraw value: ");
            amount = sc.nextDouble();
            account.withdraw(amount);
            System.out.println("Updated account data:");
            System.out.println(account.toString());
        } else {
            Account account = new Account(accountNumber, accountHolder);

            System.out.println();
            System.out.println("Account data:");
            System.out.println(account.toString());
            System.out.println();

            System.out.print("Enter a deposit value: ");
            double amount = sc.nextDouble();
            account.deposit(amount);
            System.out.println("Updated account data:");
            System.out.println(account.toString());
            System.out.println();

            System.out.print("Enter a withdraw value: ");
            amount = sc.nextDouble();
            account.withdraw(amount);
            System.out.println("Updated account data:");
            System.out.println(account.toString());
        }

        sc.close();
    }
}
