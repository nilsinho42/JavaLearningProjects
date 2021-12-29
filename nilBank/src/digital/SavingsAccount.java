package digital;

public class SavingsAccount extends Account{
	private static int sequentialSavingsAccount = 1000;
	
	public SavingsAccount(Customer customer){
		super(customer);
		super.accountID = sequentialSavingsAccount++;
		super.accountType = "Savings";
	}
}
