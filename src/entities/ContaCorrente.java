package entities;

public class ContaCorrente extends Conta{
	private double saldo;
	
	public ContaCorrente() {
	}

	public ContaCorrente(int numConta, String titular, double saldo) {
		super(numConta, titular);
		this.depositar(saldo);
	}

	public double getSaldo() {
		return saldo;
	}
	
	public void depositar(double valor) {
		saldo += valor;
	}
	
	public void sacar(double valor) {
		saldo -= valor;
	}
	
	public void aplicarPoupanca(double valor, ContaPoupanca cp) {
		this.saldo -= valor;
		cp.depositar(valor);
	}
	
	@Override
	public String toString() {
		return "Titular conta corrente: "
				+getTitular()
				+"\nNumero da Conta: "
				+getNumConta()
				+"\nSaldo atual: "
				+getSaldo();
	}
	
}
