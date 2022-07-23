package entities;

public class Accounts {
	
	private Integer number;
	private String holder;
	protected double balance;
	
	public Accounts() {
		
	}

	public Accounts(Integer number, String holder, double balance) {
		
		this.number = number;
		this.holder = holder;
		this.balance = balance;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public double getBalance() {
		return balance;
	}

	public void saque(double valor) {
		this.balance -= valor + 5;
	}
	
	public void deposito(double valor) {
		this.balance += valor;
	}
	
	
	

}
