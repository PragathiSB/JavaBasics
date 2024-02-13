package bankExercise;

public class BankDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank bank=new Bank();
		SavingsAccount savingacc=new SavingsAccount(12346,7000,"Savings");
		CurrentAccount currentacc=new CurrentAccount(12345,3000,"Current");
        bank.addAccount(currentacc);
        bank.addAccount(savingacc);
        
        System.out.println("your account number:"+savingacc.getAccountNum());
        System.out.println("your account type:"+savingacc.accType);
        savingacc.deposit(2000);
        System.out.println("savings balance after deposit:"+savingacc.viewBalance());
        savingacc.withdraw(500);
        System.out.println("savings balance after withdraw:"+savingacc.viewBalance());
        System.out.println("interest of savings account:");
        savingacc.calculateInterest();
        System.out.println("savings account balance after interest:"+savingacc.viewBalance());
        
        System.out.println("your account number:"+currentacc.getAccountNum());
        System.out.println("your account type:"+currentacc.accType);
        currentacc.deposit(2000);
        System.out.println("current account balance after deposit:"+currentacc.viewBalance());
        currentacc.withdraw(500);
        System.out.println("current account balance after withdraw:"+currentacc.viewBalance());
        System.out.println("interest of current account:");
        currentacc.calculateInterest();
        System.out.println("current account balance after interest:"+currentacc.viewBalance());
        
	}

}
