package cursoprogramacao;

import java.util.Locale;
import java.util.Scanner;

public class DiferencaDoProduto {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner input = new Scanner(System.in);
		
		double a, b, c, d;
		System.out.print("Digite o valor de A -> ");
		a = input.nextDouble();
		System.out.print("Digite o valor de B -> ");
		b = input.nextDouble();
		System.out.print("Digite o valor de C -> ");
		c = input.nextDouble();
		System.out.print("Digite o valor de D -> ");
		d = input.nextDouble();
		double diferenca = ((a * b) - (c * d));
		System.out.println("Diferenca -> "+diferenca);
		
		input.close();

	}

}
