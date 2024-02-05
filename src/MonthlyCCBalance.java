public class MonthlyCCBalance {
    public static void main(String[] args) {
        // Initial credit card balance
        double initialBalance = 5000.00;

        // Annual interest rate (as a percentage)
        double annualInterestRate = 17.0;

        // Convert annual interest rate to monthly interest rate
        double monthlyInterestRate = (annualInterestRate / 100) / 12;

        // Calculate interest after one month
        double interestAfterOneMonth = initialBalance * monthlyInterestRate;

        // Calculate balance after one month
        double balanceAfterOneMonth = initialBalance + interestAfterOneMonth;

        // Calculate interest after two months
        double interestAfterTwoMonths = balanceAfterOneMonth * monthlyInterestRate;

        // Calculate balance after two months
        double balanceAfterTwoMonths = balanceAfterOneMonth + interestAfterTwoMonths;

        // Output statements
        System.out.println("Interest due after one month: $" + interestAfterOneMonth);
        System.out.println("Balance after one month: $" + balanceAfterOneMonth);
        System.out.println("Interest due after two months: $" + interestAfterTwoMonths);
        System.out.println("Balance after two months: $" + balanceAfterTwoMonths);
    }
}

