package digital;

import java.io.IOException;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		int answer = 0;
		String name;
		char accountType = 'X';
		char anscontinue = 'X';

		
		while (answer != 9) {
			System.out.println(" ***** Menu *****");
			System.out.println(" ** [1] Create Account **");
			System.out.println(" ** [2] Withdraw **");
			System.out.println(" ** [3] Deposit **");
			System.out.println(" ** [4] Transfer **");
			System.out.println(" ** [5] List all customers **");
			System.out.println(" ** ***** **");
			System.out.println(" ** [9] EXIT SYSTEM **");
			answer = Integer.parseInt(scan.next());
			
			switch(answer) {
				case 1:
		            Runtime.getRuntime().exec("clear");
		           
					System.out.println(" ***** ***** *****");
					System.out.println(" ** [1] Create Account **");
					System.out.println(" ***** ***** *****");
					System.out.println(" ** [9] EXIT SYSTEM **");
					
					System.out.println(" ***** ***** *****");
					System.out.println(" ** Customer Name: **");
					name = scan.next();
					while(accountType != 'C' && accountType != 'S') {
						System.out.println(" ** Account Type [C - Checking // S - Savings]: **");
						accountType = scan.next().charAt(0);
					}
					
					Customer new_customer = new Customer();
					new_customer.setCustomerName(name);
					if (accountType == 'S') {
						Account account = new SavingsAccount(new_customer);
						account.bankStatement();
					}
					else if (accountType == 'C') {
						Account account = new CheckingAccount(new_customer);
						account.bankStatement();
					}
					else
					{
						System.out.println(" ** Account Type Error **");
						break;
					}
					
					accountType = 'X';
					anscontinue = 'X';
					
					System.out.println(" ***** Continue? [Y - Yes // N - No] *****");
					anscontinue = scan.next().charAt(0);
					if (anscontinue == 'N') answer = 9;
			}
		}
	}
}