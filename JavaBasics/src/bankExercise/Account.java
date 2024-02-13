package bankExercise;

public interface Account {
	public void deposit(int amount);
    public void withdraw(int amount);
    public double calculateInterest();
    public int viewBalance();
}
