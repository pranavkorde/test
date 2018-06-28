package AccService;

public class SavingAccount1 extends BankAccount1{
public SavingAccount1(String accId, String accName) {
		super(accId, accName);
		// TODO Auto-generated constructor stub
	}
double currentAccountBalance;

public double getCurrentAccountBalance() {
	return currentAccountBalance;
}

public void setCurrentAccountBalance(double currentAccountBalance) {
	this.currentAccountBalance = currentAccountBalance;
}
public void depositeAmount(double amt) {
	 currentAccountBalance=10000;
	 currentAccountBalance=currentAccountBalance+amt;
	System.out.println(currentAccountBalance);
}
}
