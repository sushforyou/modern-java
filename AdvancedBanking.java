
public class AdvancedBanking {

    public static void main(String... args) {
        SavingsAccount sb = new SavingsAccount("Sushant", 10000);
        sb.displayBalance();
        sb.deposit(2000);
        sb.displayBalance();
        sb.welcome();
        LoanEligibility.info();

        BankAccount acc = new SavingsAccount("Sunil", 10000);
        Transaction t1 = new Transaction(acc);
        Transaction t2 = new Transaction(acc);
        Thread thread1 = new Thread(t1);
        Thread thread2 = new Thread(t2);
        thread1.start();
        thread2.start();
        sb.displayBalance();
    }
}
