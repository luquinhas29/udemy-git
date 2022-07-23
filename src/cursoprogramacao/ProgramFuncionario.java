package cursoprogramacao;

import java.util.Locale;

import java.util.Scanner;

import entities.Funcionario;

public class ProgramFuncionario {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner input = new Scanner(System.in);
		
		Funcionario f = new Funcionario();
		
		System.out.printf("nome: ");
		f.nome = input.nextLine();
		System.out.printf("salario liquido: ");
		f.salarioLiquido = input.nextDouble();
		System.out.printf("imposto: ");
		f.imposto = input.nextDouble();
		
		System.out.println();
		System.out.println("Funcionario: "+f);
		
		System.out.println();
		System.out.printf("Quanto aumantar no salario? ");
		double p = input.nextDouble();
		f.aumentoSalario(p);
		
		
		System.out.println();
		System.out.println("Update Funcionario: "+f);
		
		input.close();
		
	}

}
