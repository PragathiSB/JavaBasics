package bankExercise;

import java.util.ArrayList;

public class Bank {

	ArrayList<Account> accounts;
	public Bank()
	{
		this.accounts=new ArrayList<>();
	}
	
	public void addAccount(Account account)
	{
		accounts.add(account);
	}
	
	public ArrayList<Account> getAccount()
	{
		return accounts;
	}
}
