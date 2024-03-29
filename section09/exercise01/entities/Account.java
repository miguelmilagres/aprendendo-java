package entities;

public class Account {
	private int number;
	private String holder;
	private double balance;

	public Account() {
		
	}
	
	public Account(int number, String holder) {
		this.number = number;
		this.holder = holder;
	}

	public Account(int number, String holder, double balance) {
		this.number = number;
		this.holder = holder;
		deposit(balance);
	}

	public void deposit(double amount) {
		balance += amount;
	}

	public void withdraw(double amount) {
		double temp = (amount == 0) ? 0 : amount + 5;
		balance -= temp; 
	}

	public String toString() {
		return "Account " + number + ", Holder: " + holder + ", Balance: $ " + String.format("%.2f", balance);
	}
}
