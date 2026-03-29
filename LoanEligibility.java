/* Loan eligibility interface which decide whether to give loan or not
 * An interface is a contract (set of rules) that tells a class:
 *  “You must implement these methods.”
 */
interface LoanEligibility {
	default void welcome(){
		System.out.println("welcome on board");
	}
	static void info() {
		System.out.println("Infomation of loan eligibility");
	}
    boolean checkLoanEligibility(int cibilScore,double income);
}
