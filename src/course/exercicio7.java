package course;

import java.util.Scanner;

public class exercicio7 {
	private int N;
	
	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);

	System.out.println("Voc� deve digitar um n�mero positivo!");

	int N = 0;
	
	int valor = sc.nextInt();
	
	while (valor < 0) {
		System.out.println("digite um n�mero positivo");
		valor = sc.nextInt();}
	
	int soma = 0;
	
	
	for(int i = 1; i <= valor; i++) {
		System.out.println("Valor #"+i+": ");
		int x = sc.nextInt();
		soma += x;
		
	}
	System.out.println("Soma � "+soma);

	
	
	
	
	
	
	
	sc.close();
	}
	
}
