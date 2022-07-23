package cursoprogramacao;

import java.util.Locale;

import java.util.Scanner;

import entities.Product;

public class PrincipalProduto {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter product data:");
		System.out.printf("nome = ");
		String nome = input.nextLine();
		System.out.printf("preco = ");
		double preco = input.nextDouble();
		System.out.printf("qtd no estoque = ");
		int qtd = input.nextInt();
		
		Product x = new Product(nome, preco, qtd);
		
		x.setNome("Computer");
		System.out.println("update Product "+x.getNome());
		
		System.out.println();
		System.out.println("product data: "+x);
		
		System.out.println();
		System.out.printf("numero de produtos add no estoque: ");
		qtd = input.nextInt();
		x.addProdutos(qtd);

		
		System.out.println();
		System.out.println("update data: "+x);
		
		System.out.println();
		System.out.printf("numero de produtos removidos do estoque: ");
		qtd = input.nextInt();
		x.removeProdutos(qtd);

		
		System.out.println();
		System.out.println("product data: "+x);
		
		input.close();

	}

}
