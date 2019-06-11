package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("entre com o nome do produto");
		System.out.print("name: ");
	    String name = sc.next();
		System.out.print("price: ");
		double price = sc.nextDouble();
	

		Product product = new Product(name, price);

		System.out.println("Updated name: "+product.getName());
		//product.setPrice (1200.00);
		System.out.println("Updated name: "+product.getPrice());
		System.out.println();
		System.out.println("product data: " + product);
		System.out.println();
		System.out.println("Enter the number of products to be added in stock ");
		int quantity = sc.nextInt();
		product.addProducts(quantity);

		System.out.println();
		System.out.println("Updated data: " + product);

		System.out.println();
		System.out.println("Enter the number of products to be removed in stock ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);

		System.out.println();
		System.out.println("Updated data: " + product);

		sc.close();

	}
}
