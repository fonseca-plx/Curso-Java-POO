package model.services;

import model.entities.Contract;
import model.entities.Installment;

import java.time.LocalDate;

public class ContractService {

    private OnlinePaymentService onlinePaymentService;

    public ContractService(OnlinePaymentService onlinePaymentService) {
        this.onlinePaymentService = onlinePaymentService;
    }

    public void processContract(Contract contract, Integer months) {

        double valuePerMonth = contract.getTotalValue() / months;

        for (int i = 0; i < months; i++) {
            LocalDate dueDate = contract.getDate().plusMonths(i+1); // data de vencimento de cada parcela
            double amount = valuePerMonth + onlinePaymentService.interest(valuePerMonth, i+1)
                    + onlinePaymentService.paymentFee(valuePerMonth
                    + onlinePaymentService.interest(valuePerMonth, i+1)); // valor da parcela com juros e taxa
            contract.getInstallments().add(new Installment(dueDate, amount)); // add uma parcela a lista de parcelas de cada contrato
        }
    }
}
