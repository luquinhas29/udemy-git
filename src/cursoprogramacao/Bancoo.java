package cursoprogramacao;

import java.util.Locale;

import java.util.Scanner;

import entities.Contaa;

public class Bancoo {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner input = new Scanner(System.in);
		
		double valor;
		Contaa c1;
		
		System.out.printf("Enter account number: ");
		int num = input.nextInt();
		System.out.printf("Enter account holder: ");
		input.nextLine();
		String nome = input.nextLine();
		System.out.println("Is there na initial deposite (y/n)? ");
		char response = input.next().charAt(0);
		
		if(response == 'y') {
			System.out.printf("Enter Initial deposite value: ");
			valor = input.nextDouble();
			c1 = new Contaa(num, nome, valor);
		}else {
			c1 = new Contaa(num, nome);
		}
		
		System.out.println();
		System.out.println("Account data");
		System.out.println(c1);
		
		System.out.println();
		System.out.printf("Enter a deposite value: ");
		valor = input.nextDouble();
		c1.deposito(valor);
		System.out.println(c1);
		
		System.out.println();
		System.out.printf("Enter a withdraw value: ");
		valor = input.nextDouble();
		c1.saque(valor);
		System.out.println(c1);
		
		input.close();
	}

}
