package course;

import java.util.Scanner;

public class exercicio8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		char resposta;
		do {
		System.out.println("Digite um n�mero:");
		double n = sc.nextDouble();
		double sq = Math.sqrt(n);
		System.out.println("Raiz quadrada de "+n+" � "+sq);
		System.out.println("Voc� deseja digitar mais um n�mero");
		resposta = sc.next().charAt(0);
		} while (resposta != 'n');
		sc.close();
		
		
		
	
	
	
	
	
	}}
