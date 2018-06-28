package AccService;

public class Manager1 {
	
	BankAccount1  createAccount(String choice) {
		BankAccount1 ba1;
		if(choice=="loan")
		{
			ba1=new LoanAccount1("acc1", "Chennai");
			return ba1;
		}
		else if(choice=="savings")
		{
			ba1=new SavingAccount1("acc2", "Bangalore");
			return ba1;

		}
		return null;
		
		
	}


}
