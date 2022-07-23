package cursoprogramacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class ProgramProduct {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		List<Product> list = new ArrayList<>();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY");
		
		System.out.print("Enter the number of products: ");
		int n = input.nextInt();
		for(int i=1; i<=n; i++) {
			System.out.println("Product #"+i+" data:");
			System.out.print("Common, used or imported (c/u/i)? ");
			char opcao = input.next().charAt(0);
			System.out.print("Name: ");
			input.nextLine();
			String name = input.nextLine();
			System.out.print("Price: ");
			double price = input.nextDouble();
			if(opcao == 'i') {
				System.out.print("Customs fee: ");
				double customsFee = input.nextDouble();
				Product p = new ImportedProduct(name, price, customsFee);
				list.add(p);
		
			}else if(opcao == 'u') {
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				Date data = sdf.parse(input.next());
				Product p = new UsedProduct(name, price, data);
				list.add(p);
				
			}else {
				Product p = new Product(name, price);
				list.add(p);
			}
		}
		System.out.println();
		System.out.println("PRICE TAGS");
		for(Product p : list) {
			System.out.println(p.priceTag());
			
		}
		input.close();

	}

}
