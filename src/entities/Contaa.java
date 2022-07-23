package entities;

public class Contaa {
	
	private int numConta;
	private String nome;
	private double saldo;
	
	public Contaa(int numConta, String nome) {
		this.numConta = numConta;
		this.nome = nome;
	}
	
	public Contaa(int numConta, String nome, double saldoInicial) {
		this.numConta = numConta;
		this.nome = nome;
		deposito(saldoInicial);
	}
	
	public int getNumConta() {
		return numConta;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSaldo() {
		return saldo;
	}
	
	public void deposito(double valor) {
		this.saldo += valor;
	}
	
	public void saque(double valor) {
		this.saldo -= valor + 5.00;
	}
	public String toString() {
		return "account "
				+this.numConta
				+", holder: "
				+this.nome
				+", Balance $ "
				+this.saldo;
	}

}
