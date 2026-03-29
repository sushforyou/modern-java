/*
 *An abstract class is used to provide common functionality and enforce rules while allowing subclasses to implement specific behavior.
 *
 */
abstract class BankAccount {
	//Encapsulation → private/protected variables
	protected String accountHolder;
	protected double balance;
	
	//Constructor : abstract class can have contructor
	public BankAccount(String accountHolder,double balance){
		this.accountHolder = accountHolder;
		this.balance = balance;
	}
	
	//Abstact methods
	public abstract void deposit(double amount);
	public abstract void withdraw(double amount);
	
	//Concrete methods
	public void displayBalance() {
        System.out.println(accountHolder + " Balance: " + balance);
    }
		
}