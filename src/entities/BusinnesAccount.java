package entities;

public class BusinnesAccount extends Accounts {

	private double limiteEmprestimo;
	
	public BusinnesAccount() {
		super();
	}

	public BusinnesAccount(Integer number, String holder, double balance, double limiteEmprestimo) {
		super(number, holder, balance);
		this.limiteEmprestimo = limiteEmprestimo;
	}

	public double getLimiteEmprestimo() {
		return limiteEmprestimo;
	}

	public void setLimiteEmprestimo(double limiteEmprestimo) {
		this.limiteEmprestimo = limiteEmprestimo;
	}
	
	public void emprestimo(double valor) {
		if(valor <= limiteEmprestimo) {
			balance += valor - 10.00;
		}
	}
	
	
}
