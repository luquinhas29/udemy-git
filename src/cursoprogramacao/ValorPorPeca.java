package cursoprogramacao;

import java.util.Locale;

import java.util.Scanner;

public class ValorPorPeca {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		int codigo1, numero1, numero2, codigo2;
		double valor1, valor2, valorPago;
		System.out.print("Codigo 1 -> ");
		codigo1 = input.nextInt();
		System.out.print("Numero 1 -> ");
		numero1 = input.nextInt();
		System.out.print("Valor 1 -> ");
		valor1 = input.nextDouble();
		
		System.out.print("Codigo 2 -> ");
		codigo2 = input.nextInt();
		System.out.print("Numero 2 -> ");
		numero2 = input.nextInt();
		System.out.print("Valor 2 -> ");
		valor2 = input.nextDouble();
		valorPago = ((numero1 * valor1) + (numero2 * valor2));
		System.out.printf("Valor pago -> %.2f %n",valorPago);
		
		input.close();

	}

}
