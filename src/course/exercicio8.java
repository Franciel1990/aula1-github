package course;

import java.util.Scanner;

public class exercicio8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		char resposta;
		do {
		System.out.println("Digite um número:");
		double n = sc.nextDouble();
		double sq = Math.sqrt(n);
		System.out.println("Raiz quadrada de "+n+" é "+sq);
		System.out.println("Você deseja digitar mais um número");
		resposta = sc.next().charAt(0);
		} while (resposta != 'n');
		sc.close();
		
		
		
	
	
	
	
	
	}}
