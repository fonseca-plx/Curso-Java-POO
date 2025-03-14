package application;

import entities.Account;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter account data");
            System.out.print("Number: ");
            int number = sc.nextInt();
            System.out.print("Holder: ");
            sc.nextLine();
            String holder = sc.nextLine();
            System.out.print("Initial balance: ");
            double initialBalance = sc.nextDouble();
            System.out.print("Withdraw limit: ");
            double withdrawLimit = sc.nextDouble();

            Account account = new Account(number, holder, initialBalance, withdrawLimit);

            System.out.print("Enter amount for withdraw: ");
            double amount = sc.nextDouble();
            account.withdraw(amount);

            System.out.print("New balance: " + account.getBalance());
        } catch (InputMismatchException e) {
            System.out.println("Input mismatch. Try again");
        } catch (IllegalArgumentException e) {
            System.out.println("Withdraw error: " + e.getMessage());
        }
    }
}
