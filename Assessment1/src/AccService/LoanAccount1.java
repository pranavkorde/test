package AccService;

public class LoanAccount1 extends BankAccount1{
public LoanAccount1(String accId, String accName) {
		super(accId, accName);
		// TODO Auto-generated constructor stub
	}
double currentLoanBalance;

public double getCurrentLoanBalance() {
	return currentLoanBalance;
}

public void setCurrentLoanBalance(double currentLoanBalance) {
	this.currentLoanBalance = currentLoanBalance;
}
public void depositeAmount(double amt) {
	 currentLoanBalance=10000;
	currentLoanBalance=currentLoanBalance-amt;
	System.out.println(currentLoanBalance);
}
}
