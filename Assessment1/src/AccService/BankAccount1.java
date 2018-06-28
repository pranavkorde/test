package AccService;

public abstract class BankAccount1 implements AccountService1{

	String accId;
	String accName;
	public BankAccount1(String accId, String accName) {
		super();
		this.accId = accId;
		this.accName = accName;
	}
	public String getAccId() {
		return accId;
	}
	public void setAccId(String accId) {
		this.accId = accId;
	}
	public String getAccName() {
		return accName;
	}
	public void setAccName(String accName) {
		this.accName = accName;
	}
	public void depositeAmount(double amt) {
	}
	
}
