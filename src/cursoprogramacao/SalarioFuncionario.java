package cursoprogramacao;

import java.util.Locale;
import java.util.Scanner;

public class SalarioFuncionario {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		int num;
		double horast, valorh, salario;
		
		System.out.println("-----Funcionario-----");
		System.out.print("Numero -> ");
		num = input.nextInt();
		System.out.print("Horas trabalhadas -> ");
		horast = input.nextDouble();
		System.out.print("Valor por hora trabalhada -> ");
		valorh =input.nextDouble();
		salario = horast * valorh;
		System.out.println("Number -> "+num);
		System.out.println("Salario -> "+salario);
		
		input.close();

	}

}
