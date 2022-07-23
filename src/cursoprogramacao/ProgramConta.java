package cursoprogramacao;

import java.util.Locale;
import java.util.Scanner;

import entities.Conta;
import entities.ContaCorrente;
import entities.ContaPoupanca;

public class ProgramConta {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		ContaCorrente cc = new ContaCorrente();
		ContaPoupanca cp = new ContaPoupanca();
		
		
		System.out.println("CADASTRAR CONTA:");
		System.out.println("Nome titular da conta:");
		String nome = input.nextLine();
		System.out.println("Entre com o numero da conta:");
		int num = input.nextInt();
		System.out.println("Seu saldo é: 0.0");
		System.out.println("Deseja realizar um deposito inicial? 1-SIM / 2-NAO");
		char ch = input.next().charAt(0);
		if(ch == '1') {
			System.out.print("Digite um valor inicial: ");
			double saldo = input.nextDouble();
			cc.depositar(saldo);
			cc = new ContaCorrente(num, nome,saldo );
			System.out.println("Conta Criada!");
		}
		cp = new ContaPoupanca(num, nome);
		
		System.out.println();
		System.out.println(cc.toString());
		
		System.out.println();
		System.out.println(cp.toString());
		
		System.out.println();
		double valor = input.nextDouble();
		cp.depositar(valor);
		
		System.out.println();
		valor = input.nextDouble();
		cc.sacar(valor);
		
		System.out.println();
		System.out.println(cc.toString());
		
		System.out.println();
		System.out.println(cp.toString());
		
		
	}

}
