package cursoprogramacao;

import java.util.Locale;

import java.util.Scanner;

import entities.Conta;

public class Banco {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner input = new Scanner(System.in);
		
		Conta c1;
		
		System.out.printf("Numero da conta -> ");
		int num = input.nextInt();
		System.out.printf("Titular da conta -> ");
		input.nextLine();
		String nome = input.nextLine();
		System.out.printf("Deseja realizar um deposito inicial (S/N)?");
		char resposta = input.next().charAt(0);
		
	//	Conta c1 = new Conta(num, nome);
		
		if(resposta == 's') {
			System.out.printf("Valor do deposito inicial -> ");
			double valor = input.nextDouble();
			c1 = new Conta(num, nome, valor);
		}else {
			c1 = new Conta(num, nome);
			
		}
		System.out.println();
		System.out.println("Account data");
		System.out.println(c1.toString());
		
		System.out.println();
		System.out.printf("Deposite um valor: ");
		double valor = input.nextDouble();
		c1.deposito(valor);
		System.out.println("Update account data");
		System.out.println(c1.toString());
		
		System.out.println();
		System.out.printf("Sacar um valor: ");
		valor = input.nextDouble();
		c1.saque(valor);
		System.out.println("Update account data");
		System.out.println(c1.toString());
		
		
		input.close();
	}

}
