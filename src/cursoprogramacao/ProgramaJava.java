package cursoprogramacao;

import java.util.Locale;

import java.util.Scanner;

import entities.Triangle;

public class ProgramaJava {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		
		Scanner input = new Scanner(System.in);
		
		
		Triangle x,y;
		x = new Triangle();
		y = new Triangle();
		
		System.out.println("enter the measures of triangle x");
		x.a = input.nextDouble();
		x.b = input.nextDouble();
		x.c = input.nextDouble();
		
		System.out.println("enter the measures of triangle y");
		y.a = input.nextDouble();
		y.b = input.nextDouble();
		y.c = input.nextDouble();
		
		double areax = x.area();
		
		double areay = y.area();
		
		System.out.printf("Area triangulo X -> %.4f%n",areax);
		System.out.printf("Area triangulo y -> %.4f%n",areay);
		
		if(areax > areay) {
			System.out.println("Area do triangulo x é maior");
		}else {
			System.out.println("Area do triangulo y é maior");
		}
		
		input.close();

	}

}
