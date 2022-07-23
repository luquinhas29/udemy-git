package cursoprogramacao;

import java.util.Locale;
import java.util.Scanner;

public class AreaDeUmCirculo {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner input = new Scanner(System.in);
		
		double area, r;
		double p = 3.14159;
		
		System.out.print("Digite o valor da raio ->");
		r = input.nextDouble();
		
		area = p * (r = Math.pow(r, 2));
		System.out.printf("Area -> %.4f %n",area);
		
		input.close();
		
	}

}
