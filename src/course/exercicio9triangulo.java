package course;

import java.util.Scanner;

import entities.triangle;

public class exercicio9triangulo {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		triangle x, y;
		
		x = new triangle();
		y = new triangle();
		
		System.out.println("Entre com as dimens�es do tri�ngulo");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		System.out.println("Entre com as dimens�es do tri�ngulo");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		
		double areax = x.area();
		double areay = y.area();
		
		System.out.printf("tri�ngulo x area de = %.4f%n", areax);
		System.out.printf("tri�ngulo y area de = %.4f%n", areay);
		
		if (areax>areay) {
			System.out.println("maior �rea do x");
		}
		else {
			System.out.println("maior �rea do y");
		}
		sc.close();
	}
	
}
