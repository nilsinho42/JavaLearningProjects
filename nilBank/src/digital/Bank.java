package digital;

import java.util.List;

public class Bank {
	private String bankName;
	private List<Account> accounts;
	
	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public void setAccounts(List<Account> accounts) {
		this.accounts = accounts;
	}
	
	
}
