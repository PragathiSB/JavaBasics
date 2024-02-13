package bankExercise;

public class CurrentAccount implements Account {
	int accountNo;
	int balance;
	String accType;
	public CurrentAccount(int accountNo,int balance,String accType)
	{
		this.accountNo=accountNo;
		this.balance=balance;
		this.accType=accType;
	}
  
	public void deposit(int amount)
	{
		balance+=amount;
	}
	public void withdraw(int amount)
	{
		balance-=amount;
	}
	public double calculateInterest()
	{
		balance+=balance*1.3;
		return balance;
	}
	public int viewBalance()
	{
		return balance;
	}
	
	public int getAccountNum()
	{
		return accountNo;
	}

}
