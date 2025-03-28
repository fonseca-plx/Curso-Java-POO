package application;

import model.entities.Contract;
import model.entities.Installment;
import model.services.ContractService;
import model.services.PaypalService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Informe os dados do contrato");
        System.out.print("Número: ");
        int number = sc.nextInt();
        System.out.print("Data (dd/mm/aaaa): ");
        LocalDate date = LocalDate.parse(sc.next(), formatter);
        System.out.print("Valor do contrato: ");
        double totalValue = sc.nextDouble();

        Contract contract = new Contract(number, date, totalValue);

        System.out.print("Entre com o número de parcelas: ");
        int installmentsNumber = sc.nextInt();

        ContractService contractService = new ContractService();
        contractService.processContract(contract, installmentsNumber, new PaypalService());

        System.out.println("Parcelas:");
        for (Installment installment : contract.getInstallments()) {
            System.out.println(installment);
        }

        sc.close();
    }
}
