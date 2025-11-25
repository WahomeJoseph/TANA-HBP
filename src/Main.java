import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main() {
//        variables and constants
        final byte percent = 100;
        final byte months = 12;

        Scanner scanner = new Scanner(System.in);

//        user inputs
        System.out.print("Enter the principal: ");
        int principal = scanner.nextInt();

        System.out.print("Enter the annual interest rate: ");
        double annualInterestRate = scanner.nextDouble();
        double monthlyInterestRate = annualInterestRate / percent / months;

        System.out.print("Enter the period in years: ");
        int years = scanner.nextInt();
        int numberOfPayments = years * months;

//        calculations
        ;

        double totalMortgage = principal
                * (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, numberOfPayments)
                / (Math.pow(1+ monthlyInterestRate, numberOfPayments) - 1));

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(totalMortgage);
        System.out.println("Total Mortgage: " + mortgageFormatted);
    };
};