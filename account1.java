package day5;

public class Account {
	private long accNum;
	private double balance;
	private double deposit;
	private double withdraw;


	public double getDeposit() {
		return deposit;
	}


	public void setDeposit(double deposit) {
		this.deposit = deposit;
	}


	public double getWithdraw() {
		return withdraw;
	}


	public void setWithdraw(double withdraw) {
		this.withdraw = withdraw;
	}


	public long getAccNum() {
		return accNum;
	}


	public void setAccNum(long accNum) {
		this.accNum = accNum;
	}


	public double getBalance() {
		return balance;
	}


	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void Deposit() {
		setBalance(getBalance()+getDeposit());
		System.out.println("Deposit is sucessful: "+getDeposit());
	}
	public void Withdraw() {
		setBalance(getBalance()-getWithdraw());
		System.out.println("WithDraw Sucessful: "+getWithdraw());
	}

}
