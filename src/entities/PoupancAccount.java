package entities;

public class PoupancAccount extends Accounts {

	private double taxaJuros;
	
	public PoupancAccount() {
		super();
	}
	
	public PoupancAccount(Integer number, String holder, double balance, double taxaJuros) {
		super(number, holder, balance);
		this.taxaJuros = taxaJuros;
	}

	public double getTaxaJuros() {
		return taxaJuros;
	}

	public void setTaxaJuros(double taxaJuros) {
		this.taxaJuros = taxaJuros;
	}

	public void saldoAtualizado() {
		balance += balance * taxaJuros;
	}
	
	@Override
	public void saque(double valor) {
		this.balance -= valor;
	}
}
