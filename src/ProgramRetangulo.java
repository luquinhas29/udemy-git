import java.util.Locale;

import java.util.Scanner;

import entities.Retangulo;

public class ProgramRetangulo {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner input = new Scanner(System.in);
		
		Retangulo x = new Retangulo();
		
		System.out.println("Digite a altura e largura do retangulo:");
		System.out.printf("Altura: ");
		x.altura = input.nextDouble();
		System.out.printf("Largura: ");
		x.largura = input.nextDouble();
		
		System.out.println("Area = "+x.area());
		System.out.println("Perimetro = "+x.perimetro());
		System.out.println("Diagonal = "+x.diagonal());
		
		input.close();
		
	}

}
