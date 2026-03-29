
import java.util.Scanner;

public class BankingApp {

    public static void main(String[] args) throws InsufficientBalanceException {
        int userResponse = 0;
        SavingsAccount savingsAccount = null;
        CurrentAccount currentAccount = null;
        try (Scanner sc = new Scanner(System.in)) {
            while (userResponse != 99) {
                System.out.println("==================================");
                System.out.println("        BANK MANAGEMENT SYSTEM     ");
                System.out.println("==================================");
                System.out.println("1. Create Savings Account");
                System.out.println("2. Deposit in Savings Account");
                System.out.println("3. Withdraw from Savings Account");
                System.out.println("4. Check Savings Account Balance");
                System.out.println("5. Create Current Account");
                System.out.println("6. Deposit in Current Account");
                System.out.println("7. Withdraw from Current Account");
                System.out.println("8. Check Current Account Balance");
                System.out.println("9. Check Saving Account Loan Eligibility");
                System.out.println("10. Calling default method of LoanEligibility interface");
                System.out.println("11. Threading example with Transaction class");
                System.out.println("99. Exit");
                System.out.println("==================================");
                System.out.print("Enter your response: ");
                userResponse = sc.nextInt();
                switch (userResponse) {
                    case 1 -> {
                        System.out.print("Enter account holder name: ");
                        String savingsName = sc.next();
                        System.out.print("Enter initial balance: ");
                        double savingsBalance = sc.nextDouble();
                        savingsAccount = new SavingsAccount(savingsName, savingsBalance);
                        System.out.println("Savings account created for " + savingsName);
                    }
                    case 2 -> {
                        if (savingsAccount == null) {
                            System.out.println("No savings account found. Create one first.");
                            break;
                        }
                        System.out.print("Enter deposit amount: ");
                        savingsAccount.deposit(sc.nextDouble());
                        System.out.println("Deposit successful.");
                    }
                    case 3 -> {
                        if (savingsAccount == null) {
                            System.out.println("No savings account found. Create one first.");
                            break;
                        }
                        if (savingsAccount.balance <= 0) {
                            throw new InsufficientBalanceException("Insufficient balance for withdrawal.");
                        }
                        System.out.print("Enter withdrawal amount: ");
                        savingsAccount.withdraw(sc.nextDouble());
                        System.out.println("Withdrawal successful.");
                    }
                    case 4 -> {
                        if (savingsAccount == null) {
                            System.out.println("No savings account found. Create one first.");
                            break;
                        }
                        savingsAccount.displayBalance();
                    }
                    case 5 -> {
                        System.out.print("Enter account holder name: ");
                        String currentName = sc.next();
                        System.out.print("Enter initial balance: ");
                        double currentBalance = sc.nextDouble();
                        currentAccount = new CurrentAccount(currentName, currentBalance);
                        System.out.println("Current account created for " + currentName);
                    }
                    case 6 -> {
                        if (currentAccount == null) {
                            System.out.println("No current account found. Create one first.");
                            break;
                        }
                        System.out.print("Enter deposit amount: ");
                        currentAccount.deposit(sc.nextDouble());
                        System.out.println("Deposit successful.");
                    }
                    case 7 -> {
                        if (currentAccount == null) {
                            System.out.println("No current account found. Create one first.");
                            break;
                        }
                        System.out.print("Enter withdrawal amount: ");
                        currentAccount.withdraw(sc.nextDouble());
                        System.out.println("Withdrawal successful.");
                    }
                    case 8 -> {
                        if (currentAccount == null) {
                            System.out.println("No current account found. Create one first.");
                            break;
                        }
                        currentAccount.displayBalance();
                    }
                    case 9 -> {
                        if (savingsAccount == null) {
                            System.out.println("No savings account found. Create one first.");
                            break;
                        }
                        System.out.print("Enter income: ");
                        double income = sc.nextDouble();
                        if (savingsAccount.checkLoanEligibility(750, income)) {
                            System.out.println("You are eligible for the loan.");
                        } else {
                            System.out.println("You are not eligible for the loan.");
                        }
                    }
                    case 10 -> {
                        LoanEligibility.info(); // Calling static method of interface	
                        if (savingsAccount != null) {
                            savingsAccount.welcome(); // Calling default method of interface
                        }
                    }
                    case 11 -> {

                        SavingsAccount sa = new SavingsAccount("Sush", 10000);
                        CurrentAccount ca = new CurrentAccount("Priya", 20000);
                        Thread t1 = new Thread(new Transaction(sa));
                        Thread t2 = new Thread(new Transaction(ca));
                        t1.start();
                        t2.start();
                    }
                    case 99 ->
                        System.out.println("Exiting the application. Goodbye!");
                    default ->
                        System.out.println("Invalid response. Please try again.");
                }
            }
        }
    }
}
