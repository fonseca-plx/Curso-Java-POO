package util;

public class CurrencyConverter {

    public static double IOF = 0.06;

    public static double converter(double amount, double dollarPrice) {
        return amount * (1 + IOF) * dollarPrice;
    }
}
