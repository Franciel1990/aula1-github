package course;

import java.util.Scanner;

import entities.triangle;

public class exercicio9triangulo {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		triangle x, y;
		
		x = new triangle();
		y = new triangle();
		
		System.out.println("Entre com as dimensões do triângulo");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		System.out.println("Entre com as dimensões do triângulo");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		
		double areax = x.area();
		double areay = y.area();
		
		System.out.printf("triângulo x area de = %.4f%n", areax);
		System.out.printf("triângulo y area de = %.4f%n", areay);
		
		if (areax>areay) {
			System.out.println("maior área do x");
		}
		else {
			System.out.println("maior área do y");
		}
		sc.close();
	}
	
}
