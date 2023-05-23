import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int Principal;
        float AnnualInterestRate;
        int PeriodInYears;

        Scanner scanner = new Scanner(System.in);

        // Get principal
        System.out.print("Input principal for loan: ");
        Principal = scanner.nextInt();

        // Get Annual Interest Rate
        System.out.print("Input Annual Interest Rate: ");
        AnnualInterestRate = scanner.nextFloat();

        // Get Period (in years)
        System.out.print("Input Period (in years): ");
        PeriodInYears = scanner.nextInt();

        // Change information given into equation-worthy values
        float MonthlyInterest = AnnualInterestRate/100/12; // Transfer into monthly interest, then transfer from number to a percent
        int PeriodInMonths = PeriodInYears*12; // Transfer from years to months
        
        // Calculate mortgage via formula
        double InitialMortgage = Principal * (MonthlyInterest * Math.pow(1 + MonthlyInterest, PeriodInMonths) / (Math.pow(1 + MonthlyInterest, PeriodInMonths) - 1));



        // Transfer InitialMortgage value into a $$$ value
        String FinalMortgage = NumberFormat.getCurrencyInstance().format(InitialMortgage);
        System.out.println("Calculated mortgage: " + FinalMortgage + " per month");

        scanner.close();
    }
}