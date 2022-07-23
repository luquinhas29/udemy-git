package cursoprogramacao;

import java.util.Locale;
import java.util.Scanner;

public class NumerosNegativos {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		double[] vect = new double[n];
		
		for(int i=0; i<n; i++) {
			System.out.println("Digite um numero:");
			vect[i] = input.nextDouble();
		}
		
		System.out.println("numeros negativos:");
		for(int i=0; i<n; i++) {
			if(vect[i] < 0) {
				System.out.println(vect[i]);
			}
		}
		

	}

}
