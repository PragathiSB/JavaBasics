package bankExercise;

public class SavingsAccount implements Account{
	int accountNo;
	int balance;
	double interestRate=2.3;
	String accType;
	
	public SavingsAccount(int accountNo,int balance,String accType)
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
        balance+=balance*interestRate;
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
