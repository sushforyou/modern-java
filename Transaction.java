class Transaction implements Runnable {
    private BankAccount account;

    public Transaction(BankAccount account) {
        this.account = account;
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) { // loop
            account.deposit(1000);
            account.withdraw(500);
        }
        account.displayBalance();
    }
}