class CurrentAccount extends BankAccount implements LoanEligibility {
     CurrentAccount(String accountHolder, double balance){
		 //super() is used to call the parent class constructor and initialize inherited properties.
		super(accountHolder, balance);
	 }
	 @Override
	 public void deposit(double amount) {
		 balance+= amount;
	 }
	 @Override
     public void withdraw(double amount) {
		  balance-= amount;
	 }
	 @Override
	 public boolean checkLoanEligibility(int cibilScore, double income) {
        // RBI-like rule: minimum CIBIL 750
        return cibilScore >= 750 && income > 25000;
    }
}
