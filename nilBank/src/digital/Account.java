package digital;

public abstract class Account implements IAccount {
	protected static int stdBrandID = 1;
	
	protected int branchID;
	protected int accountID;
	protected String accountType;
	protected Customer customer;
	
	protected double AccountBalance;
	
	public Account(Customer customer) {
		this.branchID = Account.stdBrandID;
		this.customer = customer;

	}
	
	public int getBranchID() {
		return branchID;
	}

	public int getAccountID() {
		return accountID;
	}

	public double getAccountBalance() {
		return AccountBalance;
	}

	@Override
	public void withdraw(double amount) {
		AccountBalance -= amount;
	}

	@Override
	public void deposit(double amount) {
		AccountBalance += amount;
	}

	@Override
	public void transfer(double amount, Account accountReceiver) {
		this.withdraw(amount);
		accountReceiver.deposit(amount);
		
		
	}
	
	public void bankStatement() {
		System.out.println(" ***** Account Statement *****");
		System.out.println(" Customer: " + customer.getCustomerName());
		System.out.println(" Account Type: " + accountType);
		System.out.println(" Branch ID: " + branchID);
		System.out.println(" Account ID: " + accountID);
		System.out.println(" Balance: " + AccountBalance);
				
	}
}
