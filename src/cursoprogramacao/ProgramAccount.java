package cursoprogramacao;

import entities.Accounts;
import entities.BusinnesAccount;
import entities.PoupancAccount;

public class ProgramAccount {

	public static void main(String[] args) {
		
	/*	BusinnesAccount bacc = new BusinnesAccount(1002,"Maria",0.0,500.0);
		Accounts acc = new Accounts(1001,"ALEX",0.0);
		
		Accounts acc1 = bacc;
		Accounts acc2 = new BusinnesAccount(1003,"Bob" , 0, 200.00);
		Accounts acc3 = new PoupancAccount(1004,"Anna", 0.0,0.01);
		
		BusinnesAccount acc4 = (BusinnesAccount)acc2;
		acc4.emprestimo(100.00);
		
		if(acc3 instanceof BusinnesAccount) {
			BusinnesAccount acc5 = (BusinnesAccount)acc3;
			acc5.emprestimo(200.00);
			System.out.println("Emprestimo!");
		}
		
		if(acc3 instanceof PoupancAccount) {
			PoupancAccount acc5 = (PoupancAccount)acc3;
			acc5.saldoAtualizado();
			System.out.println("Saldo Atualizado!");
		}*/
		Accounts acc = new Accounts(1001,"Alex",1000.00);
		acc.saque(200.00);
		System.out.println(acc.getBalance());
		
		Accounts acc1 = new PoupancAccount(1002, "Maria", 1000.00, 0.01);
		acc1.saque(200.00);
		System.out.println(acc1.getBalance());
	}

}
