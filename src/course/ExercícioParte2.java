package course;

import java.util.Locale;
import java.util.Scanner;

public class Exerc�cioParte2 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double largura = sc.nextDouble();
		double comprimento = sc.nextDouble();
		double area = largura*comprimento;
		double valorMetroTerreno = sc.nextDouble();
		double valorTotal = valorMetroTerreno*area;
		

		System.out.printf("�rea do Terreno �: %.2f%n", area);
		System.out.printf("Valor total do terreno �: %.2f%n", valorTotal);

		sc.close();
	}

	
}
