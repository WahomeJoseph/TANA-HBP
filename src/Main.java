import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main() {
//        variables and constants
        final byte percent = 100;
        final byte months = 12;
        int principal = 0;
        double annualInterestRate = 0;
        double monthlyInterestRate = 0;
        int years = 0;
        int numberOfPayments = 0;
//Inc, current, both,
//        scanner SIN
        Scanner scanner = new Scanner(System.in);

//        user inputs
        while (true) {
            System.out.print("Enter the principal: ");
            principal = scanner.nextInt();

            if (principal >= 1000 && principal <= 1_000_000)
                break;
            System.out.println("Enter a value between 1000 and 1000000");
//            System.out.println();
        };

        while (true) {
            System.out.print("Enter the annual interest rate: ");
            annualInterestRate = scanner.nextDouble();
            if (annualInterestRate >= 1 && annualInterestRate <= 30) {
            monthlyInterestRate = annualInterestRate / percent / months;
                break;
            }
            System.out.println("Enter a value between 1 and 30");
//            System.out.println();
        }

        while (true) {
            System.out.print("Enter the period in years: ");
            years = scanner.nextInt();
            if (years >= 1 && years <= 30) {
                numberOfPayments = years * months;
                break;
            }
            System.out.println("Enter a value between 1 and 30");
        }

//        calculations
        double totalMortgage = principal
                * (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, numberOfPayments)
                / (Math.pow(1+ monthlyInterestRate, numberOfPayments) - 1));

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(totalMortgage);
        System.out.println("Total Mortgage: " + mortgageFormatted);
    };
};
