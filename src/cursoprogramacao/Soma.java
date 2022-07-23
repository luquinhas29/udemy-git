package cursoprogramacao;

import java.util.Scanner;

public class Soma {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int x, y, soma;
		System.out.print("Digite o valor de x -> ");
		x = input.nextInt();
		System.out.print("Digite o valor de y -> ");
		y = input.nextInt();
		soma = x + y;
		System.out.println("Soma -> "+soma);
		
		input.close();

	}

}
