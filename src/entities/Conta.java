package entities;

public abstract class Conta {
	private int numConta;
	private String titular;
	
	public Conta() {
	}

	public Conta(int numConta, String titular) {
		this.numConta = numConta;
		this.titular = titular;
	}

	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}
	public String toString() {
		return "null";
	}
	
}
