package InternSavy;

import java.util.Scanner;

public class CurrencyConverter  {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // prompt the user to enter the amount and currency code
        System.out.print("Enter the amount: ");
        double amount = input.nextDouble();
        System.out.print("Enter the currency code (e.g. USD, EUR, GBP): ");
        String currencyCode = input.next().toUpperCase();

        // prompt the user to enter the target currency code
        System.out.print("Enter the target currency code (e.g. USD, EUR, GBP): ");
        String targetCode = input.next().toUpperCase();

        // calculate the exchange rate
        double exchangeRate;
        switch (currencyCode) {
            case "USD":
                switch (targetCode) {
                    case "EUR":
                        exchangeRate = 0.83;
                        break;
                    case "GBP":
                        exchangeRate = 0.72;
                        break;
                    default:
                        exchangeRate = 1.0;
                        break;
                }
                break;
            case "EUR":
                switch (targetCode) {
                    case "USD":
                        exchangeRate = 1.21;
                        break;
                    case "GBP":
                        exchangeRate = 0.86;
                        break;
                    default:
                        exchangeRate = 1.0;
                        break;
                }
                break;
            case "GBP":
                switch (targetCode) {
                    case "USD":
                        exchangeRate = 1.39;
                        break;
                    case "EUR":
                        exchangeRate = 1.17;
                        break;
                    default:
                        exchangeRate = 1.0;
                        break;
                }
                break;
            default:
                exchangeRate = 1.0;
                break;
        }

        // calculate the result
        double result = amount * exchangeRate;

        // display the result
        System.out.printf("%.2f %s = %.2f %s", amount, currencyCode, result, targetCode);
    }
}

