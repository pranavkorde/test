package AccService;

public class TestMain {

	public static void main(String[] args) {

		Manager1 m=new Manager1();
		LoanAccount1 ob1=(LoanAccount1) m.createAccount("loan");
		System.out.println(ob1.accId + " " + ob1.accName);
		System.out.println("the initial Bal was : " + ob1.currentLoanBalance);
		System.out.print("The Updated Balance is : ");
		ob1.depositeAmount(3000);
		
		System.out.println("");
		LoanAccount1 ob2=(LoanAccount1) m.createAccount("savings");
		System.out.println(ob2.accId + " " + ob2.accName);
		System.out.println("the initial Bal was : " + ob2.currentLoanBalance);
		System.out.print("The Updated Balance is : ");
		ob2.depositeAmount(3000);
		
	}


}

