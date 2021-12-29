package digital;

public class CheckingAccount extends Account{
	private static int sequentialCheckingAccount = 0;
	
	public CheckingAccount(Customer customer){
		super(customer);
		super.accountID = sequentialCheckingAccount++;
		super.accountType = "Checking";
		
		
		
	}
}
