package entities;

public class ContaPoupanca extends Conta{
	private double saldo;
	
	public ContaPoupanca(int numConta, String titular, double saldo) {
		super(numConta, titular);
		this.depositar(saldo);
	}
	public ContaPoupanca(int numConta, String titular) {
		super(numConta, titular);
		this.depositar(saldo);
	}

	public ContaPoupanca() {
	}

	public void depositar(double valor) {
		saldo += valor;
	}
	
	public void sacar(double valor) {
		saldo -= valor;
	}
	
	public void regastar(ContaCorrente cc, double valor) {
		saldo -= valor;
		cc.depositar(valor);
	}
	
	@Override
	public String toString() {
		return "Titular Poupanca: "
				+getTitular()
				+"\nNumero da Conta: "
				+getNumConta()
				+"-1 \nSaldo atual: "
				+this.saldo;
	}
}
